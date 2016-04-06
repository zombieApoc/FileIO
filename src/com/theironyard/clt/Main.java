package com.theironyard.clt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Firearms boom = new Firearms();
        Scanner scanner = new Scanner(System.in);
        System.out.println("thank you for choosing the Firearms Registration System.");
        System.out.println("Please enter the type of weapon you are registering.");
        boom.type = scanner.nextLine();
        System.out.println("Please enter the caliber.");
        boom.caliber = scanner.nextDouble();
        System.out.println("Please enter the action of your weapon.");
        boom.action = scanner.nextLine();
        System.out.println("please enter the bore type.");
        boom.bore = scanner.nextLine();
        System.out.println("please enter the year your firearm was originally manufactured.");
        boom.year = scanner.nextInt();
    }
}
