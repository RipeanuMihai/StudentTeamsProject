package com.project.StudentsTeamsProject.controller;

import com.project.StudentsTeamsProject.Student;
import com.project.StudentsTeamsProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class LoginController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            Model model) {

        Optional<Student> studentOpt = studentRepository.findByEmailAndParola(email, password);

        if (studentOpt.isPresent()) {
            model.addAttribute("student", studentOpt.get());
            return "redirect:/students";
        } else {
            model.addAttribute("error", "Email sau parola incorecte!");
            return "login";
        }
    }
}