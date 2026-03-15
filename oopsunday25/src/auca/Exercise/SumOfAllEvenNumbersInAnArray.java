package auca.Exercise;

public class SumOfAllEvenNumbersInAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 20, 8, 15, 1, 9, 7, 14};
        int sumEven = 0;

        for(int num : arr) {
            if(num % 2 == 0) sumEven += num;
        }

        System.out.println("Sum of even numbers: " + sumEven);
    }
}
