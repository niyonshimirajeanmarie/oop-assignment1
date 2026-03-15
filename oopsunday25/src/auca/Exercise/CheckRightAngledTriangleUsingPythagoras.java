package auca.Exercise;

public class CheckRightAngledTriangleUsingPythagoras {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;

        if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
            System.out.println("Right-Angled Triangle");
        else
            System.out.println("Not Right-Angled Triangle");
    }
}
