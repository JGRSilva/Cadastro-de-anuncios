# Cadastro de Anúncios

## Descrição do projeto

Este projeto realiza o cadastro de anúncios e fornece relatórios do valor total investido, quantidade máxima de visualizações, quantidade máxima de cliques e quantidade máxima de compartilhamentos de cada anúncio.

## Status do projeto

Projeto em construção

## Pré-requisitos

Para começar, você precisa instalar na sua máquina o programa abaixo:
1. IDE Java (Visual Studio Code, Eclipse, Netbeans, entre outras)
2. JDK

## Features
    [x] Criação da classe Anuncio.java
    [x] Criação da classe Calculadora.java
    [ ] Manipulação de datas
    [ ] Tratamento de exceções
    [ ] Persistência de dados
    [ ] Separação de camadas
    [ ] Testes unitários

## Como executar o projeto

Ao rodar o projeto será exibido no console um menu com as seguintes opções:
1. Cadastrar anúncio
2. Emitir relatórios
3. Sair

Ao selecionar a opção 1 (Cadastrar anúncio) o programa vai solicitar a inclusão dos seguintes dados:
1. Nome do anúncio
2. Cliente
3. Data de início
4. Data de término
5. Investimento por dia

Obs.: Como falta implementar a leitura e manipulação de datas, entrar com data no formato dd/mm/yyyy.\

Ao inserir o item 5 o programa retorna ao primeiro menu, ao selecionar a opção 2 (Emitir Relatórios) o programa vai exibir uma lista com o valor total investido, quantidade máxima de visualizações, quantidade máxima de cliques e quantidade máxima de compartilhamentos de cada anúncio.\

O primeiro menu será exibido novamente, então você pode optar por sair (opção 3), cadastrar outro anúncio (opção 1) ou emitir os relatórios novamente (opção 2).\

Caso opte por sair (opção 3), o console encerra a execução.\