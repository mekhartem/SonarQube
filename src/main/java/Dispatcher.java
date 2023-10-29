import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication // Noncompliant; RootBootApp is declared in the default package
public class Dispatcher {

    public static void main(String[] args){

    }
}
