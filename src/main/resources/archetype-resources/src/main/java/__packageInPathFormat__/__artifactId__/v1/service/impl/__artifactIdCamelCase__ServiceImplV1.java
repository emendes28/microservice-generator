package ${package}.${artifactId}.v1.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import ${package}.${artifactId}.v1.repository.${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}RepositoryV1;
import ${package}.${artifactId}.v1.domain.${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}ServiceImplV1 implements ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}ServiceV1 {

    private final ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}RepositoryV1 ${artifactId.substring(0,1).toLowerCase()}${artifactId.substring(1)}Repository;

    public ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1 buscarDados(String parametro) {

        ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1 dados = ${artifactId.substring(0,1).toLowerCase()}${artifactId.substring(1)}Repository.getDados(parametro);
        return dados;

    }

    public List<${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1> getAll() {
      return ${artifactId.substring(0,1).toLowerCase()}${artifactId.substring(1)}Repository.findAll();
    }


}
