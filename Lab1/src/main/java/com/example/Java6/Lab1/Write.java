package com.example.Java6.Lab1;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.example.Java6.Entity.Contact;
import com.example.Java6.Entity.Student2;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Write {
    public static void main(String[] args) throws Exception{
        // demo1();
        // demo2();
        demo3();
    }
    public static void demo1() throws Exception{
        String path = "E:\\Java6\\LabJava6\\Lab1\\src\\main\\java\\com\\example\\json\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> student = mapper.readValue(new File(path), Map.class);

        System.out.println("Name: " + student.get("name"));
        System.out.println("Marks: " + student.get("marks"));
        System.out.println("gender: " + student.get("gender"));
        Map<String, Object> contact = (Map<String, Object>) student.get("contact");
        System.out.println("Email: " + contact.get("email"));
        System.out.println("Phone: " + contact.get("phone"));
        List<String> subject = (List<String>) student.get("subject");
        subject.forEach( s -> {
            System.out.println("Subject: " + s);
        });
    }
    public static void demo2() throws Exception{
        String path = "E:\\Java6\\LabJava6\\Lab1\\src\\main\\java\\com\\example\\json\\students.json";
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> student = mapper.readValue(new File(path), List.class);
        student.forEach( s -> {
            System.out.println("Name: " + s.get("name"));
        });
    }
    public static void demo3() throws Exception{
        String path = "E:\\Java6\\LabJava6\\Lab1\\src\\main\\java\\com\\example\\json\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        Student2 students = mapper.readValue(new File(path), Student2.class);
        System.out.println("Name: " + students.getName());
        System.out.println("Marks: " + students.getMarks());
        System.out.println("gender: " + students.getGender());
        Contact contact = students.getContact();
        System.out.println("Email: " + contact.getEmail());
        System.out.println("Phone: " + contact.getPhone());
        List<String> subject = students.getSubject();
        subject.forEach( s -> {
            System.out.println("Subject: " + s);
        });
    }
}
