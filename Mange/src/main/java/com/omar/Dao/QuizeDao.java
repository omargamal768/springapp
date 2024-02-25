package com.omar.Dao;

import com.omar.entity.Quize;


import java.util.List;

public interface QuizeDao {
    public Quize getQuizeById(int id);

    public int saveQuize(Quize quize);


    public List<Quize> getAllQuizzes();
    public void update(Quize quize);

    public void deleteQuize(int id);
}
