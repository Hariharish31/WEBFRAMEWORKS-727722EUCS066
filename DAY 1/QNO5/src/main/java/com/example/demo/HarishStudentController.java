package com.example.demo;
import com.example.demo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
public class HarishStudentController {
    @GetMapping("/student")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setStudentName("John");
        obj.setMessage("Welcome, John!");
        students.add(obj);
        obj1.setStudentName("Ash");
        obj1.setMessage("Welcome, Ash!");
        students.add(obj1);
        return students;
    }
}
