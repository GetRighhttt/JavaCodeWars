package basic;

import java.util.Arrays;

public class ReturnBinaryNumbers {

    public static void main(String[] args) {
        /*
        Given a string of digits, you should
        replace any digit below 5 with '0' and any
        digit 5 and above with '1'. Return the resulting string.
         */

        System.out.println(fakeBin("101335168"));
    }

    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
