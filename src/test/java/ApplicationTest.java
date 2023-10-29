
import io.github.glytching.junit.extension.random.Random;
import io.github.glytching.junit.extension.random.RandomBeansExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import service.SonarQubeImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith({MockitoExtension.class, RandomBeansExtension.class})
public class ApplicationTest {

    @InjectMocks
    SonarQubeImpl sonarQube;

    @Test
    void testByEnv_Successful(@Random String env){

        var result = sonarQube.testByEnv(env);

        assertEquals("VALID", result.message());
    }

}
