package org.example.rest.controller;

import lombok.RequiredArgsConstructor;
import org.example.persistence.entity.Author;
import org.example.rest.dto.AuthorDto;
import org.example.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.example.utils.CommonConstant.Rest.URI.AUTHOR;

@RestController
@RequiredArgsConstructor
@RequestMapping(AUTHOR)
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping
    public List<Author> getAll() {
        return authorService.getAll();
    }

    @PostMapping
    public Author save(@RequestBody AuthorDto authorDto) {
        return authorService.save(authorDto);
    }
}
