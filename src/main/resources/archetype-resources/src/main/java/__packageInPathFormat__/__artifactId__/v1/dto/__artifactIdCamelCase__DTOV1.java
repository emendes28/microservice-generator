package ${package}.${artifactId}.v1.dto;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}DTOV1 {

    private String property1;
    private String property2;

}
