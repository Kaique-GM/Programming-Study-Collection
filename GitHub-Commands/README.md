
# 📝 Dicas de Comandos Git e GitHub

## 📋 Sumário
<!--ts-->
- [Configuração Inicial](#configuração-inicial)
- [Comandos de Navegação](#comandos-de-navegação)
- [Principais Comandos do Git](#principais-comandos-do-git)
- [Comandos de Branch](#comandos-de-branch)
- [Tags](#tags)
<!--te-->

---

## 📌 Configuração Inicial

### Definir nome de usuário

```bash
git config --global user.name "Seu Nome"
Definir email do usuário
````

```bash
git config --global user.email "seu-email@example.com"
````

## 📂 Comandos de Navegação

### Listar pastas criadas

```bash
ls
````

###Entrar na pasta do projeto

```bash
cd <nome-da-pasta>
````

## 🚀 Principais Comandos do Git

###Clonar Repositório

```bash
git clone -b <branch> <remote_repo>
````

###Inicializar o repositório
```bash
git init
````

###Verificar status dos arquivos
```bash
git status
````

###Verificar repositório remoto
```bash
git remote -v
````

###Caso o diretório remoto não esteja configurado, adicione-o:
```bash
git remote add origin <link-do-repositório>
````

###Puxar atualizações do repositório remoto
```bash
git pull origin main
````

###Adicionar arquivos ao Staging
```bash
git add .
````

###Realizar commit
```bash
git commit -m "Descrição da alteração"
````

###Enviar atualizações para o repositório remoto
```bash
git push origin main
````

###Renomear branch principal para main
```bash
git branch -M main
````

###Resolver conflitos de histórico não relacionados
```bash
git pull origin main --allow-unrelated-histories
````

##🌿 Comandos de Branch

###Criar uma nova branch
```bash
git checkout -b <nome-da-branch>
````

###Alterar para a branch main
```bash
git checkout main
````

###Enviar commits para uma nova branch
```bash
git push origin <nome-da-branch>
````

###Fazer merge com outra branch
```bash
git merge <nome-da-branch>
````

##🏷️ Tags
###Criar uma nova tag
```bash
git tag -a <nome-da-tag> -m "Descrição da tag"
````
###Enviar tags para o repositório remoto
```bash
git push origin --tags
````
