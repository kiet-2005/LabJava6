package com.example.Java6.Lab1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.Java6.Entity.Student;

public class StreamAPI {
    static List<Student> list = Arrays.asList(
                new Student("kiet", true,2.0),
                new Student("bin",false, 4.0),
                new Student("thinh", true,6.0),
                new Student("vy", false,8.0),
                new Student("phong", true,10.0),
                new Student("triet", false,9.0)
        );
    public static void main(String[] args) {
//         demo1();
//         demo2();
//         demo3();
//         demo4();
    }

    public static void demo1() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream.forEach(n -> {
            System.out.println(n);
        });

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream().forEach(n -> {
            System.out.println(n);
        });
    }

    public static void demo2() {
        List<Integer> list = Arrays.asList(1, 9, 4, 7, 5, 2);
        List<Double> result = list.stream().filter(n -> n % 2 == 0).map(n -> Math.sqrt(n))
                .peek(d -> System.out.println(d)).collect(Collectors.toList());
    }

    public static void demo3() {
        List<Student> result = list.stream().filter(sv -> sv.getMarks() >= 7).peek(sv -> sv.setName(sv.getName().toUpperCase())).collect(Collectors.toList());
        result.forEach(sv -> {
            System.out.println("Name:" + sv.getName());
            System.out.println("Marks:" + sv.getMarks());
            System.out.println("------------");
        });
    }

    public static void demo4(){
        double average = list.stream().mapToDouble(sv -> sv.getMarks()).average().getAsDouble();
            System.out.println("Average:" + average);
        double sum = list.stream().mapToDouble(sv -> sv.getMarks()).sum();
            System.out.println("Sum:" + sum);
        double min = list.stream().mapToDouble(sv -> sv.getMarks()).min().getAsDouble();
            System.out.println("Min:" + min);
        boolean all = list.stream().allMatch(sv -> sv.getMarks() >= 5);
        if (all == true) {
            System.out.println("All: Pass");
        } else {
            System.out.println("All: False");
        }
            
        Student min_sv = list.stream().reduce(list.get(0), (minsv, sv) -> sv.getMarks() < minsv.getMarks() ? sv : minsv);
            System.out.println("Min:" + min_sv.getName());
    }

}
