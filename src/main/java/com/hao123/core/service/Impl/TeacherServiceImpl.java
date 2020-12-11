package com.hao123.core.service.Impl;

import com.hao123.core.entity.Teacher;
import com.hao123.core.mapper.TeacherMapper;
import com.hao123.core.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public int addTeacher(Teacher teacher) {
        return teacherMapper.addTeacher(teacher);
    }

    @Override
    public int deleteTeacherById(int id) {
        return teacherMapper.deleteTeacherById(id);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return teacherMapper.updateTeacher(teacher);
    }

    @Override
    public Teacher queryTeacherById(int id) {
        return teacherMapper.queryTeacherById(id);
    }

    @Override
    public List<Teacher> queryAllTeacher() {
        return teacherMapper.queryAllTeacher();
    }

    @Override
    public List<Teacher> queryTeacherByName(String name) {
        return teacherMapper.queryTeacherByName(name);
    }
}
