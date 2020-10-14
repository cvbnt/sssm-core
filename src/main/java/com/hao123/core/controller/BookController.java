package com.hao123.core.controller;

import com.hao123.core.entity.Books;
import com.hao123.core.entity.Pin;
import com.hao123.core.service.Impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/pages/allbook")
    public String allBook(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("key", list);
        model.addAttribute("pin", new Pin());
        return "pages/allBook";
    }

    @PostMapping("/pages/allbook")
    public String allBook(Books books) {
        bookService.addBook(books);
        return "redirect:/pages/allbook";
    }

    @GetMapping("/pages/addbook")
    public String addBook() {
        return "pages/addBook";
    }

    @GetMapping("/pages/deletebook/{id}")
    public String deleteBook(@PathVariable("id") int aid) {
        bookService.deleteBookById(aid);
        return "redirect:/pages/allbook";
    }

    @GetMapping("/pages/toupdatebook/{id}")
    public String toupdateBook(@PathVariable("id") int aid, Model model) {
        Books books = bookService.queryBookById(aid);
        model.addAttribute("key2", books);
        return "pages/updateBook";
    }

    @PostMapping("/pages/updatebook")
    public String updateBook(Books books) {
        bookService.updateBook(books);
        return "redirect:/pages/allbook";
    }

    @PostMapping("/search")
    public String Search(@ModelAttribute Pin pin, Model model) {
        String name = pin.getName();
        List<Books> list = bookService.queryBookByName(name);
        if (null == list || list.size() ==0){
            list=bookService.queryAllBook();
            model.addAttribute("error","未查到书籍");
        }
        model.addAttribute("key", list);
        return "pages/allBook";
    }
}
