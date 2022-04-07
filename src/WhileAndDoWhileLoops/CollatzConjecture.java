package WhileAndDoWhileLoops;

import java.util.Scanner;

public class CollatzConjecture {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        collatz();
    }

    public static void collatz() {
        final int two = 2;
        final int three = 3;
        int n = scanner.nextInt();

        while (n != 1) {
            System.out.print(n + " ");
            n = n % two == 0 ? n / two : n * three + 1;
        }

        System.out.print(n + " ");
    }
}
