package basic;

public class StringSmashedTogether {
    /*
    Write a function that takes an array of words and smashes them together
    into a sentence and returns the sentence.
    You can ignore any need to sanitize words or
    add punctuation, but you should add spaces between each word.
    Be careful, there shouldn't be a space at the beginning
    or the end of the sentence.
     */
    public static void main(String[] args) {
        String[] arr = {"hello", "world", "stefan", "newest"};
        System.out.println(smash(arr));
        System.out.println(smasher(arr));
    }

    /*
    The StringBuilder class is used to create strings from dataStructures.

    We create an instance of the StringBuilder class, and then iterate through
    each word in the array with a for loop.

    We append each word as we iterate through passing in "i" with a space.

    Then we return the string builder instance and call the toString method.
     */
    public static String smash(String[] words) {
        StringBuilder stringBuild = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            stringBuild.append(words[i] + " ");
        }
        return stringBuild.toString().trim();
    }

    /*
    The join() method is used to join strings together trimmed.

    delimiters are used to determine the boundaries or limits.
     */
    public static String smasher(String... words) {
        return String.join(" ", words);
    }

    /*
    Other ways:

    Streams are used to return data without changing the data structure.

    return stream(words).collect(joining(" "));

    return Arrays.stream(words).collect(Collectors.joining(" "));
     */
}
