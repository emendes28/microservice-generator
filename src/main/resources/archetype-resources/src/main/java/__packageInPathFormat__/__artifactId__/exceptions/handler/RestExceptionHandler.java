package ${package}.${artifactId}.exceptions.handler;

import ${package}.${artifactId}.exceptions.ParametroNaoInformadoException;
import ${package}.${artifactId}.exceptions.RecursoNaoEncontradoException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = ParametroNaoInformadoException.class)
    protected ResponseEntity<Object> handleParametroNaoInformadoException(RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(value = RecursoNaoEncontradoException.class)
    protected ResponseEntity<Object> handleRecursoNaoEncontradoException(RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.NO_CONTENT, request);
    }

}
