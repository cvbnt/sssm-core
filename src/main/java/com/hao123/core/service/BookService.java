package com.hao123.core.service;

import com.hao123.core.entity.Books;
import java.util.List;

public interface BookService {
    //    增加
    int addBook(Books books);
    //    删除
    int deleteBookById(int id);
    //    更新
    int updateBook(Books books);
    //    查询
    Books queryBookById(int id);

    List<Books> queryAllBook();

    List<Books> queryBookByName(String bookName);
}
