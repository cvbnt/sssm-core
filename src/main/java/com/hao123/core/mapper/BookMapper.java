package com.hao123.core.mapper;

import com.hao123.core.entity.Books;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
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
