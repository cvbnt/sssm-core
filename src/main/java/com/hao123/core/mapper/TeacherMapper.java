package com.hao123.core.mapper;

import com.hao123.core.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {
    //    增加
    int addTeacher(Teacher teacher);
    //    删除
    int deleteTeacherById(int id);
    //    更新
    int updateTeacher(Teacher teacher);
    //    查询
    Teacher queryTeacherById(int id);

    List<Teacher> queryAllTeacher();

    List<Teacher> queryTeacherByName(String name);
}
