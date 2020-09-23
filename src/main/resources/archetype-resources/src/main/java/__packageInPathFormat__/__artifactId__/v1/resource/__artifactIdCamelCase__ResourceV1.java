package ${package}.${artifactId}.v1.resource;

import ${package}.${artifactId}.v1.domain.${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * A Classe abaixo.
 *  { breve descritivo do que faz }
 *  Ex:. Eh uma api restfull
 * Representa:
 * Ex:. O que a classe representa ao negocio
 *
 * @author eu
 */
@RequestMapping("mobile/v1/${projectRepositoryName}")
@Api(value = "${description}", tags = { "${artifactId}" })
public interface ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}ResourceV1 {

    /**
     * Método de exemplo com a documentação do Swagger
     * Remova ou ajuste conforme a necessidade
     */
    @ApiOperation(
        value = "Descreva o objetivo do endpoint",
        notes = "Descreva o retorno",
        protocols = "Http, Https",
        httpMethod = "GET",
        hidden = false,
        response = ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1.class)
    @ApiImplicitParam(name = "Parâmetro passado", dataType = "Tipo do dado do parâmetro", value = "Descrição do parâmetro", required = true)
    @GetMapping("endpoint/{parametro}")
    ResponseEntity nomeDoMetodo(@PathVariable("parametro") Optional<String> parametro);

    /**
     * Método de exemplo
     *
     * @return String 'hello'
     */
    @GetMapping("hello")
    public String hello();

    @GetMapping("getAll")
    public List<${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1> getAll();
}
