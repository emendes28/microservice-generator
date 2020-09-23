# ${artifactIdCamelCase}


Descreva aqui seu projeto
Exemplo :

Descrição
Microserviço responsável em realizar o processamento de ${artifactIdCamelCase} 

Etapas:

Consulta de dados no Redis
Gravação da informação no Amazon S3


Tecnologia
Java

Dependências
```md
Nome | Versao | Proposito
:-- | :-: | --:
spring boot  |2.1.4.RELEASE |Framework que resolve boa parte dos cenarios web
:-- | :-: | --:
swagger | 2.9.2 |  Documentacao da API 
:-- | :-: | --:
modelmapper | 2.3.5 | Converte um objeto de dominio em um exposto na API
:-- | :-: | --:
jacoco | 0.8.4 | Cobertura de codigo
:-- | :-: | --:
lombok | 1.18.8 | Lib que ajuda a reduzir boilerplate sem custo a performance
:-- | :-: | --:
embedded redis | 0.6 | redis em memoria para testes
:-- | :-: | --:
mockito core | 2.21.0 | lib de testes unitarios
:-- | :-: | --:
owasp dependency check | 5.2.1 | validacao nas dependencias se estao respeitando fatores de seguranca

Integrações

----

Swagger
http://localhost:8080/swagger-ui.html#/
Esta API sera executada na porta 8080