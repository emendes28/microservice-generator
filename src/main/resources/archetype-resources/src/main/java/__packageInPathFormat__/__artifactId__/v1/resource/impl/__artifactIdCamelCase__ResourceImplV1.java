package ${package}.${artifactId}.v1.resource.impl;

import ${package}.${artifactId}.exceptions.ParametroNaoInformadoException;
import ${package}.${artifactId}.v1.service.${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}ServiceV1;
import ${package}.${artifactId}.v1.resource.${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}ResourceV1;
import ${package}.${artifactId}.v1.domain.${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
public class ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}ResourceImplV1 implements ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}ResourceV1 {

    private final ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}ServiceV1 ${artifactId.substring(0,1).toLowerCase()}${artifactId.substring(1)}Service;

    public ResponseEntity nomeDoMetodo(@PathVariable("parametro") Optional<String> parametro) {

        ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1 retorno = ${artifactId.substring(0,1).toLowerCase()}${artifactId.substring(1)}Service.buscarDados(
            parametro.orElseThrow(() -> new ParametroNaoInformadoException("O parâmetro não foi informado na requisição"))
        );

        return ResponseEntity
            .status(HttpStatus.OK)
            .body(retorno);

    }

    @Override
    public String hello() {
        return "Hello!";
    }

    @Override
    public List<${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1> getAll() {
        return ${artifactId.substring(0,1).toLowerCase()}${artifactId.substring(1)}Service.getAll();
    }

}
