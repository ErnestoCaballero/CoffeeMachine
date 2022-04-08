package BranchingStatements;

import java.util.Scanner;

public class Exercises {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        evenOrOdd();
//        integerBarrier();
//        busTour();
        theSequence();
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

    /*
    BUS TOUR
    A bus tour of Europe has been very successful. Due to an increase in the number of people who want to go on a tour,
    the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.

    But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these
    bridges. Can you find out if this will happen?

    The first line of the input contains the height of the bus and the number of bridges under which the bus passes.
    The second line contains the heights of these bridges.

    You should output "Will not crash" if everything will be alright; otherwise,
    output "Will crash on bridge i" (where i is the number of the bridge) into which the bus will crash.
    If the height of a bridge equals the height of the bus, the bus will crash.
     */

    public static void busTour() {
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        int bridgeHeight;
        boolean willCrash = false;
        int i = 1;

        for (; i <= bridges; i++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                willCrash = true;
                break;
            }
        }

        System.out.println(willCrash ? "Will crash on bridge " + i : "Will not crash");
    }

    /*
    THE SEQUENCE
    Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ...
    (the number is repeated as many times, to what it equals to).
    The input to the program is a positive integer n: the number of the elements of the sequence the program should print.
    Output the sequence of numbers, written in a single line, space-separated.

    For example, if n = 7, then the program should output 1 2 2 3 3 3 4.
     */

    public static void theSequence() {
        int nth = scanner.nextInt();
        int count = 0;
        int i = 1;

        while (nth != count) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                count++;

                if (nth == count) {
                    break;
                }
            }
            i++;
        }
    }
}
