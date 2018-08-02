esocial-esquemas
=========================

Projeto que mapeia o esquema do eSocial a partir dos XSD usando ferrametas do JAXB


Gerando classes
---------
Deve-se gerar as classes para cada versão usando o JAXB. O exemplo abaixo foi feito para a versão `02.02.02`. Para novas versões, mude o número onde for aplicável.

### Exemplo para versão 02.02.02

1. Extrair arquivos XSD de eventos para pasta `src/main/resources/xsd/eventos/v02_02_02`
2. Copiar para mesma pasta o arquivo `xmldsig-core-schema.xsd`
3. A partir da raiz do projeto, executar o comando (observar a versão em dois lugares):   

```shellscript
	DIR=src/main/resources/xsd/eventos/v02_02_02; for i in $(ls $DIR | grep evt); do xjc -nv -d src/main/java -p "br.jus.tst.esocial.esquemas.eventos.v02_02_02.$(basename "$i" .xsd | cut -c4-| tr  "[:upper:]" "[:lower:]")" $DIR/$i; done
```