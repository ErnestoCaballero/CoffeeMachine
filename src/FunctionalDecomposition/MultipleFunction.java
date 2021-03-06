package FunctionalDecomposition;

import java.util.Scanner;

public class MultipleFunction {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double x = scanner.nextDouble();
//        System.out.println(f(x));
        int i = 1996;
        System.out.println(i);
    }

    public static double f(double x) {
        if (x <= 0) {
            return f1(x);
        } else if (x >= 1) {
            return f3(x);
        } else {
            return f2(x);
        }

    }

    public static double f1(double x) {
        return Math.pow(x, 2) + 1;
    }

    public static double f2(double x) {
        return 1 / (Math.pow(x, 2));
    }

    public static double f3(double x) {
        return Math.pow(x, 2) - 1;
    }
}
