package com.example.Java6.Lab2;

import com.example.Java6.Entity.Student2;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/lab2")
public class HomeController {
    @RequestMapping("/home/index")
    public String index(Model model) throws IOException {
        model.addAttribute("message", "Welcome to Thymeleaf");
        ObjectMapper mapper = new ObjectMapper();
        ClassPathResource resource = new ClassPathResource("static/student.json");

        Student2 student2 = mapper.readValue(resource.getInputStream(), Student2.class);
        model.addAttribute("student2", student2);
        return "lab2/home/index";
    }
}
