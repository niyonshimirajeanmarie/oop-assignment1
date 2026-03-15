package auca.Exercise;

public class DetermineCharacterType {
    public static void main(String[] args) {
        char ch = 'A';

        if(Character.isDigit(ch))
            System.out.println("Digit");
        else if(Character.isUpperCase(ch))
            System.out.println("Uppercase Letter");
        else if(Character.isLowerCase(ch))
            System.out.println("Lowercase Letter");
        else
            System.out.println("Special Character");
    }
}
