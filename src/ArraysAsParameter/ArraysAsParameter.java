package ArraysAsParameter;

import java.util.Scanner;

public class ArraysAsParameter {
    public static void main(String[] args) {
//        sumArrayGreaterN();
        enterBox();

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

    public static int countOccurrences(int[] arr, int n) {
        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            count += n == arr[i] ? 1 : 0;
//        }
        for (int i : arr) {
            count += i == n ? 1 : 0;
        }
        return count;
    }

    /*
    THE SUM OF ARRAY ELEMENTS
    Write a program that calculates the sum of the elements of an array of ints.

    Input data format

    The first line contains the size of an array.
    The second line contains elements of the array separated by spaces.

    Output data format

    The sum of the input array elements.
     */
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    /*
    SUM ARRAY ELEMENTS GREATER THAN A VALUE
    Write a program that reads an array of ints and an integer number n.
    The program must sum all the array elements greater than n.

    Input data format

    The first line contains the size of an array.
    The second line contains the elements of the array separated by spaces.
    The third line contains the number n.

    Output data format

    Only a single number representing the sum.
     */
    public static int sumArrayGreaterValue(int[] arr, int n) {
        int sum = 0;
        for (int i : arr) {
            sum += i > n ? i : 0;
        }
        return sum;
    }

    public static void sumArrayGreaterN() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int sum = 0;

        for (int i : arr) {
            sum += i > n ? i : 0;
        }

        System.out.println(sum);
    }

    /*
    BOXES
    There are two boxes on the table. The first box has a size of X1 x Y1 x Z1,
    and the second box has a size of X2 x Y2 x Z2.
    You need to determine whether one of the boxes can be put inside the other.
    It should go in without sticking out. You can rotate both boxes as you want.

    Important: two equally sized boxes cannot be placed inside one another.
    See the third test case as an example of how the borderline case should be treated.

    Input consists of two lines:

    the first line contains numbers X1, Y1, Z1;
    the second line contains numbers X2, Y2, Z2.
    All numbers are integers and greater than 0.

    Output:

    "Box 1 < Box 2", if the first box can be put inside the second box ;
    "Box 1 > Box 2", if the second box can be put inside the first box;
    otherwise, output "Incompatible".
     */
    public static void enterBox() {
        final int sides = 3;
        Scanner scanner = new Scanner(System.in);
        int[] box1 = new int[sides];
        int[] box2 = new int[sides];

        for (int i = 0; i < sides; i++) {
            box1[i] = scanner.nextInt();
        }

        for (int i = 0; i < sides; i++) {
            box2[i] = scanner.nextInt();
        }
        System.out.println(isSmaller(box1, box2) ? "Box 1 < Box 2"
                : isSmaller(box2, box1) ? "Box 1 > Box 2"
                : "Incompatible");

    }

    public static Boolean isSmaller(int[] box1, int[] box2) {
        // starting position each side along side each other (x1, x2), (y1, y2), (z1, z2)
        boolean t1 = box1[0] < box2[0] && box1[1] < box2[1] && box1[2] < box2[2];
        // rotating 90° up in the x axis from starting position
        boolean t2 = box1[0] < box2[0] && box1[1] < box2[2] && box1[2] < box2[1];
        // rotating 90° right in the z axis from starting position
        boolean t3 = box1[0] < box2[1] && box1[1] < box2[0] && box1[2] < box2[2];
        // rotating 90° in the y axis and 90° up in the x axis from starting position
        boolean t4 = box1[0] < box2[1] && box1[1] < box2[2] && box1[2] < box2[0];
        // rotating 90° up in the y axis and 90° right in the z axis from starting position
        boolean t5 = box1[0] < box2[2] && box1[1] < box2[0] && box1[2] < box2[1];
        // rotating 90° up on the y axis from starting position
        boolean t6 = box1[0] < box2[2] && box1[1] < box2[1] && box1[2] < box2[0];

        boolean test1 = t1 || t2 || t3;
        boolean test2 = t4 || t5 || t6;

        return test1 || test2;
//        return box1[0] < box2[0] && box1[1] < box2[1] && box1[2] < box2[2]
//                || box1[0] < box2[0] && box1[1] < box2[2] && box1[2] < box2[1]
//                || box1[0] < box2[1] && box1[1] < box2[0] && box1[2] < box2[2]
//                || box1[0] < box2[1] && box1[1] < box2[2] && box1[2] < box2[0]
//                || box1[0] < box2[2] && box1[1] < box2[0] && box1[2] < box2[1]
//                || box1[0] < box2[2] && box1[1] < box2[1] && box1[2] < box2[0];
    }

}
