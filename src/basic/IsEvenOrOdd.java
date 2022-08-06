package basic;

public class IsEvenOrOdd {

    /*
    Write a function to check and see if a solution is even or odd.
     */

    public static void main(String[] args) {
        int testNumber = 300;
        int secondNumber = 99;
        int thirdNumber = 3563;
        System.out.println(returnEvenOrOdd(testNumber));
        System.out.println(returnEvenOrOdd(secondNumber));
        System.out.println(returnEvenOrOdd(thirdNumber));
    }

    public static String returnEvenOrOdd(int number) {
        return (Math.round(number) % 2 == 0) ? "Even" : "Odd";
    }
}

/**
 * Output:
 * Even
 * Odd
 * Odd
 */
