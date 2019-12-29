package com.sunny.ifil.service.impl;

import com.sunny.ifil.dao.BookDao;
import com.sunny.ifil.entity.Book;
import com.sunny.ifil.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
 @Resource
 private BookDao bookDao;
  @Override
  public List<Book> getList() {

    return bookDao.getList();
  }
}
