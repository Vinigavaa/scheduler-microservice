#Spring Boot Task Scheduler Microservice

##Descrição

##Este projeto é um microserviço desenvolvido com Spring Boot, focado no agendamento de tarefas utilizando o Spring Scheduler. Ele conta com integração ao banco de dados MySQL via Docker, utiliza queries customizadas com Spring Data JPA, implementa relacionamento ManyToOne com anotação @JoinColumn e inclui logs gerenciados pelo SLF4J.

Funcionalidades

Agendamento de tarefas:

Implementado com Spring Scheduler para execução automática de processos periódicos.

Integração com MySQL:

Configuração via Docker para um ambiente de banco de dados padronizado.

Queries customizadas:

Implementação de consultas personalizadas com Spring Data JPA para maior flexibilidade.

Relacionamento ManyToOne:

Modelagem de dados utilizando @JoinColumn para mapear relações entre entidades.

Gerenciamento de logs:

Logs consistentes e organizados utilizando o framework SLF4J.

Tecnologias Utilizadas

Java: Linguagem principal para desenvolvimento.

Spring Boot: Framework para construção do microserviço.

Spring Scheduler

Spring Data JPA

MySQL: Banco de dados relacional.

Docker: Para containerização do banco de dados.

SLF4J: Biblioteca para gerenciamento de logs.

