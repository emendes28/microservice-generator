package ${package}.${artifactId}.exceptions;

import java.io.Serializable;

public class ParametroNaoInformadoException extends RuntimeException implements Serializable {

    public ParametroNaoInformadoException(String message) {
        super(message);
    }

}
