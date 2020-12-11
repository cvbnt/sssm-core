package com.hao123.core.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Teacher {
    private int id;
    private int  schoolId;
    private String teacherCode;
    private String avatar;
    private String name;
    private int sex;
    private String title;
    private String subject;
    private String phone;
    private Date startTeachDate;
    private Date createAt;
    private Date updateAt;

    public Teacher(int id, int schoolId, String teacherCode, String avatar, String name, int sex, String title, String subject, String phone, Date startTeachDate, Date createAt, Date updateAt) {
        this.id = id;
        this.schoolId = schoolId;
        this.teacherCode = teacherCode;
        this.avatar = avatar;
        this.name = name;
        this.sex = sex;
        this.title = title;
        this.subject = subject;
        this.phone = phone;
        this.startTeachDate = startTeachDate;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getStartTeachDate() {
        return startTeachDate;
    }

    public void setStartTeachDate(Date startTeachDate) {
        this.startTeachDate = startTeachDate;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
