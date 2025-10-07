# ⚙️ API RESTful - Controle de Passagem de Plantão 🚀

Esta é a API de *backend* do sistema **Controle de Passagem de Plantão**, responsável por gerenciar o ciclo de vida dos registros de plantão (CRUD: Criar, Ler, Atualizar, Excluir).

O projeto é desenvolvido utilizando as tecnologias mais recentes do ecossistema Java, garantindo performance, segurança e manutenibilidade.

## ✨ Tecnologias & Stack

| Tecnologia | Versão | Descrição |
| :--- | :--- | :--- |
| **Java** | 21 (LTS) | Linguagem principal de desenvolvimento. |
| **Spring Boot** | 3.x | Framework para simplificar a criação de aplicações Spring independentes. |
| **Spring Data JPA** | 3.x | Facilita a implementação de repositórios baseados em JPA/Hibernate. |
| **Banco de Dados** | (Ex: PostgreSQL/H2) | **Definir o DB.** (Configurável via `application.properties`). |
| **Maven** | - | Gerenciador de dependências e construção do projeto. |

---

## 🎯 Funcionalidades da API

A API expõe *endpoints* RESTful para manipular os registros de passagem de plantão:

| Método HTTP | Endpoint | Descrição |
| :--- | :--- | :--- |
| `POST` | `/api/plantao/` | Cria e salva um novo registro de passagem de plantão. |
| `GET` | `/api/plantao/` | Lista todos os registros de plantão existentes. |
| `GET` | `/api/plantao/{id}` | Busca um registro específico pelo seu ID. |
| `DELETE` | `/api/plantao/{id}` | Remove um registro específico pelo seu ID. |

---

## 🛠️ Configuração e Execução (Backend)

Siga os passos abaixo para configurar e iniciar a API em seu ambiente local.

### Pré-requisitos

Certifique-se de ter instalado em sua máquina:

1.  **Java Development Kit (JDK) 21** ou superior.
2.  **Maven** (ou use o wrapper do Maven se disponível).
3.  Uma IDE de sua preferência (IntelliJ IDEA, VS Code com extensões Java, Eclipse).

### 1. Configuração do Banco de Dados

1.  Edite o arquivo `src/main/resources/application.properties` (ou `.yml`).
2.  **Ajuste** as configurações de conexão do banco de dados (URL, usuário, senha) conforme o DB que você estiver utilizando (Ex: PostgreSQL, MySQL, H2).

```properties
# Exemplo para PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/nomedobanco
spring.datasource.username=seuuser
spring.datasource.password=suasenha
spring.jpa.hibernate.ddl-auto=update # Use 'create' para iniciar do zero
