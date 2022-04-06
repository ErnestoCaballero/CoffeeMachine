package com.ernesto;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int waterPerCup = 200;  // ml
        final int milkPerCup = 50;  // ml
        final int coffeePerCup = 15;  // g
        System.out.println("Write how many cups of coffee you will need:");
        int numCups = scanner.nextInt();

        System.out.println("For " + numCups + " cups of coffee you will need: \n" +
                numCups * waterPerCup + " ml of water\n" +
                numCups * milkPerCup + " ml of milk\n" +
                numCups * coffeePerCup + " g of coffee beans");
    }
}
