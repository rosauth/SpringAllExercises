package Day1;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nilaiAwal = 5;
        int nilaiAkhir = 5;

        System.out.print("Masukan nilai 1: ");
        int nilai1 = scan.nextInt();

        System.out.print("Masukan nilai 2: ");
        int nilai2 = scan.nextInt();

//        System.out.print("Masukan nilai 3 (desimal): ");
//        double nilai3 = scan.nextDouble();

        System.out.println("Nilai 1: " + nilai1);
        System.out.println("Nilai 2: " + nilai2);

        int calculate = nilai2 / (nilaiAkhir + (nilaiAwal*nilai1));
        System.out.println("Hasil kalkulasi: " + calculate);

    }
}
