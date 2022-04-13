package Tests;

import java.util.Arrays;

public class Tests {
    public static void main(String[] args) {
        double[] arr = new double[] {};
        System.out.println(arr[0]);



    }

    public static void traverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void addOneToArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }



}
