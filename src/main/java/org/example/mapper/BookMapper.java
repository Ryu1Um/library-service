package org.example.mapper;

import org.example.persistence.entity.Author;
import org.example.persistence.entity.Book;
import org.example.rest.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.example.utils.CommonConstant.Mapper.Book.*;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface BookMapper {

    @Mapping(target = ID, ignore = true)
    @Mapping(target = NAME, source = DTO_NAME)
    @Mapping(target = DESCRIPTION, source = DTO_DESCRIPTION)
    @Mapping(target = AUTHOR, source = AUTHOR)
    Book to(BookDto bookDto, Author author);
}
