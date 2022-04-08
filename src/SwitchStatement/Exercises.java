package SwitchStatement;

import java.util.Scanner;

public class Exercises {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        direction2();
        shape();

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
}
