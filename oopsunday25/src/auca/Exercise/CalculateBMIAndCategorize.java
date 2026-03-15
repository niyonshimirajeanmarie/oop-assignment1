package auca.Exercise;

public class CalculateBMIAndCategorize {
    public static void main(String[] args) {
        double weight = 70; // kg
        double height = 1.75; // meters

        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        if(bmi < 18.5) System.out.println("Underweight");
        else if(bmi < 25) System.out.println("Normal");
        else if(bmi < 30) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}
