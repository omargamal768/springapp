package com.omar.controllers;


import com.omar.Dao.StudentDao;
import com.omar.entity.Student;

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
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @RequestMapping("/")
    public String index(){return "index";}

    @RequestMapping("/Students")
    public String students(Model m){

        List<Student> list = studentDao.getAllStudents();
        m.addAttribute("StudentsList", list);

        return "Students";}

    @RequestMapping("/AddStudent")
    public String addStudent(){return "AddStudent";}


    @RequestMapping(path="/createStudent",method = RequestMethod.POST)
    public String createStudent(@ModelAttribute Student student){
        System.out.println(student);
        int i = studentDao.saveStudent(student);
        return "redirect:/Students";
    }
    @RequestMapping(path="/editStudent/{id}")
    public String editStudent(@PathVariable int id, Model m){
        Student student = studentDao.getStudentById(id);
        m.addAttribute("student", student);
        return "editStudent";
    }

    @RequestMapping(path = "/updateStudent", method = RequestMethod.POST)
    public String updateStudent(@ModelAttribute Student student) {

        studentDao.update(student);

        return "redirect:/Students";
    }


    @RequestMapping("/deleteStudent/{id}")
    public String deleteEmp(@PathVariable int id) {
        studentDao.deleteStudent(id);
        return "redirect:/Students";
    }
}
