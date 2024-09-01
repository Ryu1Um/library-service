package org.example.rest.controller;

import lombok.RequiredArgsConstructor;
import org.example.persistence.entity.Book;
import org.example.rest.dto.BookDto;
import org.example.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.example.utils.CommonConstant.Rest.URI.ALL;
import static org.example.utils.CommonConstant.Rest.URI.BOOK;

@RestController
@RequiredArgsConstructor
@RequestMapping(BOOK)
public class BookController {

    private final BookService bookService;

    @GetMapping(ALL)
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping
    public Book getById(@RequestParam Long id) {
        return bookService.getById(id);
    }

    @PostMapping
    public Book save(@RequestBody BookDto bookDto) {
        return bookService.save(bookDto);
    }
}
