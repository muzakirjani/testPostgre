package com.example.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.model.Author;
import com.example.repository.AuthorRepository;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorRepository repository;

    public AuthorController(AuthorRepository repository) {
        this.repository = repository;
    }

    // CREATE (POST)
    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return repository.save(author);
    }

    // READ (GET ALL)
    @GetMapping
    public List<Author> getAllAuthors() {
        return repository.findAll();
    }
}