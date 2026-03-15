package auca.Exercise;

public class DetermineTypeOfTriangleEquilateralIsoscelesScalene {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 8;

        if(a == b && b == c)
            System.out.println("Equilateral Triangle");
        else if(a == b || b == c || a == c)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }
}
