import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        int i;
        int year;
        System.out.println("enter the year   ");
        Scanner sc = new Scanner(System.in);
     year = sc.nextInt();
        if (year< 2000 || year>2026) {

        }

     switch (year){
         case 1:

             if (year%4==0) {

                 System.out.println("the entered year is a leep year ");
             }
             break;
         default:
             System.out.println("the year entered is not leap year");
     }

    }
}

