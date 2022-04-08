package BranchingStatements;

import java.util.Scanner;

public class Exercises {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        evenOrOdd();
        integerBarrier();
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

    /*
    The integer barrier
    Write a program that inputs a sequence of integer numbers in a loop and calculates their sum under the following conditions:

    1) if a new number is 0, the program must stop the loop and output the accumulated sum;

    2) if the sum is equal to or exceeds the limit of 1000, the program must also stop reading the numbers
    and output the value equal to the sum minus 1000.

    Note: the input can contain extra numbers. Just ignore them.
     */

    public static void integerBarrier() {
        final int barrier = 1_000;

        int sum = 0;
        
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 0 || sum >= barrier) {
                break;
            }
            sum += number;
        }

        System.out.println(sum >= barrier ? sum - barrier : sum);
    }
}
