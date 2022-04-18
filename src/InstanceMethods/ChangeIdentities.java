package InstanceMethods;

public class ChangeIdentities {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Anita";
        p1.age = 28;

        Person p2 = new Person();
        p2.name = "Elisabet";
        p2.age = 29;

        System.out.println("p1 = " + p1.name + " " + p1.age);
        System.out.println("p2 = " + p2.name + " " + p2.age);

        changeIdentities(p1, p2);
//        Person hold = p1;
//        p1 = p2;
//        p2 = hold;


        System.out.println("p1 = " + p1.name + " " + p1.age);
        System.out.println("p2 = " + p2.name + " " + p2.age);

    }

    static void changeIdentities(Person p1, Person p2) {
        Person hold = new Person();
        hold.name = p2.name;
        hold.age = p2.age;

        p2.name = p1.name;
        p2.age = p1.age;

        p1.name = hold.name;
        p1.age = hold.age;
    }
}
