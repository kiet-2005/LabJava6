package com.example.Java6.Entity;

import java.util.List;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student2 {
    String name;
    Boolean gender = false;
    Double marks = 0.0;
    Contact contact;
    List<String> subject;
}
