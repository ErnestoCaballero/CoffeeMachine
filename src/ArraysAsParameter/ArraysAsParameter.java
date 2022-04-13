package ArraysAsParameter;

public class ArraysAsParameter {
    public static void main(String[] args) {
        boolean[] myBooleans = {true, true, false, false};
        traverseArray(myBooleans);
        inverseFlags(myBooleans);
        traverseArray(myBooleans);
    }

    /*
    INVERSE BOOLEAN FLAGS
    Write a body and a parameter of the method inverseFlags. The method must take an array of booleans
    and negate each of them. Do not make a copy of the parameter, change elements of a passed array.
     */

    public static void inverseFlags(boolean[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = !arr[i];
//        }
        int i = 0;
        for (boolean bool : arr) {
            arr[i] = !bool;
            i++;
        }
    }

    static void traverseArray(boolean[] arr) {
        for (boolean bool : arr) {
            System.out.print(bool + " ");
        }
        System.out.println();
    }
}
