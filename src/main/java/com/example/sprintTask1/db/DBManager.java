package com.example.sprintTask1.db;

import com.example.sprintTask1.model.Student;

import java.util.ArrayList;

public class DBManager {
     static ArrayList<Student> students=new ArrayList<>();
      private static Long id=6L;

     static {
         students.add(new Student(1L,"Kerbez","Karimkulova",90,"A"));
         students.add(new Student(2L,"Sokko","Hakodo",45,"F"));
         students.add(new Student(3L,"Aang","Roku",88,"B"));
         students.add(new Student(4L,"Katara","Hakodo",65,"C"));
         students.add(new Student(5L,"Zuko","Ozaya",53,"D"));

     }
    public static void addStudent(Student student){
     student.setId(id);
     id++;
     students.add(student);
    }

     public static ArrayList<Student> getStudents(){
         return students;
     }
}
