public class ReturnNumberBasedOnOperatorsAndInput {
    public static void main(String[] args) {
        /*
        Your task is to create a function that does four basic mathematical operations.
        The function should take three arguments - operation(string/char), value1(number), value2(number).
        The function should return result of numbers after applying the chosen operation.
         */

        int x = 89;
        int y = 123;

        System.out.println(basicMath("+", x, y));
        System.out.println(basicMath("-", x, y));
        System.out.println(basicMath("*", x, y));
        System.out.println(basicMath("/", x, y));

    }

    /*
    We can use a switch statement when working with conditionals and operators.

    We can also use ternary operators with chaining.

        return (op=="+") ? (v1+v2) : (op=="-") ? (v1-v2) : (op=="*") ? (v1*v2) : (v2==0) ? null : (v1/v2);

     */
    public static Integer basicMath(String op, int v1, int v2) {
        int theValue = switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> 0;
        };
        return theValue;
    }
}
