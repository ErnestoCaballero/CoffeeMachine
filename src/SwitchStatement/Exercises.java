package SwitchStatement;

import java.util.*;

public class Exercises {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        direction2();
//        shape();
//        stringToNumber2();
//        harryPotter();
        harryPotter2();

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

}
