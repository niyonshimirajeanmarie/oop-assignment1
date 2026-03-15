package auca.Exercise;

public class FindLargestOfFourNumbersUsingIfStatements {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15, d = 5;
        int largest = a;

        if(b > largest) largest = b;
        if(c > largest) largest = c;
        if(d > largest) largest = d;

        System.out.println("Largest number: " + largest);
    }
}
