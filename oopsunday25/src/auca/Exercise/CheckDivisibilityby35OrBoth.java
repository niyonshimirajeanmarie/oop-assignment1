package auca.Exercise;

public class CheckDivisibilityby35OrBoth {
    public static void main(String[] args) {
        int num = 15;

        if(num % 3 == 0 && num % 5 == 0)
            System.out.println(num + " is divisible by both 3 and 5");
        else if(num % 3 == 0)
            System.out.println(num + " is divisible by 3");
        else if(num % 5 == 0)
            System.out.println(num + " is divisible by 5");
        else
            System.out.println(num + " is divisible by neither 3 nor 5");
    }

}
