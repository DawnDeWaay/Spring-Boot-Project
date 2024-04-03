package dev.dondewaay.contentcalender.controller;

import dev.dondewaay.contentcalender.model.Content;
import dev.dondewaay.contentcalender.repository.ContentCollectionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {
    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }

    // make a request and find all the pieces of content in the system
    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }

    // Create Read Update Delete - filter | paging and sorting
    @GetMapping("/{id}")
    public Content findById(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));
    }

    @PostMapping("/{id}")
    public void create(Content content) {
        repository.save(content);
    }
}
