package com.rest.RestServiceDoc.controller;

import com.rest.RestServiceDoc.dto.BookDto;
import com.rest.RestServiceDoc.service.BookService;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
//https://app.swaggerhub.com/apis/andres.rey/BookStore-REST-API/1.0.0#/store/placeOrder
@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{bookId}")
    public Optional<BookDto> getBookById(@PathVariable Id id){
        return bookService.getBook(id);
    }

}
