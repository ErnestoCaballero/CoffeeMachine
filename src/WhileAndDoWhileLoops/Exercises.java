package WhileAndDoWhileLoops;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        maxDivisibleByFour();

    }

    /*
    The sequence
    You are given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
    As input, the program gets the number of elements in the sequence, and then the elements themselves.
    In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000.
    The program should print a single number: the maximum element of the sequence divisible by 4.

    Try to solve this problem by using a while-loop.
     */
    public static void maxDivisibleByFour() {
        Scanner scanner = new Scanner(System.in);
        final int divisor = 4;

        int iterations = scanner.nextInt();
        int maxDivisibleByFour = 0;
        int i = 0;
        int number;


        while (i < iterations) {
            number = scanner.nextInt();
            maxDivisibleByFour = number % divisor == 0 && number > maxDivisibleByFour ? number : maxDivisibleByFour;
            i++;
        }

        System.out.println(maxDivisibleByFour);
    }
}
