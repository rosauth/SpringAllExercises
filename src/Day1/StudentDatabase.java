package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentDatabase {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<String> studentName = new ArrayList<>();
    static ArrayList<String> studentLevel = new ArrayList<>();
    static ArrayList<String> studentID = new ArrayList<>();
    static ArrayList<Integer> studentScore = new ArrayList<>();

    private static void menuOption(int option) {
        switch (option) {
            case 1:
                while (true) {
                    inputData();
                    System.out.print("Do you want to submit another data? (y/n): ");
                    String resubmitOption = scanner.next();
                    if (resubmitOption.equalsIgnoreCase("n")) {
                        return;
                    }
                }
            case 2:
                if (studentScore.isEmpty()) {
                    System.out.println("Please input student data first.");
                } else {
                    rank();
                }
                break;
            case 3:
                System.out.println("This feature will be available soon!");
                break;
            case 4:
                System.out.println("Thank you, Goodbye!");
                System.exit(-1);
//                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }

    private static void inputData() {
        String name, level, id;
        int score;

        System.out.println("\n-------------------------------");
        System.out.println("         F    O   R   M        ");
        System.out.println("-------------------------------");

        // TODO: 8/12/2020 add data to array list
        System.out.printf("%-15s%-2s", "Name", ":");
        name = scanner.next();
        studentName.add(name);

        System.out.printf("%-15s%-2s", "Class", ":");
        level = scanner.next();
        studentLevel.add(level);

        System.out.printf("%-15s%-2s", "Student ID", ":");
        id = scanner.next();
        studentID.add(id);

        System.out.printf("%-15s%-2s", "Final Score", ":");
        score = scanner.nextInt();
        studentScore.add(score);
    }

    private static void rank() {
        Comparator comparator = Collections.reverseOrder();
        Collections.sort(studentScore, comparator);

        System.out.println("\n-------------------------------\n" +
                "         R    A   N   K        \n" +
                "-------------------------------");

        System.out.println("Student rank by  final score: ");
        int rank = 1;
        for (int score : studentScore) {
            System.out.println(rank + ". " + score);

            rank++;
        }
    }

    public static void main(String[] args) {
        studentName.clear();
        studentLevel.clear();
        studentID.clear();
        studentScore.clear();

        System.out.println("================================\n" +
                "= Student Data Processing Apps =\n" +
                "================================");

        while (true) {
            //todo: menu (create, read, update, delete)
            System.out.println("\n             Menu\n" +
                    "--------------------------------");
            System.out.println("1. Input student data\n" +
                    "2. Student rank\n" +
                    "3. Remove data\n" +
                    "4. Exit");
            System.out.print("\nChoose menu: ");
            int menu = scanner.nextInt();

            menuOption(menu);
        }
    }
}
