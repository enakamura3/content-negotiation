# README

## Dependencia maven

Adicionar a dependência no arquivo pom.xml

```xml
<dependency>
	<groupId>com.fasterxml.jackson.dataformat</groupId>
	<artifactId>jackson-dataformat-xml</artifactId>
</dependency>
```

## Exemplos de chamada:

### GET Method

* Request

```shell
curl -X GET -H 'Content-Type:application/json' -H 'Accept:application/xml' http://localhost:9090/get?id=12
```

* Resposta

```xml
<Response>
    <id>12</id>
    <message>get method called</message>
</Response>
```

* Request

```shell
curl -X GET -H 'Content-Type:application/json' -H 'Accept:application/json' http://localhost:9090/get?id=12
```

* Resposta

```json
{
    "id": 12,
    "message": "get method called"
}
```

### POST Method

* Request

```shell
curl -X POST -H 'Content-Type:application/xml' -H 'Accept:application/xml' -d '<Request><id>6</id><name>world!</name></Request>' http://localhost:9090/post
```

* Response

```xml
<Response>
    <id>6</id>
    <message>Hello world!</message>
</Response>
```

* Request

```shell
curl -X POST -H 'Content-Type:application/xml' -H 'Accept:application/json' -d '<Request><id>6</id><name>world!</name></Request>' http://localhost:9090/post
```

* Response

```json
{
    "id": 6,
    "message": "Hello kakaroto"
}
```