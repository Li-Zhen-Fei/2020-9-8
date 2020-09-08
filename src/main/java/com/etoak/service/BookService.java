package com.etoak.service;

import com.etoak.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookDao dao;

    public void setDao(BookDao dao) {
        this.dao = dao;
    }

    public void testService() {
        System.out.println("service执行");
        dao.testDao();
    }
}
