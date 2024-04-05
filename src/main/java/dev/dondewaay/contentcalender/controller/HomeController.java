package dev.dondewaay.contentcalender.controller;

import dev.dondewaay.contentcalender.config.ContentCalenderProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ContentCalenderProperties properties;

    public HomeController(ContentCalenderProperties properties, ContentCalenderProperties about) {
        this.properties = properties;
    }

    @GetMapping("/")
    public ContentCalenderProperties home() {
        return properties;
    }
}
