package com.ernesto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    final static int espressoCode = 1;
    final static int latteCode = 2;
    final static int cappuccinoCode = 3;

    static CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);

    public static void main(String[] args) {
//        coffeeRequest();
//        numberOfServings();
        machineStatusMessage();
        takeAction();




    }

    public static void machineStatusMessage() {
        System.out.println("The coffee machine has:");
        System.out.println((int) coffeeMachine.getMlOfWater() + " ml of water");
        System.out.println((int) coffeeMachine.getMlOfMilk() + " ml of milk");
        System.out.println((int) coffeeMachine.getGmOfCoffeeBeans() + " g of coffee beans");
        System.out.println(coffeeMachine.getNumCups() + " disposable cups");
        System.out.println("$" + (int) coffeeMachine.getMoney() + " of money");
        System.out.println();
    }

    public static void takeAction() {
        System.out.println("Write action (buy, fill, take): ");
        String action = scanner.nextLine();

        switch (action) {
            case "buy":
                buyProduct();
                break;
            case "fill":
                fillMachine();
                break;
            case "take":
                withdrawMoney();
                break;
            default:
                System.out.println("Option not available");
                break;
        }
        System.out.println();
        machineStatusMessage();
    }

    private static void buyProduct() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        String product = scanner.nextLine();

        switch (product) {
            case "1":
                buyCoffee(espressoCode);
                break;
            case "2":
                buyCoffee(latteCode);
                break;
            case "3":
                buyCoffee(cappuccinoCode);
                break;
            default:
                System.out.println("Option not available!");
                break;
        }
    }

    private static void buyCoffee(int n) {
        CoffeeType coffeeType = coffeeMachine.getCoffeeTypeList().get(n - 1);
        coffeeMachine.setMlOfWater(coffeeMachine.getMlOfWater() - coffeeType.getWaterPerCup());
        coffeeMachine.setMlOfMilk(coffeeMachine.getMlOfMilk() - coffeeType.getMilkPerCup());
        coffeeMachine.setGmOfCoffeeBeans(coffeeMachine.getGmOfCoffeeBeans() - coffeeType.getCoffeePerCup());
        coffeeMachine.setNumCups(coffeeMachine.getNumCups() - coffeeType.getCup());
        coffeeMachine.setMoney(coffeeMachine.getMoney() + coffeeType.getPrice());
    }

    private static void fillMachine() {
        System.out.println("Write how many ml of water you want to add: ");
        double fillWater = scanner.nextDouble();
        coffeeMachine.setMlOfWater(coffeeMachine.getMlOfWater() + fillWater);
        System.out.println("Write how many ml of milk you want to add: ");
        double fillMilk = scanner.nextDouble();
        coffeeMachine.setMlOfMilk(coffeeMachine.getMlOfMilk() + fillMilk);
        System.out.println("Write how many grams of coffee beans you want to add: ");
        double fillCoffeeBeans = scanner.nextDouble();
        coffeeMachine.setGmOfCoffeeBeans(coffeeMachine.getGmOfCoffeeBeans() + fillCoffeeBeans);
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int fillCups = scanner.nextInt();
        coffeeMachine.setNumCups(coffeeMachine.getNumCups() + fillCups);
    }

    public static void withdrawMoney() {

    }


    public static void coffeeRequest() {
//        System.out.println("Write how many cups of coffee you will need:");
//        int numCups = scanner.nextInt();
//
//        System.out.println("For " + numCups + " cups of coffee you will need: \n" +
//                numCups * waterPerCup + " ml of water\n" +
//                numCups * milkPerCup + " ml of milk\n" +
//                numCups * coffeePerCup + " g of coffee beans");
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

//        int[] arr = {availableWater / waterPerCup, availableMilk / milkPerCup, availableCoffee / coffeePerCup};
//        Arrays.sort(arr);
//        int maxPossibleCups = arr[0];

//        if (cupsRequest == maxPossibleCups) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (cupsRequest < maxPossibleCups) {
//            System.out.println("Yes, I can make that amount of coffee (and even " + (maxPossibleCups - cupsRequest)
//                    + " more than that)");
//        } else {
//            System.out.println("No, I can make only " + maxPossibleCups + " cup(s) of coffee");
//        }
    }

    private static class CoffeeMachine {
        private List<CoffeeType> coffeeTypeList;
        private double mlOfWater;
        private double mlOfMilk;
        private double gmOfCoffeeBeans;
        private int numCups;
        private double money;

        public CoffeeMachine(double mlOfWater, double mlOfMilk, double gmOfCoffeeBeans, int numCups, double money) {
            this.mlOfWater = mlOfWater;
            this.mlOfMilk = mlOfMilk;
            this.gmOfCoffeeBeans = gmOfCoffeeBeans;
            this.numCups = numCups;
            this.money = money;
            this.coffeeTypeList = new ArrayList<>();
            this.coffeeTypeList.add(new Espresso());
            this.coffeeTypeList.add(new Latte());
            this.coffeeTypeList.add(new Cappuccino());

        }

        public List<CoffeeType> getCoffeeTypeList() {
            return coffeeTypeList;
        }


        public double getMlOfWater() {
            return mlOfWater;
        }

        public void setMlOfWater(double mlOfWater) {
            this.mlOfWater = mlOfWater;
        }

        public double getMlOfMilk() {
            return mlOfMilk;
        }

        public void setMlOfMilk(double mlOfMilk) {
            this.mlOfMilk = mlOfMilk;
        }

        public double getGmOfCoffeeBeans() {
            return gmOfCoffeeBeans;
        }

        public void setGmOfCoffeeBeans(double gmOfCoffeeBeans) {
            this.gmOfCoffeeBeans = gmOfCoffeeBeans;
        }

        public int getNumCups() {
            return numCups;
        }

        public void setNumCups(int numCups) {
            this.numCups = numCups;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }

    }

    private static class CoffeeType {
        private final int cup = 1;
        private String name;
        private double waterPerCup;
        private double milkPerCup;
        private int coffeePerCup;
        private double price;

        public CoffeeType(String name, double waterPerCup, double milkPerCup, int coffeePerCup, double price) {
            this.name = name;
            this.waterPerCup = waterPerCup;
            this.milkPerCup = milkPerCup;
            this.coffeePerCup = coffeePerCup;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCup() {
            return cup;
        }

        public double getWaterPerCup() {
            return waterPerCup;
        }

        public void setWaterPerCup(double waterPerCup) {
            this.waterPerCup = waterPerCup;
        }

        public double getMilkPerCup() {
            return milkPerCup;
        }

        public void setMilkPerCup(double milkPerCup) {
            this.milkPerCup = milkPerCup;
        }

        public int getCoffeePerCup() {
            return coffeePerCup;
        }

        public void setCoffeePerCup(int coffeePerCup) {
            this.coffeePerCup = coffeePerCup;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    private static class Espresso extends CoffeeType {
        public Espresso() {
            super("espresso",250, 0, 16, 4);
        }

    }

    private static class Latte extends CoffeeType {
        public Latte() {
            super("latte", 350, 75, 20, 7);
        }

    }

    private static class Cappuccino extends CoffeeType {
        public Cappuccino() {
            super("cappuccino", 200, 100, 12, 6);
        }

    }

}
