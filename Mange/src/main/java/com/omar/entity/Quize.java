package com.omar.entity;

import javax.persistence.*;

@Entity
@Table(name = "quizzes")
public class Quize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    private String subject;
    private String q1;
    private String q2;

    @Override
    public String toString() {
        return "Quize{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", subject='" + subject + '\'' +
                ", q1='" + q1 + '\'' +
                ", q2='" + q2 + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }
}
