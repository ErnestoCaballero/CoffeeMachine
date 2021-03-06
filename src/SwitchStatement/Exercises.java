package SwitchStatement;

import java.util.*;

public class Exercises {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        direction2();
//        shape();
//        stringToNumber2();
//        harryPotter();
//        harryPotter2();
//        areaOfRoom();
//        simpleCalculator();


    }

    /*
    DIRECTION
    Write a program, which reads the number of direction (1 – up, 2 – down, 3 – left, 4 – right, 0 – do not move)
    and outputs the text "move up" (or "move down", or "move left", or "move right", or "do not move"
    depending on the entered number). If it is a number that does not belong to any of the listed directions,
    the program should output "error!"

    Note: the output text should exactly match the sample, including the letters’ case and location of spaces.
     */

    private static void direction() {
        String direction = scanner.nextLine();

        switch (direction) {
            case "0":
                System.out.println("do not move");
                break;
            case "1":
                System.out.println("move up");
                break;
            case "2":
                System.out.println("move down");
                break;
            case "3":
                System.out.println("move left");
                break;
            case "4":
                System.out.println("move right");
                break;
            default:
                System.out.println("error!");
                break;
        }
    }

    public static void direction2() {
        String[] output = {"do not move", "move up", "move down", "move left", "move right"};

        try {
            System.out.println(output[scanner.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error!");
        }
    }

    /*
    SHAPE
    Write a program, which reads the number of the shape (1 – square, 2 – circle, 3 – triangle, 4 – rhombus)
    and prints the text "You have chosen a square" (or circle, or triangle, or rhombus, depending on the number).
    If it is a number that doesn't correspond to any of the listed shapes,
    the program should output: "There is no such shape!".

    Note: the output text should exactly match the sample, including letters' case and location of spaces.
     */

    public static void shape() {
        String input = scanner.nextLine();
        String msg = "You have chosen a ";

        switch (input) {
            case "1":
                System.out.println(msg + "square");
                break;
            case "2":
                System.out.println(msg + "circle");
                break;
            case "3":
                System.out.println(msg + "triangle");
                break;
            case "4":
                System.out.println(msg + "rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
        }
    }

    /*
    FROM STRING TO NUMBER
    Write a program that reads a string from the standard input and outputs the number.
    A number can be from 1 to 9 (inclusive).
     */
    public static void stringToNumber() {
        String input = scanner.nextLine();

        switch (input) {
            case "one":
                System.out.println("1");
                break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            case "four":
                System.out.println("4");
                break;
            case "five":
                System.out.println("5");
                break;
            case "six":
                System.out.println("6");
                break;
            case "seven":
                System.out.println("7");
                break;
            case "eight":
                System.out.println("8");
                break;
            case "nine":
                System.out.println("9");
                break;
            default:
                System.out.println();
                break;
        }
    }

    /*
    stringToNumber() using Arrays.asList() which returns an ArrayList
     */
    public static void stringToNumber2() {
        String input = scanner.nextLine();
        List<String> numbers = Arrays.asList("zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine");
        System.out.println(numbers.indexOf(input));
    }

    /*
    HARRY POTTER
    Harry Potter needs help identifying what each house means.

    Read a string representing a house and output the following:

    if it is "gryffindor", output "bravery";
    if it is "hufflepuff", output "loyalty";
    if it is "slytherin", output "cunning";
    if it is "ravenclaw", output "intellect";
    otherwise, output "not a valid house".
     */

    public static void harryPotter() {
        String house = scanner.nextLine();

        switch (house) {
            case "gryffindor":
                System.out.println("bravery");
                break;
            case "hufflepuff":
                System.out.println("loyalty");
                break;
            case "slytherin":
                System.out.println("cunning");
                break;
            case "ravenclaw":
                System.out.println("intellect");
                break;
            default:
                System.out.println("not valid house");
                break;
        }
    }

    public static void harryPotter2() {
        String input = scanner.nextLine();
        Map<String, String> houses = new HashMap<>();
        houses.put("gryffindor", "bravery");
        houses.put("hufflepuff", "loyalty");
        houses.put("slytherin", "cunning");
        houses.put("ravenclaw", "intellect");

        System.out.println(houses.getOrDefault(input, "not a valid house"));
    }

    /*
    FLOOR-SPACE OF THE ROOM
    Citizens of the country named Malevia often experiment with the shapes of their rooms.
    The rooms can be triangular, rectangular, and round.

    Write a program that calculates the floor area of the rooms.

    Input data format: The type of the room shape and the relevant parameters.

    Output data format: The area of the resulting room.

    Note that the value of 3.14 is used instead of the number π in Malevia.
     */

    public static void areaOfRoom() {
        String shape = scanner.nextLine();

        switch (shape) {
            case "triangle":
                System.out.println(areaTriangle());
                break;
            case "rectangle":
                System.out.println(areaRectangle());
                break;
            case "circle":
                System.out.println(areaCircle());
                break;
            default:
                System.out.println();
                break;
        }
    }

    private static double areaTriangle() {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static double areaRectangle() {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        return a * b;
    }

    private static double areaCircle() {
        final double pi = 3.14;
        double r = scanner.nextInt();
        return pi * Math.pow(r, 2);
    }

    /*
    SIMPLE CALCULATOR
    Write a simple calculator that reads the three values from the line: the first number, the operation, and the second number.

    The program should apply the operation to the numbers entered ("first number" "operation" "second number") and output the result to the screen. Note that the numbers are long.

    The calculator should support:

    addition: "+"
    subtraction: "-"
    integer division: "/"
    multiplication: "*"
    If a user performs division and the second number is 0, it is necessary to output the line "Division by 0!".

    If the input operator is not one from the list, the program should output "Unknown operator".

    Note: it's recommended to use the switch statement in your solution.
     */

    public static void simpleCalculator() {
        long a = scanner.nextLong();
        String operand = scanner.next();
        long b = scanner.nextLong();

        switch (operand) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(b == 0 ? "Division by 0!" : a / b);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }

}
