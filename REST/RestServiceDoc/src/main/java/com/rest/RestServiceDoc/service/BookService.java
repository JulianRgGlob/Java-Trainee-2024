package com.rest.RestServiceDoc.service;

import com.rest.RestServiceDoc.dto.BookDto;
import jakarta.persistence.Id;

import java.util.Optional;

public interface BookService {

    Optional<BookDto> getBook(Id id);
    BookDto saveBook(BookDto bookDto);
    BookDto updateBook(BookDto bookDto,Id id);

}
