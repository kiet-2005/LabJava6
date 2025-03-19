package com.example.Java6.Entity;

import java.util.List;

import org.springframework.lang.Contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student2 {
    String name;
    Boolean gender = false;
    Double marks = 0.0;
    Contract contract;
    List<String> subject;
}
