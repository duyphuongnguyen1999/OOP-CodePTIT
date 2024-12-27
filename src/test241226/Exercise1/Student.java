package test241226.Exercise1;

import java.io.*;
import java.util.*;

public class Student {
    private String studentId;
    private String studentName;
    private String className;
    private String email;
    private String phoneNumber;
    
    public Student (String studentId, String studentName, String className, String email, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.className = className;
        this.email = email;
        this.phoneNumber = "0" + phoneNumber;
    }

    private static void printResult(List<Student> students) {
        for (Student student : students) {
            System.out.println(
                student.studentId + " "
                + student.studentName + " "
                + student.className + " "
                + student.email + " "
                + student.phoneNumber
            );
        }
    }    
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "src/test241226/Exercise1/DANHSACH.in";
        try (Scanner in = new Scanner(new File(filePath))) {
            List<Student> students = new ArrayList<>();
            while(in.hasNextLine()) {
                Student student = new Student(
                    in.nextLine(), 
                    in.nextLine(), 
                    in.nextLine(), 
                    in.nextLine(), 
                    in.nextLine()
                );
                students.add(student);
            }
            printResult(students);
        }
    }
}
