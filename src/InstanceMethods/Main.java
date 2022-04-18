package InstanceMethods;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        printStatus(clock);
        clock.next();
        printStatus(clock);
    }

    static void printStatus(Clock clock) {
        System.out.println();
        System.out.println(clock.hours);
        System.out.println(clock.minutes);
    }
}
