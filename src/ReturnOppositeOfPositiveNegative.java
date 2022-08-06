public class ReturnOppositeOfPositiveNegative {

    public static void main(String[] args) {
        /*
        Very simple, given an integer or a floating-point number, find its opposite.
         */
        int numberOne = -45;
        int numberTwo = 55;
        int numberThree = -80;
        System.out.println(opposite(numberOne));
        System.out.println(opposite(numberTwo));
        System.out.println(opposite(numberThree));
    }

    public static int opposite(int number) {
        return (number > 0) ? Math.negateExact(number) : Math.abs(number);
    }
}
