# Microservice Generator

Projeto para gerar microserviços usando spring boot e algumas dependencias legais 

Faça clone do projeto:

```
git clone 
```

Acesse a pasta do projeto:

```
cd microservice-generator
```

Execute:

```
mvn install
```

Após isso, o gerador estará apto a ser executado. Navegue até a pasta onde o novo microserviço será criado e execute:

```
mvn archetype:generate -DarchetypeGroupId=br.com.microservice -DarchetypeArtifactId=spring-boot-microservice-quickstart -DarchetypeVersion=1.0.0 -DgroupId=br.com.emendes -DartifactId=client -Dversion=0.0.1-SNAPSHOT -DinteractiveMode=false -Ddescription='Descrição' -Dprofile=dev -DprojectRepositoryName=myclients
```

Onde:

> - DarchetypeGroupId: Group Id
> - DarchetypeArtifactId: spring-boot-emendes-quickstart 
> - DarchetypeVersion: Versão do ArcheType
> - DgroupId: Pacote base do projeto
> - DartifactId: Nome do projeto
> - Dversion: Versão do projeto
> - DinteractiveMode: false
> - Ddescription: Descrição do projeto
> - DprojectRepositoryName: Qual o nome do repositorio
> - Dprofile: Perfil no qual o projeto será gerado, que pode ser:
>   - dev
>   - hmg
>   - prod

