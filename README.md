# 📚 API de Mangás Japoneses

![Java](https://img.shields.io/badge/Java-17-blue) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green) ![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)

Esta é uma API RESTful desenvolvida em **Java** com **Spring Boot** para gerenciar informações sobre mangás japoneses. Ideal para fãs e colecionadores que desejam organizar e explorar informações de seus títulos favoritos.

---

## ✨ Funcionalidades

- **📜 Listar todos os mangás:** Obtenha uma lista completa de mangás cadastrados.
- **🔍 Buscar por ID:** Encontre detalhes específicos de um mangá pelo seu ID.
- **➕ Adicionar novos mangás:** Cadastre mangás com título, autor, gênero e número de volumes.
- **✏️ Atualizar informações:** Edite os detalhes de qualquer mangá.
- **🗑️ Remover mangás:** Exclua registros de mangás do sistema.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**  
- **Spring Boot 3**  
- **Maven**  

---

## 📂 Estrutura do Projeto

```
📂 src/main/java/com/manga/api
├── MangaApiApplication.java  # Classe principal da aplicação
├── MangaController.java      # Controlador REST da API
└── Manga.java                # Modelo de dados para os mangás
```

---

## 🚀 Como Usar

1. Certifique-se de ter o **Java 17** e **Maven** instalados.
2. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/manga-api.git
   ```
3. Navegue até o diretório do projeto:
   ```bash
   cd manga-api
   ```
4. Execute o projeto com Maven:
   ```bash
   ./mvnw spring-boot:run
   ```
5. Acesse a API em `http://localhost:8080/api/manga`.

---

## 🌐 Endpoints da API

### Listar todos os mangás
**GET** `/api/manga`  
**Exemplo de Resposta:**
```json
[
  {
    "id": 1,
    "title": "Jujutsu Kaisen",
    "author": "Gege Akutami",
    "genre": "Ação, Sobrenatural",
    "volumes": 23
  }
]
```

### Buscar por ID
**GET** `/api/manga/{id}`  
**Parâmetro:** ID do mangá.  
**Exemplo de Resposta:**
```json
{
  "id": 1,
  "title": "Jujutsu Kaisen",
  "author": "Gege Akutami",
  "genre": "Ação, Sobrenatural",
  "volumes": 23
}
```

### Adicionar novo mangá
**POST** `/api/manga`  
**Corpo da Requisição:**
```json
{
  "title": "One Piece",
  "author": "Eiichiro Oda",
  "genre": "Ação, Aventura",
  "volumes": 101
}
```
**Exemplo de Resposta:**
```json
{
  "id": 2,
  "title": "One Piece",
  "author": "Eiichiro Oda",
  "genre": "Ação, Aventura",
  "volumes": 101
}
```

### Atualizar um mangá
**PUT** `/api/manga/{id}`  
**Parâmetro:** ID do mangá.  
**Corpo da Requisição:**
```json
{
  "title": "One Piece",
  "author": "Eiichiro Oda",
  "genre": "Ação, Aventura",
  "volumes": 102
}
```
**Exemplo de Resposta:**
```json
{
  "id": 2,
  "title": "One Piece",
  "author": "Eiichiro Oda",
  "genre": "Ação, Aventura",
  "volumes": 102
}
```

### Remover um mangá
**DELETE** `/api/manga/{id}`  
**Parâmetro:** ID do mangá.  
**Resposta:**
```
Mangá removido com sucesso.
```

---

## 📈 Melhorias Futuras

- 📑 **Paginação e Filtros** na listagem de mangás.
- 🔒 **Autenticação e Autorização** para controle de acesso.
- 💾 **Persistência em Banco de Dados** para armazenamento permanente.
- 📊 **Relatórios Estatísticos** sobre gêneros e autores mais populares.

---

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

1. Fork o projeto.
2. Crie uma branch com sua feature:
   ```bash
   git checkout -b minha-feature
   ```
3. Commit suas alterações:
   ```bash
   git commit -m 'Minha nova feature'
   ```
4. Envie sua branch:
   ```bash
   git push origin minha-feature
   ```
5. Abra um Pull Request.

---

## 🧑‍💻 Desenvolvedor

Feito com ❤️
