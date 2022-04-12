package DeclaringMethods;

import java.util.ArrayList;
import java.util.Collections;

public class DeclaringMethods {

    public static void main(String[] args) {
//        System.out.println(isVowel('A'));
        System.out.println(getNumberOfMaxParam(12, 3, 12));


    }

    /*
    VOWEL OR NOT
    Implement a method that checks whether a given English letter is a vowel or not. The input may be in any case.

    In our case, the letter 'y' is not considered a vowel.

    Examples:

    isVowel('a') should be true
    isVowel('A') should be true
    isVowel('b') should be false
     */

    public static boolean isVowel(char ch) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        for (char i : vowels) {
            if (ch == i) {
                return true;
            }
        }

        return false;
    }

    /*
    FIND THE MAX OF THREE NUMBERS
    Here is the method named getNumberOfMaxParam that takes three integer numbers and
    returns the position of the first maximum in the order of the method parameters.

    The method should return number 1, 2 or 3 respectively.

    Write just a body of the method.
     */
    public static int  getNumberOfMaxParam(int a, int b, int c) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        return arr.indexOf(Collections.max(arr)) + 1;
    }

}
