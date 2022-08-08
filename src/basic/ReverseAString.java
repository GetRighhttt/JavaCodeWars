package basic;

public class ReverseAString {

    public static void main(String[] args) {
        /*
        ReverseAString.
         */
        System.out.println(solution("Buddy."));
    }

    /*
    We can use the StringBuffer class to reverse a string.
     */
    public static String solution(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
