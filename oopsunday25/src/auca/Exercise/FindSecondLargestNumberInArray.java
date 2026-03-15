package auca.Exercise;

public class FindSecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 20, 8, 15, 1, 9, 7, 14};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest number: " + secondLargest);
    }
}
