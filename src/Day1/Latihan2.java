package Day1;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double inputValue;
        double result = 0;

        System.out.print("Input loop value: ");
        int loop = scanner.nextInt();
        System.out.println("========================");

        for (int i = 0; i <= loop; i++) {
            System.out.println("Loop " + i);
            System.out.print("Input value (" + (i+1) + "): ");
            inputValue = scanner.nextDouble();

            double tempResult;
            if (i%2==0){
                tempResult = inputValue * loop;
            }
            else {
                tempResult = inputValue / loop;
            }
            result += tempResult;
            System.out.println("Result: " + tempResult);
            System.out.println("========================");
        }
        System.out.println("Final result: " + result);
    }
}