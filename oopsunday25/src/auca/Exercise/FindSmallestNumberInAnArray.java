package auca.Exercise;

public class FindSmallestNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 20, 8, 15, 1, 9, 7, 14};
        int smallest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest) smallest = arr[i];
        }

        System.out.println("Smallest number: " + smallest);
    }
}
