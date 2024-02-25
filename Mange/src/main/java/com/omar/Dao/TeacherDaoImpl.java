package com.omar.Dao;

import com.omar.entity.Student;
import com.omar.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TeacherDaoImpl implements TeacherDao{
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public Teacher getTeacherById(int id) {
        Teacher teacher = hibernateTemplate.get(Teacher.class, id);
        return teacher;
    }

    @Override
    @Transactional
    public int saveTeacher(Teacher teacher) {
        int i = (Integer) hibernateTemplate.save(teacher);

        return i;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        List<Teacher> list = hibernateTemplate.loadAll(Teacher.class);
        return list;
    }

    @Override
    @Transactional
    public void update(Teacher teacher) {
        hibernateTemplate.update(teacher);
    }

    @Override
    @Transactional
    public void deleteTeacher(int id) {
        Teacher teacher = hibernateTemplate.get(Teacher.class, id);
        hibernateTemplate.delete(teacher);
    }
}
