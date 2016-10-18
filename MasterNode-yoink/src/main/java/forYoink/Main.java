package forYoink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

/**
 * Created by christian on 18/10/2016.
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) throws IOException{

        ApplicationContext context = SpringApplication.run(Main.class, args);
    }
}
