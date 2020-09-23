package ${package}.${artifactId}.exceptions;

import java.io.Serializable;

public class RecursoNaoEncontradoException extends RuntimeException implements Serializable {

    public RecursoNaoEncontradoException(String message) {
        super(message);
    }

}
