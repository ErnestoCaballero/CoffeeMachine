package ArraysAsParameter;

import java.util.Scanner;

public class ArraysAsParameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        System.out.println(countCoincidence(arr, n));
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

    static void traverseArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    /*
    COUNT HOW MANY TIMES A NUMBER OCCURS
    Write a program that reads an array of ints and an integer number n.

    The program must check how many times n occurs in the array.

    Input data format
    The first line contains the size of the input array.

    The second line contains elements of the array separated by spaces.

    The third line contains n.

    Output data format

    The result is only a single non-negative integer number.
     */
    public static void populateArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static int countCoincidence(int[] arr, int n) {
        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            count += n == arr[i] ? 1 : 0;
//        }
        for (int i : arr) {
            count += i == n ? 1 : 0;
        }
        return count;
    }

    

}
