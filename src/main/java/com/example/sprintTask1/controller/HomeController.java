package com.example.sprintTask1.controller;

import com.example.sprintTask1.db.DBManager;
import com.example.sprintTask1.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String homePage(Model model){
        ArrayList<Student> students= DBManager.getStudents();
        model.addAttribute("pupils",students);
        return "home_page";
    }

    @GetMapping(value = "addStudentPage")
    public String addPage(){
        return "addStudentPage";
    }
    @PostMapping(value ="addStudentPage")
    public  String addStudent(
            @RequestParam(name ="student_name")String name,
            @RequestParam(name ="student_surname")String surname,
            @RequestParam(name ="student_exam")int exam
    ){
     Student student=new Student();
     student.setName(name);
     student.setSurname(surname);
     student.setExam(exam);
     String mark="";
     if(student.getExam()>=90){
         mark="A";
     } else if (student.getExam()>=89 || student.getExam()<=75) {
         mark="B";
     }else if (student.getExam()>=74 || student.getExam()<=60) {
         mark="C";
     }else if (student.getExam()>=59 || student.getExam()<=50) {
         mark="D";
     }else
         mark="F";
     student.setMark(mark);
     DBManager.addStudent(student);
        return "redirect:/";
    }
}
