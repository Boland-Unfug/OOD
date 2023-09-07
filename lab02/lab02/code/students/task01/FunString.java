package students.task01;

public class FunString {

    private String str;

    public FunString(String str) {

        this.str = str;

    }
    
    // Counts the total number of vowels in a String.

    public int countVowels() {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                count++;

            }
        }

        return count;
    }

    // Counts a String's total number of digits (0~9).

    public int countDigits() {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                count++;

            }
        }

        return count;
    }

    // print the string

    public String toString() {
        return str;
    }

    // get the length of the string

    public int length() {
        return str.length();

    }
    
}


// Trying to extend the String class did not work, because it is a final class
// Composition did work, because the methods used in the string class can be reused in the FunString class to mimic its functionality

// The length method was not working because it was not defined within the class, so it was not able to be called on the object
// fixed by using the length method from the String class within the FunString class length method
