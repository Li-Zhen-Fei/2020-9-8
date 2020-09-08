package com.etoak.config;

import com.etoak.controller.BookController;
import com.etoak.dao.BookDao;
import com.etoak.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public BookService bookService() {
        return new BookService();
    }

    @Bean
    public BookDao bookDao() {
        return new BookDao();
    }

    @Bean
    public BookController bookController(){
        return new BookController();
    }
}
