## Sobre a utilização do Pentaho como solução para o Conector eSocial

A equipe de desenvolvimento do eSocial do TST vinha utilizando o *Pentaho* como solução de ETL para recuperar as informações dos sistemas de RH, a fim de atender aos eventos do eSocial. Isso se dava no que chamamos de *Conector* do eSocial, um projeto separado e independente do eSocial-jt que servia apenas para essa finalidade.

O *Pentaho* moustrou-se bastante eficiente e muito rápido nas leituras, com uma vantagem importante que é a eliminação da necessidade de se criar *views, triggers, functions* e outros objetos nos bancos de dados dos sistemas de origem.

Por exemplo, nos testes com o evento S2200, utilizando máquina e ambiente de desenvolvimento, para buscar as informações de pouco mais de 2000 servidores na base do RH e compará-las com o estado atual dos dados no eSocial, são necessários 12 segundos.

Por motivos de distribuição de tarefas entre o TST e os TRT envolvidos em todo o projeto do eSocial, a responsabilidade do *Conector* não está mais com o TST, que suspendeu essa atividade, permanecendo com o desenvolvimento do eSocial-jt.

Entretanto, segue este exemplo para demonstrar como se pode utilizar essa ferramenta de ETL com o objetivo de extrair as informações de interesse do eSocial.

Nesta pasta encontram-se um script para criação de tabelas Oracle e o repósitório de jobs e transformações criadas com o *Pentaho*.
As tabelas são utilizadas para gravar os estados mais recentes dos eventos enviados com sucesso para o *esocial-gov*. No ponto em que paramos, estão implementados apenas os eventos iniciais de tabelas (exceto o S1050, S1060 e S1080).

## Download e configuração do Pentaho para utilização no projeto do conector do eSocial-jt

O *Pentaho* é uma suíte com vários programas, como o *data-integration*, *server*, *report* e outros. São todos portáveis, não necessitando instalação. A prática comum é que se crie o diretório de nome *pentaho* para conter as aplicações.

O *Pentaho* é disponibilizado nas versões *enterprise* e *community*, sendo esta última a que utilizamos.

Para trabalharmos localmente com nosso ETL, o *data-integration* é suficiente, e este pode ser obtido em https://sourceforge.net/projects/pentaho/ . O arquivo  tem um nome semelhante a pdi-ce-8.x.zip e a sua descompactação criará o diretório “data-integration”.

A interface do **Pentaho Data Integration** chama-se **Spoon** e o script para abrí-lo é o pentaho/data-integration/spoon.sh para o Linux ou o pentaho/data-integration/spoon.bat para o Windows.

Antes de utilizá-lo é necessário configurar o seguinte:

* Criar as seguintes variáveis de ambiente do sistema:</br>

	* PENTAHO_JAVA_HOME : caminho do java. Ex.: /usr/lib/jvm/java-8-oracle</br>

	* KETTLE_HOME : caminho onde se deseja que o pentaho crie o diretório “.kettle” (se não existir essa variável, o Pentaho criará o diretório na pasta do usuário). 

*  Copiar o driver do oracle (ojdbc6_g.jar), ou o driver/conector do SGBD que se deseja utilizar, para o diretório pentaho/data-integration/lib

* Criar datasources para suas conexões. A forma de registrá-los no Pentaho é informando-os no arquivo **data-integration/simple-jndi/jdbc.properties**. Pode-se criar diversos datasources apontando para diferentes bancos. 
  
  * Abaixo estão 2 datasources, correspondendo a  2 bancos diferentes. A orientação é que não se deve ter linhas em branco e nem espaços ao final de qualquer linha.
  
  > rh_datasource_des/type=javax.sql.DataSource</br>
  > rh_datasource_des/driver=oracle.jdbc.driver.OracleDriver</br>
  > rh_datasource_des/url=jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=host-database)(PORT = 1521)))(CONNECT_DATA=(SERVICE_NAME=dbdes)))</br>
  > rh_datasource_des/user=C7_USUARIO</br>
  > rh_datasource_des/password=senha</br>
  > c7_datasource_des/type=javax.sql.DataSource</br>
  > c7_datasource_des/driver=oracle.jdbc.driver.OracleDriver</br>
  > c7_datasource_des/url=jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=host-database)(PORT = 1521)))(CONNECT_DATA=(SERVICE_NAME=dbdes)))</br>
  > c7_datasource_des/user=C7_USUARIO</br>
  > c7_datasource_des/password=senha</br>

  
 - Abrir o *Spoon* e importar o projeto. Para isso, vá em Connect (botão no canto superior direito) e, na janela que se abre, Other Repositories > File Repository > Get Started. Escreva um nome à sua escolha para o *Display Name* e em *Location* escolha o diretório “repositorio”, correspondendo ao diretório que foi criado quando o arquivo *repositorio.zip* foi descompactado. Opcionalmente, escreva uma descrição e marque *Launch connection on startup*.

 - Criar variáveis de ambiente para os datasources. Vá no menu Edit > Edit the ketle.properties file e insira as novas variáveis de ambiente abaixo, conforme os datasources definidos anteriormente. Para inserir uma nova variável, selecione a última linha e pressione Tecla para baixo. O exemplo abaixo permite configurar as conexões para diferentes bancos de dados.

    >rh_datasource = rh_datasource_des</br>
    >c7_datasource = c7_datasource_des

 - Ainda no kettle.properties, crie a seguinte variável:</br>
     * esocial_jt_uri_app = http://localhost:8080/esocial-jt-service </br>
   obs.: essa uri é utilizada pela transformação “enviar_esocial_jt”

### Troubleshooting

No Linux, se ao abrir o *Spoon* e no canto superior direito for selecionado *Repository Manager*, pode aparecer uma *stacktrace* por causa da falta de uma biblioteca. Isso pode ser resolvido com o comando (para distribuições baseadas em Debian):

  sudo apt-get install libwebkitgtk-1.0-0

### Repositório

Dentro do *Spoon*, selecione Tools -> Repository -> Explore.
Na aba *Browse* temos as *transformations* e *jobs* que são os objetos de ETL do projeto, organizados em subdiretórios.
Na aba *Connections* temos as conexões **Conn_RH** e **Conn_C7. Entre no modo de edição de uma delas e observe que o JNDI Name é a constante definida no arquivo *kettle.properties*, cujo valor é o nome da conexão informada no arquivo *pentaho/data-integration/simple-jndi/jdbc.properties*, de onde o *Spoon* busca os parâmetros de conexão em tempo de execução.

Nas transformações, utiliza-se um fluxo de dados que vem do RH e outro que busca as informações que foram enviadas com sucesso para o eSocial (utilizamos aqui o prefixo C7), e que convergem no *step Merge Rows (diff)*, onde os dados são comparados e onde é decidido pelo Pentaho o que é informação nova, alterada ou excluída *(flagfield)*.

Os *steps* seguintes são:

* **filtrar_identicos** (subtransformação): elimina do fluxo tudo que é idêntico em ambas fontes de dados
* **ide_empregador** (subtransformação): insere no fluxo as informações de identificação do empregador
* **map_operacao**: insere no fluxo o tipo da operação (inclusão, exclusão ou alteração) da ocorrência, com base no flagfield
* **criar_json**: cria o json com os campos da ocorrência a ser enviada para o esocial-jt-service
* **enviar_esocial_jt** (subtransformação): faz a chamada REST com post do json para o esocial-jt-service
* **merge**: grava as informações No esquema C7, somente se o step anterior retornar com status 200

Obs. Os steps de subtransformação correspondem às transformações que estão no diretório *comum* do repositório.
