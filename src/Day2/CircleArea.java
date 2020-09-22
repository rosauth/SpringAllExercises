package Day2;

import java.util.Scanner;

/*
* Author: Rosa
* 8/13/2020
*/

public class CircleArea {
    final double phi = Math.PI;
    double radius;

    public double radiusInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nCircle radius: ");
        radius = scanner.nextDouble();

        return radius;
    }

    public double calculate(double radius) {
        return (phi * radius * radius);
    }

    public double startCalculating() {
        return calculate(radiusInput());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("=   Calculate Circle Area  =");
        System.out.println("============================");

        while (true) {
            System.out.print("Do you want to calculate a new circle? (y/n): ");
            if (scanner.next().equalsIgnoreCase("y")) {
                System.out.printf("Circle area: %.2f \n", new CircleArea().startCalculating());
            } else {
                System.out.println("Thank you!");
                return;
            }
        }

    }
}
