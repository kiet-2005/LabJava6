package com.example.Java6.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    String name;
    Boolean gender = false;
    Double marks = 0.0;
}
