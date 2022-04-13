package ArraysAsParameter;

public class ArraysAsParameter {
    public static void main(String[] args) {
        inverseFlags(new boolean[] {true, false});
    }

    /*
    INVERSE BOOLEAN FLAGS
    Write a body and a parameter of the method inverseFlags. The method must take an array of booleans
    and negate each of them. Do not make a copy of the parameter, change elements of a passed array.
     */

    public static void inverseFlags(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = !arr[i];
        }
    }
}
