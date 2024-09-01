package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.mapper.AuthorMapper;
import org.example.persistence.entity.Author;
import org.example.persistence.repo.AuthorRepository;
import org.example.rest.dto.AuthorDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Transactional(readOnly = true)
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @Transactional
    public Author save(AuthorDto authorDto) {
        var author = authorMapper.to(authorDto);
        return authorRepository.save(author);
    }
}
