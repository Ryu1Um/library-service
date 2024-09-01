package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.mapper.BookMapper;
import org.example.persistence.entity.Book;
import org.example.persistence.repo.AuthorRepository;
import org.example.persistence.repo.BookRepository;
import org.example.rest.dto.BookDto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final BookMapper bookMapper;

    @Cacheable(value = "allBooks")
    @Transactional(readOnly = true)
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Cacheable(value = "bookById", key = "#id")
    @Transactional(readOnly = true)
    public Book getById(Long id) {
        return bookRepository.findById(id).orElseThrow();
    }

    @Transactional
    public Book save(BookDto bookDto) {
        var authorDto = bookDto.getAuthor();
        var author = authorRepository.findByFirstNameAndLastName(authorDto.getFirstName(), authorDto.getLastName());
        if (Objects.nonNull(author)) {
            return bookRepository.save(bookMapper.to(bookDto, author));
        }
        return null;
    }
}
