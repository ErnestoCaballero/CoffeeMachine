package ArraysAsParameter;

import java.util.Scanner;

public class ArraysAsParameter {
    public static void main(String[] args) {
//        sumArrayGreaterN();
//        enterBox();
//        rotateArray();
//        isContain();
//        indexOfMax();
//        indexOfMax2();
//        triples();
//        containTwoNumbers();
//        isAscending();
//        isAscending2();
//        maxAdjacentProduct();
        individualTaxes();


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

    static void traverseArray(double[] arr) {
        for (double bool : arr) {
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

    static void traverseArray(String[] arr) {
        for (String n : arr) {
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

    /*
    RIGHT ROTATION
    A right rotation is an operation that shifts each element of an array to the right. For example, if an array is {1,2,3,4,5} and we right rotate it by 1, the new array will be {5,1,2,3,4}. If we rotate it by 2, the new array will be {4,5,1,2,3}. It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.

    Write a program that performs a right rotation on an array by a given number.

    Input format:
    The first line is an array of numbers.
    The second line is the number of rotations.

    Output format:
    Resulting array
     */
    public static void rotateArray() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rotations = scanner.nextInt();

        rotateArrayByN(input, rotations);
        System.out.println(String.join(" ", input));
    }

    public static void rotateArrayByN(String[] arr, int rotations) {
        rotations = rotations % arr.length;
        for (int i = 0; i < rotations; i++) {
            rotateArrayByOne(arr);
        }
    }

    public static void rotateArrayByOne(String[] arr) {
        String last = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    /*
    DOES AN ARRAY CONTAIN N?
    Write a program that reads an array of integers and an integer.
    The program must check if the array contains that number.

    Input data format

    The first line: the size of an array.

    The second line: all the elements of the array separated by the space.

    The third line: one integer.

    Output data format

    Only a single value: true or false.
     */

    public static void isContain() {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[scanner.nextInt()];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();

        for (int i : input) {
            if (i == n) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }

    /*
    THE INDEX OF THE FIRST MAX IN AN ARRAY
    Write a program that reads an array of ints and finds the index of the first maximum in that array.

    Input data format

    The first line contains the number of elements in the array.

    The second line contains the array elements separated by spaces.

    An array always has at least one element.

    Output data format

    Only a single integer value: the index of the first maximum.
     */

    public static void indexOfMax() {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[scanner.nextInt()];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        System.out.println(indexOf(input, findMax(input)));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
        }

        return max;
    }

    public static int indexOf(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void indexOfMax2() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] array = new int[length];
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);
    }

    /*
    TRIPLES

    Write a program that reads an array of ints and outputs the number of "triples" in the array.

    A "triple" is three consecutive ints in increasing order differing by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not). Triples may overlap. For example, the sequence 1, 2, 3, 4, 5 contains three triples: 1, 2, 3; 2, 3, 4; and 3, 4, 5.

    Input data format

    The first line contains the size of an array.
    The second line contains elements of the array separated by spaces.

    Output data format

    Only a single integer value: the number of "triples".
     */

    public static void triples() {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[scanner.nextInt()];
        populateArray(input, scanner);
        int triples = 0;

        for (int i = 0; i < input.length - 2; i++) {
            if (input[i + 1] - input[i] == 1 && input[i + 2] - input[i + 1] == 1) {
                triples++;
            }
        }
        System.out.println(triples);
    }

    public static void populateArray(int[] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static void populateArray(String[] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }
    }


    /*
    Write a program that reads an unsorted array of integers and two numbers n and m.
    The program must check if n and m occur next to each other in the array (in any order).

    Input data format

    The first line contains the size of an array.
    The second line contains elements of the array.
    The third line contains two integer numbers n and m.
    All numbers in the same line are separated by the space character.

    Output data format

    Only a single value: true or false.
     */

    public static void containTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        String[] input = new String[len];
        populateArray(input, scanner);
        String n = scanner.next();
        String m = scanner.next();
        boolean flag = false;

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i].equals(n) && input[i + 1].equals(m) || input[i].equals(m) && input[i + 1].equals(n)) {
                flag = true;
                break;
            }
        }

        System.out.println(flag);
    }

    /*
    CHECK IF AN ARRAY IS SORTED ASCENDING
    Write a program that reads an array of int's and checks if the array is sorted ascending (from smallest to largest number).

    Input data format

    The first line contains the size of an array.
    The second line contains elements of the array separated by spaces.

    Output data format

    Only a single value: true or false.
     */

    public static void isAscending() {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] input = new int[len];
        populateArray(input, scanner);
        boolean flag = true;

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }

    public static void isAscending2() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        arr[0] = scanner.nextInt();

        for (int i = 1; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] < arr[i - 1]) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }

    /*
    THE MAXIMUM PRODUCT OF ADJACENT ELEMENTS
    Write a program that reads an array of ints and outputs the maximum product of two adjacent elements in the
    given array of non-negative numbers.

    Input data format

    The first line of the input contains the number of elements in the array.

    The second line contains the elements of the array separated by spaces.

    The array always has at least two elements.
     */
    public static void maxAdjacentProduct() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        int maxProd = arr[0] * arr[1];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            maxProd = Math.max(arr[i] * arr[i - 1], maxProd);
        }

        System.out.println(maxProd);
    }

    /*
    INDIVIDUAL TAXES
    In some country, there are N companies, and the law of that country says that the taxes of each company are individual
    and appointed by the president. The president wants to know which company pays the most taxes.
    But sadly, none of the president's proxies know math very well, so this work is transferred to you.
    Can you solve this problem?

    The first line of the input contains N which is the number of companies in the country.
    The second line contains the yearly incomes of each company. All numbers are non-negative integers.
    The third line contains individual taxes for each company in percent of the company's income.
    All numbers are integers from 0 to 100 inclusive.

    You should output the number of the company that pays the most taxes.
    Keep in mind that the enumeration of the companies starts with number 1.
    If there are several companies with the same payment sizes, output the number of the company with the lowest number.

    Note: be careful not to lose fractional parts while performing your calculations.
    All input and output numbers are integers, but you may have to use a different type for storing intermediate values.
     */
    public static void individualTaxes() {
        Scanner scanner = new Scanner(System.in);
        final double percentage = 100;
        int len = scanner.nextInt();
        int[] companies = new int[len];
        int[] taxRate = new int[len];
        populateArray(companies);
        populateArray(taxRate);

        double[] totalTaxes = new double[len];
        for (int i = 0; i < len; i++) {
            totalTaxes[i] = companies[i] * taxRate[i] / percentage;
        }

        int maxIndex = 0;

        for (int i = 0; i < totalTaxes.length; i++) {
            if (totalTaxes[i] > totalTaxes[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println(maxIndex + 1);
    }
}
