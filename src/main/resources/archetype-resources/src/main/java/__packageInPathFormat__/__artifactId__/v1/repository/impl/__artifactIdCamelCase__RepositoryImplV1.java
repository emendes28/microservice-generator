package ${package}.${artifactId}.v1.repository.impl;
import ${package}.${artifactId}.v1.repository.${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}RepositoryV1;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import ${package}.${artifactId}.exceptions.RecursoNaoEncontradoException;
import ${package}.${artifactId}.util.RedisUtil;
import ${package}.${artifactId}.v1.domain.${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}RepositoryImplV1 implements ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}RepositoryV1 {

    private final RedisUtil redisUtil;

    public ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1 getDados(String key) throws RecursoNaoEncontradoException {
        try {
            //implementar busca dos dados
            return null;
        } catch (RecursoNaoEncontradoException e) {
            log.error("Erro ao buscar os dados");
            throw new RecursoNaoEncontradoException(e.getMessage());
        }
    }

    public List<${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1> findAll() {
        return null; // Implemente o retorno
    };

}
