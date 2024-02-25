package com.omar.Dao;

import com.omar.entity.Course;
import com.omar.entity.Quize;


import java.util.List;


public interface CourseDao {


    public int saveCourse(Course course);
    public List<Course> getAllCourses();
    public void update(Course course);

    public void deleteCourse(int id);
    public Course getCourseById(int id);




}
