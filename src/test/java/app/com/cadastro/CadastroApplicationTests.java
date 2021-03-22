package app.com.cadastro;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CadastroApplicationTests.class)
@TestPropertySource(locations="classpath:application.properties")
class CadastroApplicationTests {

    @Test
    void contextLoads() {
    }

}
