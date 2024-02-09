package org.example.Controller;

import org.example.Dto.Book;
import org.example.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
   @Autowired
    BookService service;
    public void addBook(Book book){

    }

}
