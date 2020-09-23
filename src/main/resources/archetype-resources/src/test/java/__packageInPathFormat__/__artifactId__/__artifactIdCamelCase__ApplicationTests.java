package ${package}.${artifactId};

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}ApplicationTests {

    @Test
    public void contextLoads() {

    }

}
