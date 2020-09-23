package ${package}.${artifactId}.v1.repository;

import ${package}.${artifactId}.exceptions.RecursoNaoEncontradoException;
import ${package}.${artifactId}.v1.domain.${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1;

import java.util.List;

public interface ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}RepositoryV1 {

   
    public ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1 getDados(String key) throws RecursoNaoEncontradoException;

    public List<${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1> findAll();

}
