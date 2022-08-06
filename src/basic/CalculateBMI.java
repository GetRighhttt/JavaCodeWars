package basic;

public class CalculateBMI {
    public static void main(String[] args) {
        /*
        Write function bmi that calculates body mass index (bmi = weight / height2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
         */

        System.out.println(bmi(80.0, 50.0));

    }

    public static String bmi(double weight, double height) {
        double yourWeight = weight / Math.pow(height, 2);
        return (yourWeight > 0) && yourWeight<= 18.5 ? "Underweight" :
                yourWeight <= 25.0 ? "Normal" :
                        yourWeight <= 30.0 ? "Overweight" : "Obese";
    }
}
