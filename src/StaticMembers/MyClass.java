package StaticMembers;

public class MyClass {
    String name;
    int age;

    String instanceMethod() {
        return this.name + " " + this.age;
    }

    static String classMethod(MyClass myClass) {
        return myClass.name + " " + myClass.age;
    }
}
