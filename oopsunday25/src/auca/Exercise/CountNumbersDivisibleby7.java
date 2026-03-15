package auca.Exercise;

public class CountNumbersDivisibleby7 {
    public static void main(String[] args) {
        int[] arr = {7, 14, 21, 10, 20, 28, 35, 9, 5, 42};
        int count = 0;

        for(int num : arr) {
            if(num % 7 == 0) count++;
        }

        System.out.println("Numbers divisible by 7: " + count);
    }
}
