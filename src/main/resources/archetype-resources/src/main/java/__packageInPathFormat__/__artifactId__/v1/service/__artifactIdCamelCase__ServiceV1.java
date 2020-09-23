package ${package}.${artifactId}.v1.service;

import org.springframework.stereotype.Service;

import ${package}.${artifactId}.v1.domain.${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1;

import java.util.List;

public interface ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}ServiceV1 {

    public ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1 buscarDados(String parametro);
    
    
    public List<${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1> getAll();


}
