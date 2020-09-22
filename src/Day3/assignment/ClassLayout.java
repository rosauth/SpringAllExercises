package Day3.assignment;

import java.util.Scanner;

public class ClassLayout {
    private final String[][] chairLayout = new String[2][3];
    private final String doubleSeparator = "========================================";

    public void layout(String student){
        int nullIndex1 = 0;
        int nullIndex2 = 0;
        for (int i = 0; i<chairLayout.length; i++) {
            for (int j = 0; j<chairLayout[i].length; j++) {
                if (chairLayout[i][j] == null){
                    nullIndex1 = i;
                    nullIndex2 = j;
                }
            }
        }
        if (!student.equals("")) {
            chairLayout[nullIndex1][nullIndex2] = student;
        }
        view();
    }

    public void view(){
        String separator = "-----------------------------------------";
        System.out.println(separator);
        for (String[] strings : chairLayout) {
            for (String string : strings) {
                System.out.printf("%-15s", string);
            }
            System.out.println(" ");
        }
        System.out.println(separator);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassLayout classLayout = new ClassLayout();

        System.out.println(classLayout.doubleSeparator);
        System.out.println("= Selamat Datang di Tahun Ajaran Baru =");
        System.out.println(classLayout.doubleSeparator);

        System.out.println("\nTempat duduk kosong yang masih dapat diisi (null): ");
        classLayout.layout("");

        System.out.print("\nNama siswa: ");
        String name = scanner.next();
        classLayout.layout(name);

        while (true) {
            System.out.print("Apakah anda ingin menambahkan siswa lagi? (y/n): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("y")) {
                System.out.print("\nNama siswa: ");
                name = scanner.next();
                classLayout.layout(name);
            }else {
                System.out.println("Thank you");
                return;
            }
        }


    }
}
