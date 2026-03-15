package auca.Exercise;

public class CountUppercaseLetters {
    public static void main(String[] args) {
        String str = "Hello World";
        int uppercase = 0;

        for(char c : str.toCharArray()) {
            if(Character.isUpperCase(c)) uppercase++;
        }

        System.out.println("Uppercase letters: " + uppercase);
    }
}
