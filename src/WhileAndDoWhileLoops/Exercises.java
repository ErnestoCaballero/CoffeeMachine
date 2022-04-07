package WhileAndDoWhileLoops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercises {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        maxDivisibleByFour();
//        largestOfSequence();
//        sumOfElements();
//        lengthOfSequence();
//        squaresNaturalNumbers();
//        System.out.println(factorial(7));
        smallestFactorial();

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

    /*
    The largest element of a sequence
    Given a sequence of positive integer numbers (which ends with the number 0). Find the largest element of the sequence.

    The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.
     */

    public static void largestOfSequence() {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int number;

        do {
            number = scanner.nextInt();
            max = Math.max(number, max);
        } while (number != 0);

        System.out.println(max);
    }

    /*
    The sum of elements
    Find the sum of all elements of a sequence, ending with the number 0.

    The number 0 itself is not included into the sequence and serves as a sign of cessation.
     */

    public static void sumOfElements() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println(sum);
    }

    /*
    The length of the sequence
    For its input, the program gets a sequence of non-negative integers; each integer is written in a separate line.
    The sequence ends with an integer 0; when the program reads 0, it should end its work and output the length of
    the sequence (not counting the final 0).

    Don’t read numbers following the number 0.
     */
    public static void lengthOfSequence() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (scanner.nextInt() != 0) {
            count++;
        }

        System.out.println(count);
    }

    /*
    Squares of natural numbers
    Read an integer number N from the input and print all the squares of positive integers:

        -less than or equal to N,
        -in ascending order.
     */
    public static void squaresNaturalNumbers() {
        int input = scanner.nextInt();
        int square;
        int i = 1;

        while (i <= Math.sqrt(input)) {
            square = (int) Math.pow(i, 2);
            System.out.println(square);
            i++;
        }
    }

    /*
    The smallest value
    A user inputs a long positive number m. You need to find out what is the smallest int number n such that n! > m.

    n!, or factorial n is a product of all natural numbers from 1 to n inclusive: for example, 5! = 5 * 4 * 3 * 2 * 1.
     */

    public static void smallestFactorial() {
        long m = scanner.nextLong();
        int n = 1;

        while (factorial(n) <= m) {
            n++;
        }

        System.out.println(n);
    }

    public static long factorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
