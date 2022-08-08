package kyu7;

import java.util.stream.Stream;

public class ShortestWordInString {

    public static void main(String[] args) {
        /*
        Return the length of the shortest word in a string.
         */
        System.out.println(findShort("This is the day that the lord has made!"));

    }

    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
