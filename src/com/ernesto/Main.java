package com.ernesto;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    final static int waterPerCup = 200;  // ml
    final static int milkPerCup = 50;  // ml
    final static int coffeePerCup = 15;  // g

    public static void main(String[] args) {
//        coffeeRequest();
        numberOfServings();

    }

    public static void coffeeRequest() {
        System.out.println("Write how many cups of coffee you will need:");
        int numCups = scanner.nextInt();

        System.out.println("For " + numCups + " cups of coffee you will need: \n" +
                numCups * waterPerCup + " ml of water\n" +
                numCups * milkPerCup + " ml of milk\n" +
                numCups * coffeePerCup + " g of coffee beans");
    }

    public static void numberOfServings() {
        System.out.println("Write how many ml of water the coffee machine has: ");
        int availableWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int availableMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int availableCoffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsRequest = scanner.nextInt();

        int[] arr = {availableWater / waterPerCup, availableMilk / milkPerCup, availableCoffee / coffeePerCup};
        Arrays.sort(arr);
        int maxPossibleCups = arr[0];

        if (cupsRequest == maxPossibleCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsRequest < maxPossibleCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maxPossibleCups - cupsRequest)
                    + " more than that)");
        } else {
            System.out.println("No, I can make only " + maxPossibleCups + " cup(s) of coffee");
        }
    }

}
