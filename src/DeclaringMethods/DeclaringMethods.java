package DeclaringMethods;

public class DeclaringMethods {

    public static void main(String[] args) {
        System.out.println(isVowel('A'));
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

    
}
