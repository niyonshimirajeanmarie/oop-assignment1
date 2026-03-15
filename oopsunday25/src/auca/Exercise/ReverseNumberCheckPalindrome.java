package auca.Exercise;

public class ReverseNumberCheckPalindrome {
    public static void main(String[] args) {
        int number = 121;
        int original = number;
        int reverse = 0;

        while(number > 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }

        System.out.println("Reversed Number: " + reverse);

        if(original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
