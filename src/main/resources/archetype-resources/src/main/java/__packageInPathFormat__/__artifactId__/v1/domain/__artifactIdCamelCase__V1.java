package ${package}.${artifactId}.v1.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.util.Map;
import javax.validation.constraints.Size;
import javax.validation.constraints.Max;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}V1 extends BaseEntity {
    
    private static final long serialVersionUID = 1L;

    // Remover atributos e inserir os que serão necessários à aplicação
    @ApiModelProperty(notes = "Exemplo de id em uma classe de domínio", dataType = "Long")
    @Size(max = 10)
    @Max(value = 999999999)
    private Long id;

    private Map<String, String> applicationContent;

    private String applicationCode;

}
