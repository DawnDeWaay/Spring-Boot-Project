package dev.dondewaay.contentcalender.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;


// run on start
@Controller
public class DataLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello!");
    }
}
