package com.example.Java6.Lab2;

import com.example.Java6.Entity.Student2;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.util.List;
import java.util.Optional;

@Controller
public class Student2Controller {
    @RequestMapping("/lab2/student2/list")
    public String list(Model model, @RequestParam("index") Optional<Integer> index) throws Exception {
        File file = new ClassPathResource("/static/students.json").getFile();
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Student2>> type = new TypeReference<List<Student2>>() {};
        List<Student2> list = mapper.readValue(file, type);

        model.addAttribute("sv", list.get(index.orElse(0)));
        model.addAttribute("dssv", list);

        return "lab2/student/list";
    }
}
