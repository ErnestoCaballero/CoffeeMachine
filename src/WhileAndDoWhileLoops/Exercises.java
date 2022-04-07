package WhileAndDoWhileLoops;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
//        maxDivisibleByFour();
//        largestOfSequence();
//        sumOfElements();
        lengthOfSequence();

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
        int number;

        while ((number = scanner.nextInt()) != 0) {
            count++;
        }

        System.out.println(count);
    }
}
