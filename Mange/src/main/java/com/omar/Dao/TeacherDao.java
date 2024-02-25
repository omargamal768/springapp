package com.omar.Dao;

import com.omar.entity.Teacher;

import java.util.List;

public interface TeacherDao {
    public Teacher getTeacherById(int id);

    public int saveTeacher(Teacher teacher);


    public List<Teacher> getAllTeachers();
    public void update(Teacher teacher);

    public void deleteTeacher(int id);
}
