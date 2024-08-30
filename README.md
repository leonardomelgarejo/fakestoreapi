# Projeto de automação de testes da API fakestoreapi

* [Descrição](#Descrição)
* [Pré-requisitos](#Pré-requisitos)
* [Configuração do Ambiente](#Configuração do Ambiente)
* [Estrutura do Projeto](#Estrutura do Projeto)
* [Como executar os testes](#Como executar os testes)
* [Relatório de Testes](#Relatório de Testes)

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
git clone https://github.com/leonardomelgarejo/*.git
```

2 Instale as dependências do Maven:
```
mvn clean install
```

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
│       │            │   ├── BaseTest.java
│       │            │   └── Constantes.java
│       │            ├── pojo
│       │            ├── suite
                     └── tests
│       │                ├── contract
│       │                │   └── ProductContractTest.java
│       │                ├── e2e
│       │                │   └── EndToEndTest.java
│       │                ├── functional
│       │                │   └── ProductTest.java
│       │                └── health
│       │                    └── HealthCheckTest.java
│       └── resources
│           └── allure.properties
├── .gitignore
├── pom.xml
└── README.md
```

## Como executar os testes
```
mvn clean test
```

## Relatório de Testes

* O relatório de testes é gerado pelo framework Allure Reports, de duas formas:
    * Localmente, executando os comando abaixo:
      * mvn allure:serve : Abrirá o relatório HTML no navegador
      * mvn allure:report : Irá gerar o HTML na pasta target/site/allure-maven-plugin
    * O local onde o arquivos arquivos referência para o relatório são definidos no src/test/resources/allure.properties
    * Remotamente, acessando o link abaixo:
      * https://leonardomelgarejo.github.io/barriga-rest/
    
