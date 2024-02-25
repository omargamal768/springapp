package com.omar.Dao;


import com.omar.entity.Quize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class QuizeDaoImpl implements QuizeDao{
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public Quize getQuizeById(int id) {
        Quize quize = hibernateTemplate.get(Quize.class, id);
        return quize;
    }

    @Override
    @Transactional
    public int saveQuize(Quize quize) {
        int i = (Integer) hibernateTemplate.save(quize);

        return i;
    }

    @Override
    public List<Quize> getAllQuizzes() {
        List<Quize> list = hibernateTemplate.loadAll(Quize.class);
        return list;
    }

    @Override
    @Transactional
    public void update(Quize quize) {
        hibernateTemplate.update(quize);
    }

    @Override
    @Transactional
    public void deleteQuize(int id) {
        Quize quize = hibernateTemplate.get(Quize.class, id);
        hibernateTemplate.delete(quize);
    }
}
