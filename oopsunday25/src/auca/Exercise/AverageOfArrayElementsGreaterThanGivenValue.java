package auca.Exercise;

public class AverageOfArrayElementsGreaterThanGivenValue {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 20, 8};
        int threshold = 7;
        int sum = 0, count = 0;

        for(int num : arr) {
            if(num > threshold) {
                sum += num;
                count++;
            }
        }

        double average = (count > 0) ? (double)sum / count : 0;
        System.out.println("Average of numbers > " + threshold + ": " + average);
    }
}
