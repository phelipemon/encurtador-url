<h2 align="center">
  Encurtador de URL
</h2>

Resolução do desafio proposto pelo repositorio Backend Brasil, confira detalhes [neste link](https://github.com/backend-br/desafios/blob/master/url-shortener/PROBLEM.md).

Serviço que permite encurtar URLs longas para torná-las mais compactas e fáceis de compartilhar.


## ☕ Tecnologias utilizadas

* Java
* Spring Boot
* JPA
* Hibernate
* PostgreSQL (Local)


## Exemplo

O serviço recebe uma chamada para encurtar uma URL.

**[POST]** `/encurta-url`

```json
{
    "urlOriginal": "https://github.com/backend-br/desafios/blob/master/url-shortener/PROBLEM.md"

}
```

E retorna um JSON com a URL encurtada:

```json
{
    "url": "https://xxx.com/r/mB4Shl"
}
```

## Instalação

### Pré requisitos

* Postman/Insomnia/Google Chrome ( Para testar os endpoints ) 

* IDE que rode Java (Eclipse, Intellij...) 

* Postgres (Caso queira utilizar Railway deve alterar as configurações no arquivo application.properties)

### Instalação

1. Pegue o link do repositório https://github.com/phelipemon/encurtador-url.git
2. Clone o repositório
   ```sh
   git clone https://github.com/phelipemon/encurtador-url.git
   ```
3. Abra o projeto na sua IDE

4. Crie o banco de dados necessário para a aplicação  (Postgres [local] ou Railway)

5. Configure o arquivo application.properties alterando os campos url, username e password para suas váriaveis de ambiente ou respectivos nomes atribuídos na criação do seu banco de dados, quando o projeto for executado ele se encarregará de criar a tabela e suas colunas no banco de dados

6. Na IDE execute o arquivo EncurtadorUrlApplication

7. No postman teste os endpoins no localhost:8080

Chamada para encurtar a URL:

**[POST]** `http://localhost:8080/encurta-url`

```
    Exemplo de JSON :
    {
      "urlOriginal": "https://github.com/phelipemon"
    }
 ```
Retorno de um JSON com a URL encurtada:

   ```JS
   {
      "id": 17,
      "urlLong": "https://github.com/phelipemon",
      "urlShortened": "http://localhost:8080/r/zxoL4",
      "urlQrCode": "QR CODE INDISPONÍVEL NO MOMENTO",
      "urlCreatedIn": "2024-07-24T13:47:33.4690815"
   }
   ```


## Contato


<p>Feito por <b>Phelipe Reis</b>  :octocat: | - phel.dev@gmail.com

<a href="https://www.linkedin.com/in/phelipe-reis-3a11011a7/">Entre em contato</a></p>
