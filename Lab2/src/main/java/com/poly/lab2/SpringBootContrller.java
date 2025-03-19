package com.poly.lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SpringBootContrller {
    @RequestMapping("/springboot")
    public String hello(Model model) {
        model.addAttribute("message", "Hello");
        return "springboot";
    }
    
}
