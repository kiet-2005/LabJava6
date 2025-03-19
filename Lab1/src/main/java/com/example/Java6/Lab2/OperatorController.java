package com.example.Java6.Lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OperatorController {
    @RequestMapping("/lab2/operator")
    public String index(Model model) {
        model.addAttribute("x", 5);
        model.addAttribute("y", 7);
        return "lab2/operator";
    }
}
