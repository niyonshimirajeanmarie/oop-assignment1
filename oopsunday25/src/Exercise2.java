import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  area;
        int r;
        double p=3.14;
        String perimeter;
        int a;
        int b;
        int c;
        System.out.println("enter the radius as a number ");
        r =sc.nextInt();
        System.out.println("enter the values of the a b c to calculate the perimeter of triangle ");
        a =sc.nextInt();
        b =sc.nextInt();
        c =sc.nextInt();

        System.out.println(" the area of circle = " +r*r*p);
        System.out.println("the perimeter of triangle " +a+b+c);

       sc.close();

    }
}
