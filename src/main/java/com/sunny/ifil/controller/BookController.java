package com.sunny.ifil.controller;

import com.github.pagehelper.PageInfo;
import com.sunny.ifil.entity.Book;
import com.sunny.ifil.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/book")
@Controller
public class BookController {
    @Resource
    private BookService bookService;
    @RequestMapping("/getlist")
    @ResponseBody
    public PageInfo getlist(){

       List<Book> list= bookService.getList();
        PageInfo  mv=new PageInfo (list);
        return mv;
    }

    @GetMapping("/index")
    public String index(){
        ModelAndView mv=new ModelAndView();
        return "index";
    }
}
