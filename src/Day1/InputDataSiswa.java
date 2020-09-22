package Day1;

import java.util.Scanner;

public class InputDataSiswa {

    static Scanner scanner = new Scanner(System.in);
    static String[] subjectList = {"Math", "Biology", "Physic"};
    final static String[] gradeList = {"A", "B", "C", "D"};

    private static void dataInput() {
        String name, level;
        int totalQuiz, subjects;

        System.out.println("\n            FORM            ");

        System.out.print("Nama: ");
        name = scanner.next();

        System.out.print("Kelas: ");
        level = scanner.next();

        System.out.println("Daftar Mata Pelajaran");
        for (int j = 0; j < subjectList.length; j++) {
            System.out.println((j + 1) + ". " + subjectList[j]);
        }
        System.out.print("Pilihan mata pelajaran: ");
        subjects = scanner.nextInt();
        while (subjects > subjectList.length) {
            System.out.print("Masukan pilihan mata pelajaran yang tepat: ");
            subjects = scanner.nextInt();
        }

        if (subjects != 0) {
            System.out.print("Jumlah Kuis: ");
            totalQuiz = scanner.nextInt();

            grading(name, level, subjects, totalQuiz);
        /*
            for (int i = 0; i < totalQuiz; i++) {
                System.out.print("Nilai kuis " + (i + 1) + ": ");
                tempScore = scanner.nextInt();
                while (tempScore < 0 || tempScore > 100) {
                    System.out.println("\nMasukan respon yang valid (0 <= Nilai <= 100)");

                    System.out.print("Nilai kuis " + (i + 1) + ": ");
                    tempScore = scanner.nextInt();
                }
                grade += tempScore;
            }
            grade /= totalQuiz;


            System.out.println("\n=============================");
            System.out.println("=        Data Siswa         =");
            System.out.println("=============================");

            System.out.println("Nama: " + name);
            System.out.println("Kelas: " + level);
            System.out.println("Mata Pelajaran: " + subjectList[subjects - 1]);
            System.out.println("Nilai akhir anda: " + grade);
            if (grade >= 80 && grade <= 100) {
                System.out.println("Grade: " + gradeList[0]);
            } else if (grade >= 70 && grade < 80) {
                System.out.println("Grade: " + gradeList[1]);
            } else if (grade >= 50 && grade < 70) {
                System.out.println("Grade: " + gradeList[2]);
            } else {
                System.out.println("Grade: " + gradeList[3]);
            }
        }

        System.out.println("Apakah anda ingin menambahkan data baru? (y/n): ");
        String loops = scanner.next();
        if (loops.equalsIgnoreCase("y")) {
            dataInput();
        } else if (loops.equalsIgnoreCase("n")) {
            System.out.println("Proses Selesai. Terima kasih!");
            System.exit(-1);
        } else {
            System.out.println("Mohon maaf respon anda tidak dapat diproses. Silahkan coba lagi");
            System.exit(-1);
        }
        */
        }
    }

//todo: fill this method
    private static void grading(String name, String level, int subjects, int totalQuiz){
        int tempScore, grade = 0;

        for (int i = 0; i < totalQuiz; i++) {
            System.out.print("Nilai kuis " + (i + 1) + ": ");
            tempScore = scanner.nextInt();
            while (tempScore < 0 || tempScore > 100) {
                System.out.println("\nMasukan respon yang valid (0 <= Nilai <= 100)");

                System.out.print("Nilai kuis " + (i + 1) + ": ");
                tempScore = scanner.nextInt();
            }
            grade += tempScore;
        }
        grade /= totalQuiz;

        System.out.println("\n=============================");
        System.out.println("=        Data Siswa         =");
        System.out.println("=============================");

        System.out.println("Nama: " + name);
        System.out.println("Kelas: " + level);
        System.out.println("Mata Pelajaran: " + subjectList[subjects - 1]);
        System.out.println("Nilai akhir anda: " + grade);
        if (grade >= 80 && grade <= 100) {
            System.out.println("Grade: " + gradeList[0]);
        } else if (grade >= 70 && grade < 80) {
            System.out.println("Grade: " + gradeList[1]);
        } else if (grade >= 50 && grade < 70) {
            System.out.println("Grade: " + gradeList[2]);
        } else {
            System.out.println("Grade: " + gradeList[3]);
        }

        //todo: make a new loop method
        System.out.println("\n===============================================");
        System.out.println("Apakah anda ingin menambahkan data baru? (y/n): ");
        String loops = scanner.next();
            if (loops.equalsIgnoreCase("y")) {
            dataInput();
        } else if (loops.equalsIgnoreCase("n")) {
            System.out.println("Proses Selesai. Terima kasih!");
            System.exit(-1);
        } else {
            System.out.println("Mohon maaf respon anda tidak dapat diproses. Silahkan coba lagi");
            System.exit(-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("= Aplikasi Input Data Siswa =");
        System.out.println("=============================");

        dataInput();
    }
}