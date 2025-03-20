package com.example.Java6.Lab1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.example.Java6.Entity.Student;

public class Lambda {
    static List<Student> list = Arrays.asList(
                new Student("A", true,10.0),
                new Student("B",false, 9.0),
                new Student("C", true,8.5),
                new Student("D", false,4.3)
        );
    public static void main(String[] args) {
         demo1();
//         demo2();
//         demo3();
//         demo4();
    }
    public static void demo1(){
        List<Integer> list = Arrays.asList(1,9,4,7,5,2);
        list.forEach(n -> System.out.println(n));
    }

    public static void demo2(){
        list.forEach(sv -> {
            System.out.println("Name:" + sv.getName());
            
            if (sv.getGender() == true) {
                System.out.println("Marks: Male");
            } else {
                System.out.println("Marks: Female");
            }
            System.out.println("Gender:" + sv.getMarks());
            System.out.println("------------");
        });
    }

    public static void demo3(){
        Collections.sort(list, (Student sv1, Student sv2) -> -sv1.getMarks().compareTo(sv2.getMarks()));
        list.forEach(sv -> {
            System.out.println("Name:" + sv.getName());
            
            if (sv.getGender() == true) {
                System.out.println("Marks: Male");
            } else {
                System.out.println("Marks: Female");
            }
            System.out.println("Gender:" + sv.getMarks());
            System.out.println("------------");
        });
    }

    public static void demo4(){
        Demo4Inter d = x -> System.out.println(x);
        d.m1(10);
    }

    @FunctionalInterface
    interface Demo4Inter{
        void m1(int x);
        default void m2(){}
        public static void m3(){}
    }
}
