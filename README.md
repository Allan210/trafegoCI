# Trafegos API Java

Aplicação API de trafegos

## Pré-requisitos

- Java 21
- Git
- Docker
- vs
- DBeaver(ou algum outro app que comporte o mysql)
- Insomnia

## Build e execução

```sh
docker container run --name mysql-ms -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234 -d mysql:latest
```


## Testes unitários (validação)

./mvnw 

## Documentação online (OpenAPI)

Navegador Padrão
http://localhost:8080/trafegos
http://localhost:8080/trafegos/{numero}
