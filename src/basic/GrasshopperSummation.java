package basic;

public class GrasshopperSummation {
    public static void main(String[] args) {
        /*
        Write a program that finds the summation
        of every number from 1 to num.
        The number will always be a positive integer greater than 0
         */
    }

    /*
    We can always find the sum of numbers it takes to reach a number
    by multiplying the original number by
    itself minus 1, and dividing
    that number by 2.

    5 * (5-1) / 2 = 10
    1 + 2 + 3 + 4 = 10
     */
    public static int summation(int n) {

        return (n > 0) ? n * (n + 1) / 2 : 0;
    }
}
