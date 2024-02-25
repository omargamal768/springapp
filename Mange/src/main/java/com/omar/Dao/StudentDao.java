package com.omar.Dao;

import com.omar.entity.Student;

import java.util.List;

public interface StudentDao {
    public Student getStudentById(int id);

    public int saveStudent(Student student);


    public List<Student> getAllStudents();
    public void update(Student student);

    public void deleteStudent(int id);
}
