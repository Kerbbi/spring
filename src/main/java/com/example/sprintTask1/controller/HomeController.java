package com.example.sprintTask1.controller;

import com.example.sprintTask1.db.DBManager;
import com.example.sprintTask1.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    public  Arraylist{

    }
}
