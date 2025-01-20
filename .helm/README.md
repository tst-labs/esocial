- [Dependências](#dependências)
- [Instalação das dependências](#instalação-das-dependências)
  - [Helm charts](#helm-charts)
  - [GO lang](#go-lang)
  - [SOPS](#sops)
  - [Age file encription](#age-file-encription)
- [Passos](#passos)


# Dependências

- [Helm charts](https://helm.sh)
- [Go lang](https://go.dev/doc/install)
- [SOPS](https://github.com/getsops/sops)
- [Age file encription](https://github.com/FiloSottile/age)

# Instalação das dependências

## Helm charts

```bash
curl https://raw.githubusercontent.com/helm/helm/master/scripts/get-helm-3 | bash
```

## GO lang

```bash
sudo apt update && sudo apt install build-essential -y
sudo add-apt-repository ppa:longsleep/golang-backports
sudo apt update && sudo apt install golang-go
go version
```

## SOPS

```bash
curl -LO https://github.com/getsops/sops/releases/download/v3.9.2/sops-v3.9.2.linux.amd64
sudo mv sops-v3.9.2.linux.amd64 /usr/local/bin/sops
chmod +x /usr/local/bin/sops
```

## Age file encription

```bash
go install filippo.io/age/cmd/...@latest
```

# Passos

```bash
# 1) Criação e configuração do projeto
helm create esocial-jt

# 2) Adicionar o repositório padrão e atualiza o repositório
helm repo add stable https://charts.helm.sh/stable && \
  helm repo update

# Lista os repositórios adicionados (opcional)
helm repo list

# 3) Acessa o projeto 
# Será necessário logar no Openshift 4 e pegar o comando para login via terminal
# Obs.: Após o login, é gerado um arquivo na pasta ~/.kube/config onde o Helm usa o Contexto Atual do Kubeconfig para determinar a configuração de conexão com o cluster.
oc login --token=<TOKEN_OC4> --server=<OC_URL>

# Acessa o projeto (namespace)
oc project esocial-stage

# 4) Encriptar yaml secrets
```bash
rm -f key.txt && \
age-keygen -o key.txt && \
AGE_PUBLIC_KEY=$(grep "public key:" key.txt | awk '{print $4}') && \
echo "Chave pública gerada: $AGE_PUBLIC_KEY" && \
sops -e -i --age "$AGE_PUBLIC_KEY" ./.helm/secrets.stage.yaml && \
sops -e -i --age "$AGE_PUBLIC_KEY" ./.helm/secrets.production.yaml && \
echo "Criptografia concluída!"

## 5) Decriptar yaml secrets (opcional)
# Caso queira decriptar para editar os valores
export SOPS_AGE_KEY=<CHAVE-PRIVADA> && \
    sops -d ./.helm/secrets.stage.yaml

## 6) Verifica se os templates estão ok
helm lint .helm

## 7) Instalar o ambiente no Openshift
# Ambiente de desenvolvimento:
oc login --token=<LOGIN_TOKEN_OPENSHIFT> --server=https://api.ocp4bm2.tjdft.jus.br:6443
oc project esocialjt-stage
OPENSHIFT_PROJECT=esocialjt
ENVIRONMENT=stage
CI_COMMIT_SHA=teste
SOPS_AGE_KEY=${SOPS_AGE_KEY} sops -d .helm/secrets.${ENVIRONMENT}.yaml | helm upgrade --install $OPENSHIFT_PROJECT .helm/ -f .helm/values.${ENVIRONMENT}.yaml --values - --set environment=${ENVIRONMENT} --set commitHash=${CI_COMMIT_SHA}

# Ambiente de desenvolvimento (testes):
oc login --token=<LOGIN_TOKEN_OPENSHIFT> --server=https://api.ocp4bm2.tjdft.jus.br:6443
oc project esocialjttestes-stage
OPENSHIFT_PROJECT=esocialjttestes
ENVIRONMENT=testes
CI_COMMIT_SHA=teste
SOPS_AGE_KEY=${SOPS_AGE_KEY} sops -d .helm/secrets.${ENVIRONMENT}.yaml | helm upgrade --install $OPENSHIFT_PROJECT .helm/ -f .helm/values.${ENVIRONMENT}.yaml --values - --set environment=${ENVIRONMENT} --set commitHash=${CI_COMMIT_SHA}

# Ambiente de produção:
oc login --token=<LOGIN_TOKEN_OPENSHIFT> --server=https://api.ocp4bm1.tjdft.jus.br:6443
oc project esocialjt-production
OPENSHIFT_PROJECT=esocialjt
ENVIRONMENT=production
CI_COMMIT_SHA=teste
SOPS_AGE_KEY=AGE-SECRET-KEY-158Y3VM5YHEWY5T4M44X96QT753TG35YS0C85PPJNXHWTV4CDXGFQ5L90MV sops -d .helm/secrets.${ENVIRONMENT}.yaml | helm upgrade --install $OPENSHIFT_PROJECT .helm/ -f .helm/values.${ENVIRONMENT}.yaml --values - --set environment=${ENVIRONMENT} --set commitHash=${CI_COMMIT_SHA}

## 8) Remover o helm
helm uninstall esocialjt
```
