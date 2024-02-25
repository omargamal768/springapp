package com.omar.controllers;

import com.omar.Dao.QuizeDao;
import com.omar.Dao.TeacherDao;
import com.omar.entity.Quize;
import com.omar.entity.Student;
import com.omar.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class QuizeController {
    @Autowired
    private QuizeDao quizeDao;
    @RequestMapping("/Quizzes")
    public String quizzes(Model m){
        List<Quize> list = quizeDao.getAllQuizzes();
        m.addAttribute("QuizzesList", list);



        return "Quizzes";}




    @RequestMapping("/AddQuize")
    public String AddQuize(){
        return "AddQuize";}


    @RequestMapping(path="/createQuize",method = RequestMethod.POST)
    public String createQuize(@ModelAttribute Quize quize){
        System.out.println(quize);
        int i = quizeDao.saveQuize(quize);

        return "redirect:/Quizzes";
    }
    @RequestMapping(path="/editQuize/{id}")
    public String editQuize(@PathVariable int id, Model m){
        Quize quize = quizeDao.getQuizeById(id);
        m.addAttribute("quize", quize);
        return "editQuize";
    }

    @RequestMapping(path = "/updateQuize", method = RequestMethod.POST)
    public String updateQuize(@ModelAttribute Quize quize) {

        quizeDao.update(quize);

        return "redirect:/Quizzes";
    }


    @RequestMapping("/deleteQuize/{id}")
    public String deleteQuize(@PathVariable int id) {
        quizeDao.deleteQuize(id);
        return "redirect:/Quizzes";
    }







}
