package auca.Exercise;

public class CountVowelsInString {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0;

        for(char c : str.toLowerCase().toCharArray()) {
            if("aeiou".indexOf(c) != -1) {
                vowels++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
    }
}
