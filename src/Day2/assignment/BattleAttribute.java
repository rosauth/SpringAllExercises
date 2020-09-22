package Day2.assignment;

import java.util.Scanner;

public class BattleAttribute extends GunFunction{
    Gun gun = new Gun();

    Scanner scanner = new Scanner(System.in);

    String[] gunType = {"Revolver", "Riffle", "Shotgun", "SMG"};
    int currentBullet = 0;

    public void pickGun(){
        System.out.println("Type: ");
        for (int i = 0; i < gunType.length; i++) {
            System.out.println((i+1) + ". " + gunType[i]);
        }
        System.out.print("\nPlease choose from this following list: ");

        int chosenOption = scanner.nextInt();
        while (chosenOption > gunType.length){
            System.out.println("Wrong input. Please try again: ");
            chosenOption = scanner.nextInt();
        }
        String type = gunType[chosenOption-1];

        gun.setType(type);

        switch (chosenOption){
            case 1:
                gun.setTotalBullet(10);
                gun.setWeight(250);
                break;
            case 2:
            case 4:
                gun.setTotalBullet(50);
                gun.setWeight(500);
                break;
            case 3:
                gun.setTotalBullet(40);
                gun.setWeight(600);
                break;
            default:
                System.out.println("There is no such type of gun!");
                break;
        }

        System.out.println("\nAye! You have chose your gun." +
                "\nLet's custom it by your preference!");

        System.out.print("Name: ");
        String name = scanner.next();
        gun.setName(name);

        System.out.print("Color: ");
        String color = scanner.next();
        gun.setColor(color);

        System.out.println("\nYou are all set!" +
                "\nHere is your gun summary: " + gun.toString());

        currentBullet = gun.getTotalBullet();
    }

    public void changeGun(){
        System.out.print("Do you really want to change your gun? (y/n): ");
        String choice = scanner.next();
        while (!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y")){
            System.out.println("Please input the right answer (y/n): ");
            choice = scanner.next();
        }
        if (choice.equalsIgnoreCase("y")){
            pickGun();

            System.out.println("         Instruction" +
                    "\n-----------------------------" +
                    "\n1. Type '1' to shoot" +
                    "\n2. Type 'c' to Change Gun" +
                    "\n3. Type 'quit' to quit");
        }else {
            System.out.println("Thank you for playing!");
            System.exit(-1);
        }
    }

    @Override
    protected int shoot(int totalBullet) {
        totalBullet--;
        gun.setTotalBullet(totalBullet);
        System.out.println("Shot!");

        while (gun.getTotalBullet() == 0) {
            System.out.println("\nYou are running out of bullets!" +
                    "\nType '0' to reload your gun or 'quit' to stop shootin'!");

            String choice = scanner.next();
            if (choice.equalsIgnoreCase("0")){
                reload(gun.getType());
            }else if (choice.equalsIgnoreCase("quit")){
                System.out.println("Thank you for playing!");
                System.exit(-1);
            }else {
                System.out.println("Wrong input. Please try again!");
            }
        }
        return totalBullet;
    }

    @Override
    protected void reload(String type) {
        switch (type){
            case "Revolver":
                gun.setTotalBullet(10);
                break;
            case "Rifle":
            case "SMG":
                gun.setTotalBullet(50);
                break;
            case "Shotgun":
                gun.setTotalBullet(40);
                break;
            default:
                System.out.println("There is no such type of gun!");
                break;
        }
        System.out.println("Your gun has been reloaded. Total bullet: " + gun.getTotalBullet());
        currentBullet = gun.getTotalBullet();
    }
}