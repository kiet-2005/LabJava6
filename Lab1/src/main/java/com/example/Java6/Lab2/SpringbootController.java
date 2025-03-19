package com.example.Java6.Lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringbootController {
    @RequestMapping("/springboot")
    public String hello(Model model) {
        model.addAttribute("message", "hello");
        System.out.println("Main");
        return "springboot";
    }
}
