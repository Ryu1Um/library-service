package org.example.mapper;

import org.example.persistence.entity.Author;
import org.example.persistence.entity.Book;
import org.example.rest.dto.AuthorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.example.utils.CommonConstant.Mapper.Author.*;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface AuthorMapper {

    @Mapping(target = FIRST_NAME, source = DTO_FIRST_NAME)
    @Mapping(target = LAST_NAME, source = DTO_LAST_NAME)
    @Mapping(target = BOOKS, source = BOOKS)
    Author to(AuthorDto authorDto, List<Book> books);

    @Mapping(target = FIRST_NAME, source = DTO_FIRST_NAME)
    @Mapping(target = LAST_NAME, source = DTO_LAST_NAME)
    Author to(AuthorDto authorDto);
}
