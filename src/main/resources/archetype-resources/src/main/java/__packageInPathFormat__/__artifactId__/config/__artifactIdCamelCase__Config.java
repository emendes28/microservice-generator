package ${package}.${artifactId}.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}Config {

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
