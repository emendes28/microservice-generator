#!/usr/bin/python
import subprocess
import os

print('*****Gerador de microserviço******')
folder_projetos = input('Qual a sua pasta de projetos ? ex: /home/{seuUsuario}/projetos ')
artifact_id = input('Qual domain do projeto (classes)? ex: cliente ')

project_repository_name = input('Qual o nome do projeto (git)? clientes ')

try:
    subprocess.call("cd "+folder_projetos, shell=True)
except subprocess.CalledProcessError as e:
    subprocess.call("mkdir "+folder_projetos+" && cd  "+folder_projetos,shell=True )

subprocess.call("mvn archetype:generate -DarchetypeGroupId=br.com.emendes -DarchetypeArtifactId=spring-boot-emendes-quickstart -DarchetypeVersion=1.0.0 -DgroupId=br.com.emendes -DartifactId="+ artifact_id +" -Dversion=0.0.1-SNAPSHOT -DinteractiveMode=false -DprojectRepositoryName='"+ project_repository_name +"'",shell=True)
subprocess.call("git init",shell=True)
