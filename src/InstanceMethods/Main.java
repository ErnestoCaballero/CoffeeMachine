package InstanceMethods;

public class Main {
    public static void main(String[] args) {
//        Clock clock = new Clock();
//        printStatus(clock);
//        clock.next();
//        printStatus(clock);

        Complex complex1 = new Complex();
        complex1.real = 10;
        complex1.imaginary = 4;
        System.out.println(complex1.toString());

        Complex complex2 = new Complex();
        complex2.real = 6;
        complex2.imaginary = 6;
        System.out.println(complex2.toString());
        System.out.println();

        complex1.add(complex2);
        System.out.println(complex1.toString());
    }

    static void printStatus(Clock clock) {
        System.out.println();
        System.out.println(clock.hours);
        System.out.println(clock.minutes);
    }
}
