package org.example.Service;

import org.example.Dto.Book;
import org.example.Entity.BookEntity;
import org.example.Repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository repository ;

    ModelMapper mapper;
    @Bean
    public void setup(){
        this.mapper = new ModelMapper();
    }
    @Override
    public void addBook(Book book) {
        BookEntity entity = mapper.map(book , BookEntity.class);
        repository.save(entity);
    }
}
