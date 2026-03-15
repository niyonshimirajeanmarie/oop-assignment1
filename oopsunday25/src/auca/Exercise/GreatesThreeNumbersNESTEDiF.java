package auca.Exercise;

public class GreatesThreeNumbersNESTEDiF {
    public static void main(String[] args) {
        int a = 5, b = 8, c = 3;
        int greatest;

        if(a > b) {
            if(a > c)
                greatest = a;
            else
                greatest = c;
        } else {
            if(b > c)
                greatest = b;
            else
                greatest = c;
        }

        System.out.println("Greatest: " + greatest);
    }
}
