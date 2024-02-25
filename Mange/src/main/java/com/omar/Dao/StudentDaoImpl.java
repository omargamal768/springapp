package com.omar.Dao;

import com.omar.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao{
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public Student getStudentById(int id) {
        Student student = hibernateTemplate.get(Student.class, id);
        return student;
    }

    @Override
    @Transactional
    public int saveStudent(Student student) {
        int i = (Integer) hibernateTemplate.save(student);

        return i;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = hibernateTemplate.loadAll(Student.class);
        return list;
    }

    @Override
    @Transactional
    public void update(Student student) {
        hibernateTemplate.update(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        Student student = hibernateTemplate.get(Student.class, id);
        hibernateTemplate.delete(student);
    }
}
