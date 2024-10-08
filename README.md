# Projeto de automação de testes da API fakestoreapi

[![GHA-CI](https://github.com/leonardomelgarejo/fakestoreapi/actions/workflows/gha-ci.yml/badge.svg)](https://github.com/leonardomelgarejo/fakestoreapi/actions/workflows/gha-ci.yml)

## Descrição

Este é um projeto de estudo sobre automação de testes de APIs Rest usando as ferramentas Rest Assured e JUnit5 com Java

## Pré-requisitos

* [Java JDK 22+](https://www.oracle.com/pt/java/technologies/javase/jdk11-archive-downloads.html)

* [Apache Maven 3.6+](https://maven.apache.org/docs/3.6.0/release-notes.html)

* [JUnit Jupiter API 5.11.0+](https://testng.org/)

* [REST Assured 5.5.0+](https://www.selenium.dev/)

## Configuração do Ambiente

1 Clone o repositório:
```
git clone https://github.com/leonardomelgarejo/fakestoreapi.git
```

2 Instale as dependências do Maven:
```
mvn clean install
```

## Como executar os testes

Você pode executar manualmente cada teste dentro das classes em `src\test\java`, mas o indicado é executar via linha de comando, conforme exemplo abaixo:
```
mvn clean test
```
Complemento: A execução do comando acima, está configurada no POM.xml do projeto para executar a suite de testes `src/test/java/com/fakestoreapi/suite/AllTestsSuite.java`.

## Estrutura do Projeto

```plaintext
├── .github
│   └── workflows
│       └── gha-ci.yml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── fakestoreapi
│   │   └── resources                   
│   └── test
│       ├── java
│       │   └── com
│       │       └── fakestoreapi
│       │            ├── config
│       │            │   ├── Configuration.java
│       │            │   └── ConfigurationManager.java
│       │            ├── pojo
│       │            ├── suite
│       │            │   └── AllTestsSuite.java
│       │            └── tests
│       │                ├── contract
│       │                │   └── ProductContractTest.java
│       │                ├── e2e
│       │                │   └── EndToEndTest.java
│       │                ├── functional
│       │                │   └── ProductTest.java
│       │                ├── health
│       │                │   └── HealthCheckTest.java
│       │                └── BaseTest.java
│       └── resources
│           ├── schemas
│           │   └── products.json
│           ├── allure.properties
│           └── api.properties
├── .gitignore
├── pom.xml
└── README.md
```

## Relatório de Testes

* O relatório de testes é gerado pelo framework Allure Reports, de duas formas:
    * Localmente, executando os comando abaixo:
      * mvn allure:serve : Abrirá o relatório HTML no navegador
      * mvn allure:report : Irá gerar o HTML na pasta target/site/allure-maven-plugin
    * O local onde o arquivos arquivos referência para o relatório são definidos no src/test/resources/allure.properties
    * Remotamente, acessando o link abaixo:
      * https://leonardomelgarejo.github.io/fakestoreapi/
    
