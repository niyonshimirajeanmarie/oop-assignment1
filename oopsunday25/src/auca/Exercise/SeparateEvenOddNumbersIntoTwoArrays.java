package auca.Exercise;

public class SeparateEvenOddNumbersIntoTwoArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] evens = new int[arr.length];
        int[] odds = new int[arr.length];
        int eIndex = 0, oIndex = 0;

        for(int num : arr) {
            if(num % 2 == 0) evens[eIndex++] = num;
            else odds[oIndex++] = num;
        }

        System.out.print("Even numbers: ");
        for(int i = 0; i < eIndex; i++) System.out.print(evens[i] + " ");
        System.out.print("\nOdd numbers: ");
        for(int i = 0; i < oIndex; i++) System.out.print(odds[i] + " ");
    }
}
