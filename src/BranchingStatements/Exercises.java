package BranchingStatements;

import java.util.Scanner;

public class Exercises {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        evenOrOdd();

    }

    /*
    Even or odd
    Given a sequence of natural numbers. Read numbers from the input, line by line,
    and for each number print if it is even or odd; if the number 0 is entered, don't print anything,
    immediately stop reading further numbers and terminate your program.

    Input data

    A sequence of natural numbers, each number in a new line.

    Output data

    The sequence of words "even" and "odd". Each word is in a new line.

    Output the result right after the number is entered. Then input the next one.
    There's no need to store the sequence.
     */

    public static void evenOrOdd() {
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            System.out.println(number % 2 == 0 ? "even" : "odd");
        }
    }
}
