package com.example.Java6.Lab1;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;

public class ReadJson {
    public static void main(String[] args) throws Exception{
         demo1();
        demo2();
    }
    public static void demo1() throws Exception{
        System.out.println("Demo1 ====================");
//        String json = "E:\\Java6\\LabJava6\\Lab1\\src\\main\\java\\com\\example\\json\\student.json";
        ClassPathResource json = new ClassPathResource("static/student.json");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode student = mapper.readTree(json.getInputStream());

        System.out.println("Name: " + student.get("name").asText());
        System.out.println("Gender: " + student.get("gender").asBoolean());
        System.out.println("Marks: " + student.get("marks").asDouble());
        System.out.println("Email: " + student.get("contact").get("email").asText());
        System.out.println("Phone: " + student.findValue("phone").asText());
        student.get("subject").iterator().forEachRemaining( subject -> {
            System.out.println("Subject: " + subject.asText());
        });
    }
    public static void demo2() throws Exception{
        System.out.println("Demo2 ====================");
        ClassPathResource json = new ClassPathResource("static/students.json");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode student = mapper.readTree(json.getInputStream());
        student.iterator().forEachRemaining( s -> {
            System.out.println("Name: " + s.get("name").asText());
        });
    }
    
}
