package basic;

public class ReturnAName {

    public static void main(String[] args) {
        /*
        Return a name from a function.
         */
        System.out.println(greet("Stefan"));
    }

    public static String greet(String name)
    {
        // Your code here
        return "Hello, " + name + " how are you doing today?";
    }
}
