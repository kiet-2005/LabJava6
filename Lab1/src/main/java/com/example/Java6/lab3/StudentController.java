package com.example.Java6.lab3;

import com.example.Java6.Entity.StudentLab3;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lab3")
public class StudentController {
    @GetMapping("/student/form")
    public String form(Model model) {
        StudentLab3 sv = new StudentLab3();
        sv.setFullname("Võ Thanh Bin");
        sv.setCountry("VN");
        sv.setGender(true);
        model.addAttribute("sv", sv);
        return "lab3/student/form";
    }
    @PostMapping("/student/save")
    String save(Model model, @Validated @ModelAttribute("sv") StudentLab3 sv, Errors errors) {
        if (errors.hasErrors()){
            model.addAttribute("message", "Vui lòng sửa các lỗi sau đây !");
            return "lab3/student/form";
        }
        return "lab3/student/success";
    }
}
