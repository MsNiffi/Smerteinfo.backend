package org.example;

        import com.fasterxml.jackson.databind.ser.std.MapProperty;
        import org.example.services.ArticleService;
        import org.springframework.boot.ApplicationArguments;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmerteInfoApplication {


    public static void main(String[] args) {
        SpringApplication.run(SmerteInfoApplication.class, args);
    }

}

