package com.omar.controllers;



import com.omar.Dao.TeacherDao;


import com.omar.entity.Student;
import com.omar.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class TeacherController {
    @Autowired
    private TeacherDao teacherDao;



    @RequestMapping("/Teachers")
    public String teachers(Model m){
        List<Teacher> list = teacherDao.getAllTeachers();
        m.addAttribute("TeachersList", list);
        return "Teachers";}

    @RequestMapping("/AddTeacher")
    public String addStudent(){return "AddTeacher";}

@RequestMapping(path="/createTeacher",method = RequestMethod.POST)
    public String createTeacher(@ModelAttribute Teacher teacher){
    System.out.println(teacher);
    int i = teacherDao.saveTeacher(teacher);
    return "redirect:/Teachers";
}

    @RequestMapping(path="/editTeacher/{id}")
    public String editTeacher(@PathVariable int id, Model m){
        Teacher teacher = teacherDao.getTeacherById(id);
        m.addAttribute("teacher", teacher);
        return "editTeacher";
    }
    @RequestMapping(path = "/updateTeacher", method = RequestMethod.POST)
    public String updateTeacher(@ModelAttribute Teacher teacher) {

        teacherDao.update(teacher);

        return "redirect:/Teachers";
    }


    @RequestMapping("/deleteTeacher/{id}")
    public String deleteTeacher(@PathVariable int id) {
        teacherDao.deleteTeacher(id);
        return "redirect:/Teachers";
    }







}
