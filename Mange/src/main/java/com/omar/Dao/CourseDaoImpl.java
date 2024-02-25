package com.omar.Dao;

import com.omar.entity.Course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class CourseDaoImpl implements CourseDao{
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int saveCourse(Course course) {
        int i = (Integer) hibernateTemplate.save(course);
        return i;
    }

    @Override
    public List<Course> getAllCourses() {
        List<Course> list = hibernateTemplate.loadAll(Course.class);
        return list;
    }

    @Override
    @Transactional
    public void update(Course course) {
        hibernateTemplate.update(course);
    }

    @Override
    @Transactional
    public void deleteCourse(int id) {
        Course course = hibernateTemplate.get(Course.class, id);
        hibernateTemplate.delete(course);

    }

    @Override
    public Course getCourseById(int id) {
        Course course = hibernateTemplate.get(Course.class, id);
        return course;
    }


}
