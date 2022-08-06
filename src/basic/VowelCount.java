package basic;

public class VowelCount {

    public static void main(String[] args) {
        /*
        Count vowels in a string.

        one answer:
            return str.replaceAll("[^aeiou]","").length();

         */

        System.out.println(getCount("Here we are on the glorious day of August."));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
           String[] arr = str.split("");

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "a":
                    vowelsCount++;
                    break;
                case "e":
                    vowelsCount++;
                    break;
                case "i":
                    vowelsCount++;
                    break;
                case "o":
                    vowelsCount++;
                    break;
                case "u":
                    vowelsCount++;
                    break;
            }
        }

        return vowelsCount;
    }
}
