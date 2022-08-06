package basic;

import java.util.Arrays;

public class ConvertStringToArray {
    public static void main(String[] args) {

        /*
        Write a function to convert a string to an array.
         */
        String newString = "I am here baby girl! Where are you?";
        System.out.println(Arrays.toString(stringToArray(newString)));
    }
    public static String[] stringToArray(String s) {
        //your code;
        return s.split(" ");
    }
}
