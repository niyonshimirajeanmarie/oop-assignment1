package auca.Exercise;

public class CalculateTotaMarksPercentageAndPassFail {
    public static void main(String[] args) {
        int[] marks = {80, 75, 90, 60, 85};
        int total = 0;

        for(int mark : marks) total += mark;

        double percentage = total / 5.0;
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);

        if(percentage >= 50) System.out.println("Pass");
        else System.out.println("Fail");
    }
}
