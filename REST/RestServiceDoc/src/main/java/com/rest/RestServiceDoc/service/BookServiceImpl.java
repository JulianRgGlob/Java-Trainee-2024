package com.rest.RestServiceDoc.service;

import com.rest.RestServiceDoc.dto.BookDto;
import jakarta.persistence.Id;

import java.util.Optional;

public class BookServiceImpl implements BookService {
    @Override
    public Optional<BookDto> getBook(Id id) {
        return Optional.empty();
    }

    @Override
    public BookDto saveBook(BookDto bookDto) {
        return null;
    }

    @Override
    public BookDto updateBook(BookDto bookDto, Id id) {
        return null;
    }
}
