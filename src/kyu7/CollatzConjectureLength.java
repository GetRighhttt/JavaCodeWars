package kyu7;

public class CollatzConjectureLength {
    public static void main(String[] args) {
        /*
        For any natural number (positive) if it is even, divide by 2.
        If it is odd, multiply by 3 and add one.

        Return the length of numbers.
         */
        System.out.println(conjecture(20));
    }

    public static long conjecture(long x) {
        long counter = 1;
        while(x != 1){
            x = (x % 2 == 0) ? x/2: x*3+1;
            ++counter;
        }
        return counter;
    }
}
