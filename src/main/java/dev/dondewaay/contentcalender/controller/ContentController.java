package dev.dondewaay.contentcalender.controller;

import dev.dondewaay.contentcalender.model.Content;
import dev.dondewaay.contentcalender.repository.ContentCollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
    public Optional<Content> findById(@PathVariable Integer id) {
        return repository.findById(id);
    }
}
