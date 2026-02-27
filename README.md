Estoque API
--------------
API REST para gerenciamento de produtos em um sistema de controle de estoque, desenvolvida com Spring Boot seguindo boas práticas de arquitetura em camadas e integração com banco de dados relacional.

 Sobre o Projeto
-----------------
A Estoque API permite realizar operações completas de CRUD (Create, Read, Update, Delete) de produtos, com persistência em banco de dados MySQL e documentação automática via Swagger.

O projeto foi desenvolvido com foco em:

Estrutura profissional de backend

Separação de responsabilidades (Controller, Service, Repository)

Uso de JPA/Hibernate para ORM

Configuração de segurança com Spring Security

Versionamento adequado com Git

 Tecnologias Utilizadas
--------------------------
Java 17+

Spring Boot

Spring Data JPA

Hibernate

MySQL

Maven

Spring Security

SpringDoc OpenAPI (Swagger)

 Arquitetura
-------------------
O projeto segue arquitetura em camadas:

Controller
Responsável por expor os endpoints REST.

Service
Contém as regras de negócio da aplicação.

Repository
Responsável pela comunicação com o banco de dados.

Entity
Representa as entidades mapeadas para o banco via JPA.

 Funcionalidades
------------------
Cadastro de produtos

Listagem de produtos

Busca por ID

Atualização de produtos

Remoção de produtos

Documentação interativa via Swagger

Autenticação básica com Spring Security

 Segurança
---------------
A aplicação utiliza autenticação básica configurada pelo Spring Security.

Usuário padrão gerado automaticamente em ambiente de desenvolvimento.

 Banco de Dados

Banco utilizado: MySQL

A criação das tabelas é automática via:
------------------------
spring.jpa.hibernate.ddl-auto=update
 Documentação da API

A documentação da API é gerada automaticamente com Swagger.

Após iniciar a aplicação, acesse:

http://localhost:8080/swagger-ui/index.html
▶️ Como Executar o Projeto
1️⃣ Clonar o repositório
git clone https://github.com/seuusuario/estoque-api.git
2️⃣ Configurar o banco de dados

Crie um banco no MySQL:

CREATE DATABASE estoqueapi;

Configure o application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/estoqueapi
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
3️⃣ Executar a aplicação

Via Maven:

mvn spring-boot:run

Ou diretamente pela IDE.

A aplicação ficará disponível em:

http://localhost:8080

 Objetivo
-----------------
Este projeto foi desenvolvido com o objetivo de consolidar conhecimentos em desenvolvimento backend com Spring Boot e demonstrar domínio de:

Construção de APIs REST

Persistência de dados com JPA

Integração com banco relacional

Configuração de segurança

Organização de projeto Maven

Versionamento com Git
