package com.hao123.core.service;

import com.hao123.core.entity.Teacher;

import java.util.List;

public interface TeacherService {
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
