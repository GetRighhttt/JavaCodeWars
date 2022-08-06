package basic;

import java.util.Arrays;

public class ReduceArrayValuesToOneValue {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(grow(array));
    }

    /*
    We can call the Arrays.stream() and use reduce() to
    return a result.
    */
    public static int grow(int[] x) {
        return Arrays.stream(x).reduce(1 ,(a, b) -> a * b);
    }
}
