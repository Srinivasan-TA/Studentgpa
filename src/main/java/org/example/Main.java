package org.example;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;

 class Student {
     private String name;
     private int age;
     private double gpa;

     Student(String name, int age, double gpa) {
         SetAge(age);
         SetGpa(gpa);
         SetName(name);
     }

     public String getName() {
         return name;
     }

     public void SetName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void SetAge(int age) {
         this.age = age;
     }

     public double getGpa() {
         return gpa;
     }

     public void SetGpa(double gpa) {
         this.gpa = gpa;
     }
 }

     public class Main {
         public static void main(String[] args) {
             Logger l = Logger.getLogger("com.api.jar");
             List<Student> students = new ArrayList<>();
             students.add(new Student("Sri", 22, 4.5));
             students.add(new Student("ruch", 21, 3.7));
             students.add(new Student("Bar", 21, 3.6));
             l.info("Original List:");
             for (Student student : students) {
                 l.info("Name: " + student.getName() + ", Age: " + student.getAge() + ", GPA: " + student.getGpa());
             }
             Collections.sort(students, (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
             l.info("\nSorted List:");
             for (Student student : students) {
                 l.info("Name: " + student.getName() + ", GPA: " + student.getGpa());
             }
         }
 }
