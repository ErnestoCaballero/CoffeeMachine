package StaticMembers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.name = "Alfred";
        myClass.age = 78;
        System.out.println(myClass.instanceMethod() + " | from instance method");
        System.out.println();
        System.out.println(MyClass.classMethod(myClass) + " | from class method or static method");
    }
}
