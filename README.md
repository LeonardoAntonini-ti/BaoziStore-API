# API REST - Baozi Store 🥟

[cite_start]Este projeto consiste em uma API REST desenvolvida como Atividade Prática para a disciplina de **Desenvolvimento Web Back-End**[cite: 5, 11]. [cite_start]O objetivo é gerenciar o controle básico de uma loja de pães chineses, abrangendo clientes, produtos e pedidos[cite: 21, 22].

## 📝 Descrição do Estudo de Caso
[cite_start]A **Baozi Store** é um negócio local que comercializa pãezinhos chineses[cite: 21]. [cite_start]Para informatizar sua operação, a API permite cadastrar clientes, produtos e registrar pedidos simples, onde um cliente adquire uma determinada quantidade de um único produto[cite: 24, 25, 26, 27].

## 👤 Identificação do Aluno
* **Nome:** Leonardo Godinho Antonini
* **RU:** 4973328
* [cite_start]**Instituição:** Centro Universitário Internacional UNINTER [cite: 1, 2, 3]

## 🚀 Tecnologias e Requisitos Técnicos
[cite_start]A aplicação foi construída utilizando as seguintes tecnologias obrigatórias[cite: 144, 145, 146, 147, 148]:
* [cite_start]**Linguagem:** Java [cite: 145]
* [cite_start]**Framework:** Spring Boot [cite: 146]
* [cite_start]**Persistência de Dados:** Spring Data JPA [cite: 147]
* [cite_start]**Banco de Dados:** MySQL [cite: 148]
* [cite_start]**Padrão Arquitetural:** MVC (Model-View-Controller) [cite: 150]
* [cite_start]**Formato de Comunicação:** JSON [cite: 149]

## 🏗️ Estrutura do Projeto
[cite_start]O projeto está organizado conforme a arquitetura mínima exigida[cite: 151]:
* [cite_start]`package model`: Classes que representam as entidades do banco de dados (Cliente, Produto, Pedido)[cite: 152].
* [cite_start]`package repository`: Interfaces para operações de persistência via JPA[cite: 153].
* [cite_start]`package controller`: Camada responsável por expor os endpoints e gerenciar as requisições HTTP[cite: 154].

## 🛠️ Endpoints da API
[cite_start]Conforme o padrão REST, cada entidade obrigatória possui os seguintes endpoints implementados[cite: 84, 85]:
* [cite_start]**POST**: Criar novo registro[cite: 86].
* [cite_start]**GET /{id}**: Consultar registro por ID[cite: 87].
* [cite_start]**GET**: Listar todos os registros[cite: 88].
* [cite_start]**DELETE /{id}**: Apagar um registro[cite: 89].

## 📊 Diagrama de Caso de Uso
O sistema conta com um diagrama UML representando as funcionalidades de CRUD para as entidades Cliente, Produto e Pedido, interagindo com o ator principal (Usuário da API).
