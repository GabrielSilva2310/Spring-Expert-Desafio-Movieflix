# Java Spring Expert Desafio Movieflix  


# Sobre o projeto
Este projeto é o desafio do capítulo sobre Casos de uso, signup, finalização do Curso Java Spring Expert da [DevSuperior](https://devsuperior.com.br "Site da DevSuperior").
O desafio consiste em implementar as funcionalidades necessárias para que os testes passem.


## Especificações e Modelo Conceitual
Este é um sistema de listagem de filmes e genêros em que o usuário pode avaliar os filmes:
![Modelo Conceitual](https://github.com/GabrielSilva2310/Assets/blob/main/Images%20Java%20Spring%20Expert/Modelo%20Conceitual.png)

Casos de uso:

Listar filmes

1.[OUT] O sistema apresenta uma listagem dos nomes de todos gêneros, bem como uma listagem paginada com título, subtítulo, ano e imagem dos filmes, ordenada alfabeticamente por título.

2.[IN] O usuário visitante ou membro seleciona, opcionalmente, um gênero.

3.[OUT] O sistema apresenta a listagem atualizada, restringindo somente ao gênero selecionado.

Visualizar detalhes do filme
1.[IN] O usuário visitante ou membro seleciona um filme

2.[OUT] O sistema informa título, subtítulo, ano, imagem e sinopse do filme, e também uma listagem dos textos das avaliações daquele filme juntamente com nome do usuário que fez cada avaliação.

3.[IN] O usuário membro informa, opcionalmente, um texto para avaliação do filme.

4.[OUT] O sistema apresenta os dados atualizados, já aparecendo também a avaliação feita pelo usuário.

Exceção 3.1 - Texto vazio
3.1.1. O sistema apresenta uma mensagem de que não é permitido texto vazio na avaliação 


# Tecnologias utilizadas
- Java 17
- Spring Boot 3
- Maven
- JPA / Hibernate
- H2 Database
- JUnit 5
- Postman

# Postman Collection
  Para testar a API, você pode usar a coleção do Postman disponível no link abaixo:
  
  [Download](https://github.com/GabrielSilva2310/Assets/blob/main/Postman%20Collections%20and%20Enviroments/Spring%20Expert/Desafio%20MovieFlix/Desafio%20Movieflix%20casos%20de%20uso.postman_collection%20(1).json)

# Como executar o projeto

Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/GabrielSilva2310/Spring-Expert-Desafio-Movieflix.git
```
Importar Projeto para uma IDE de sua escolha , e executar o JUnit nas classes MovietControllerIT.java, GenreControllerIT.java e ReviewControllerIT.java

Use o Postman para fazer as requisições e verificar se os resultados correspondem aos testes.

# Competências avaliadas no desafio
- Desenvolvimento TDD de API Rest com Java e Spring Boot
- Realização de casos de uso
- Consultas a banco de dados relacional com Spring Data JPA
- Tratamento de erros com respostas HTTP customizadas
- Controle de acesso por perfil de usuário e rotas

# Autor

Gabriel Da Silva 

www.linkedin.com/in/gabriel-da-silva-457039193
