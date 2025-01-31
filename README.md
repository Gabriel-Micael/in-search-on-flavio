# Motor de busca com ElasticSearch e SpringBoot - InSearchOn

InSearchOn é um motor de busca criado usando Java (SpringBoot), Elastic Search, JS, HTML e CSS que busca em uma base de dados local da Wikipédia e retorna os resultados pertinetes, conseguindo filtrar por:
-Relevância;
-Tempo de Leitura;
-Alfabética;
-Intevalo de páginas
-Ordem crescente ou decrescente de todas os outros filtros;

**Recursos requiridos**:
-JDK 19+
-NodeJS
-Docker
-Banco de dados local do wikipédia
-Elastic

**Como usar**:
Baixe os arquivos necessários para o Docker e o Banco de Dados pelo link abaixo:
https://www.mediafire.com/file/cuymaxvnf23cg8t/BD_e_Docker_Elastic.zip/file

Depois de ter instalado o ElasticSearch ( https://www.elastic.co/downloads/past-releases/elasticsearch-8-12-2 ) e o Docker ( https://www.docker.com ) você deve iniciar o container no Docker:
-Extraia a pasta "BD_e_Docker_Elastic.zip"
-Entre na pasta "BD_e_Docker_Elastic\Docker" e execute o comando: "docker compose up -d"

Depois vá até a pasta "Wikipédia" e execute o comando:

**WINDOWS**
* Codificar o usuário e a senha em Base64
$username = "elastic"
$password = "user123"
$encodedAuth = [Convert]::ToBase64String([Text.Encoding]::ASCII.GetBytes("${username}:${password}"))

* Definir os cabeçalhos com a autenticação básica
$headers = @{
    "Content-Type" = "application/x-ndjson"
    "Authorization" = "Basic $encodedAuth"
}

* Executar a requisição
Invoke-WebRequest -Uri "https://localhost:9200/wikipedia/_bulk" `
                  -Method Post `
                  -Headers $headers `
                  -InFile "wiki.json" `
                  -UseBasicParsing

**LINUX**

curl -H "Content-Type: application/x-ndjson" -XPOST https://localhost:9200/wikipedia/_bulk --data-binary "@wiki.json" --user "elastic:user123" --insecure


Em seguida execute o arquivo "SearchApplication.java" no diretório "...\in-search-on-flavio-main\in-search-on-flavio-main\InSearchOn(back)\src\main\java\com\elasticsearch\search"
e depois execute o comando "npm start" no diretório "...\in-search-on-flavio-main\in-search-on-flavio-main\InSearchOn(front)\src"

*Para acessar a página de busca, vá até o navegador e digite "localhost:1234" na URL*
