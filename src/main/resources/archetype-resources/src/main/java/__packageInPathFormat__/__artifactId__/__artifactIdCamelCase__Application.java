package ${package}.${artifactId};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.ComponentScan;

import java.util.Collections;

@SpringBootApplication
@ComponentScan({ "${groupId}" })
public class ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}Application.class);
        springApplication.run(args);
    }

}
