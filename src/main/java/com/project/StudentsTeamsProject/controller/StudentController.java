package com.project.StudentsTeamsProject.controller;

import com.project.StudentsTeamsProject.Student;
import com.project.StudentsTeamsProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public String getAllStudentsWithTeams(Model model) {
        List<Student> students = studentRepository.findAllWithTeam();
        model.addAttribute("students", students);
        return "students";
    }
}
