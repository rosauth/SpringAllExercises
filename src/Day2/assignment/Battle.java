package Day2.assignment;

import java.util.Scanner;

public class Battle{
    public static void main(String[] args) {
        BattleAttribute battleAttribute = new BattleAttribute();
        Scanner scanner = new Scanner(System.in);

        int initialBullet = 0;

        // TODO: 8/13/2020 use thread to print each line
        System.out.println("=============== W E L C O M E ===============");
        System.out.println("=      This is a Gun Usage Simulation       =");
        System.out.println("=  Prepare yourself for a marvelous battle  =");
        System.out.println("=============================================");

        System.out.print("\nAre you ready?\n" +
                "Let's pick your gun first! (y/n): ");

        String pickChoice = scanner.next();
        while (!pickChoice.equalsIgnoreCase("y") && !pickChoice.equalsIgnoreCase("n")){
                System.out.println("Wrong input. Please try again");
                pickChoice = scanner.next();
        }
        if (pickChoice.equalsIgnoreCase("y")) {
            battleAttribute.pickGun();
            initialBullet = battleAttribute.currentBullet;
        } else if (pickChoice.equalsIgnoreCase("n")) {
            System.out.println("Bye! Hope you'll be back soon!");
            return;
        }

        System.out.println("\n    Let's start shootin'!");
        System.out.println("         Instruction" +
                "\n-----------------------------" +
                "\n1. Type '1' to shoot" +
                "\n2. Type 'c' to Change Gun" +
                "\n3. Type 'quit' to quit");

        while (true) {
            System.out.println("\nType your command: ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("1")) {
                if (initialBullet == 0) {
                    initialBullet = battleAttribute.currentBullet;
                }
                initialBullet = battleAttribute.shoot(initialBullet);
            }
            else if (choice.equalsIgnoreCase("c")){
                battleAttribute.changeGun();
            }
            else if (choice.equalsIgnoreCase("quit")){
                System.out.println("Thank you for playing!");
                return;
            }
            else {
                System.out.println("Wrong input. Please try again");
            }
        }

    }
}
