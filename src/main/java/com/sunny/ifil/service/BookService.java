package com.sunny.ifil.service;

import com.sunny.ifil.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
public List<Book> getList();
}
