package com.etoak.controller;

import com.etoak.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    public void setService(BookService service) {
        this.service = service;
    }

    public void gogo(){
        System.out.println("Controllerִ执行");
        service.testService();
    }
}
