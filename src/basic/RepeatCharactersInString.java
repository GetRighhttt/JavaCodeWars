package basic;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RepeatCharactersInString {

    public static void main(String[] args) {
        /*
        Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
         */

        System.out.println(doubleChar("Here I am."));
    }

    public static String doubleChar(String s){
        return s.replaceAll(".", "$0$0");
    }
}
