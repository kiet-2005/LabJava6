package com.example.Java6.Lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lab2")
public class SpringbootController {
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "FPT <b>Polytechnic</b>");
        System.out.println("Lab2");

        return "lab2/hello";
    }
}
