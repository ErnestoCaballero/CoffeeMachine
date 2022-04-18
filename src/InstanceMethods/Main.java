package InstanceMethods;

public class Main {
    public static void main(String[] args) {
        Tree t1 = new Tree();
        Tree t2 = t1;
        Tree t3 = t2;

        t1 = new Tree();
        t1.age = 5;
        t2.age = 10;
        t3  = null;
        System.out.println(t1.age);
        System.out.println(t2.age);
        System.out.println(t3.age);
    }

    static void printStatus(Clock clock) {
        System.out.println();
        System.out.println(clock.hours);
        System.out.println(clock.minutes);
    }
}
