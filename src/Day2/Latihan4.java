package Day2;

import Day2.Object.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        ArrayList<Student> studentArrayList = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String name = scanner.next();
            student.setName(name);

            System.out.print("Class: ");
            String level = scanner.next();
            student.setLevel(level);

            System.out.print("Subject: ");
            String subject = scanner.next();
            student.setSubject(subject);

            System.out.print("Score: ");
            int score = scanner.nextInt();
            student.setScore(score);

            studentArrayList.add(student);

            System.out.print("Do you want to submit another data? (y/n): ");
            if (scanner.next().equalsIgnoreCase("n")){
//                System.out.println(student.toString());
                System.out.println(Arrays.toString(studentArrayList.toArray()));
                return;
            }
        }
    }

}
