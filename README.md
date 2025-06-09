# Web Service com Spring Boot e JPA
### Este projeto é um web service RESTful construído com Java, Spring Boot e JPA (Hibernate), desenvolvido como parte do curso de Java do professor Nélio Alves. O sistema simula uma loja virtual com cadastro de usuários, produtos, pedidos e pagamentos, utilizando banco de dados H2 em memória.

## 🚀 Tecnologias utilizadas
- Java

- Spring Boot

- Spring Web

- Spring Data JPA

- H2 Database

- Maven

## 📦 Funcionalidades
O sistema implementa uma API REST com os seguintes recursos:

- Usuários (/users): Cadastro, listagem e consulta de usuários.

- Produtos (/products): Cadastro, listagem e consulta de produtos.

- Categorias (/categories): Associação de produtos com categorias.

- Pedidos (/orders): Registro de pedidos com itens e status.

- Pagamentos: Associação de pagamentos aos pedidos.

## ⚙️ Como executar
1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/webServiceSpringJPA.git
```

2. Navegue até o diretório do projeto:
```bash
cd webServiceSpringJPA
```

3. Execute o projeto com Maven:
```bash
./mvnw spring-boot:run
```

4. Acesse o sistema via navegador ou ferramentas como Postman:

```bash
http://localhost:8080/users
```

## 🧪 Banco de dados de teste
O projeto usa o banco H2 em memória.

Os dados são carregados automaticamente através da classe `TestConfig`.

Você pode acessar o console do H2 em:

```bash
http://localhost:8080/h2-console
```
Use as configurações padrão do H2 `(jdbc:h2:mem:testdb)`.

## 📚 Aprendizados
Este projeto foi fundamental para entender conceitos como:

Criação de APIs REST com Spring Boot

Mapeamento objeto-relacional com JPA

Relacionamentos entre entidades (OneToMany, ManyToOne, etc.)

Tratamento de requisições HTTP

Uso de banco de dados em memória para testes

## 👨‍🏫 Curso
Projeto desenvolvido durante o curso:

### Java COMPLETO Programação Orientada a Objetos + Projetos
### Instrutor: Nélio Alves
### Plataforma: Udemy

### 📌 Sinta-se à vontade para usar este projeto como base para estudos ou novos projetos!
