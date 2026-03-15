package auca.Exercise;

public class CountNumberOfWordsInString {
    public static void main(String[] args) {
        String str = "Jean Marie Niyonshimira";
        String[] words = str.split(" ");
        System.out.println("Number of words: " + words.length);
    }
}
