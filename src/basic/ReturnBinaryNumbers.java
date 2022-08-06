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

    /*
    Below we use the replaceALl() method to replace every String with a binary number given constraints.

    We could also do it this way:
            return str.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(joining());

     */
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
