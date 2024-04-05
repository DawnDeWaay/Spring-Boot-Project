package dev.dondewaay.contentcalender;

import dev.dondewaay.contentcalender.model.Content;
import dev.dondewaay.contentcalender.model.Status;
import dev.dondewaay.contentcalender.model.Type;
import dev.dondewaay.contentcalender.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ContentRepository repository) {
        return args -> {
            // Good place to insert data into database
            Content content = new Content(
                    null,
                    "Something Else",
                    "Wah",
                    Status.IDEA,
                    Type.VIDEO,
                    LocalDateTime.now(),
                    null,
                    "");
            repository.save(content);
        };
    }
}