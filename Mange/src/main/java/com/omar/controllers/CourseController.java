package com.omar.controllers;

import com.omar.Dao.CourseDao;

import com.omar.entity.Course;

import com.omar.entity.Quize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CourseController {
    @Autowired
    private CourseDao courseDao;


    @RequestMapping(path = "/Courses")
    public String courses(Model m){

        List<Course> list = courseDao.getAllCourses();
        m.addAttribute("CoursesList", list);
        return "Courses";
    }
    @RequestMapping(path = "/AddCourse")
    public String addCourse(){
        return "AddCourse";
    }

    @RequestMapping(path="/createCourse",method = RequestMethod.POST)
    public String createCourse(@ModelAttribute Course course){
        System.out.println(course);
int i = courseDao.saveCourse(course);

        return "redirect:/Courses";
    }
    @RequestMapping(path="/editCourse/{id}")
    public String editCourse(@PathVariable int id, Model m){
        Course course = courseDao.getCourseById(id);
        m.addAttribute("course", course);
        return "editCourse";
    }

    @RequestMapping(path = "/updateCourse", method = RequestMethod.POST)
    public String updateCourse(@ModelAttribute Course course) {

        courseDao.update(course);

        return "redirect:/Courses";
    }


    @RequestMapping("/deleteCourse/{id}")
    public String deleteCourse(@PathVariable int id) {
        courseDao.deleteCourse(id);
        return "redirect:/Courses";
    }


}
