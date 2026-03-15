package auca;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double marks;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of the student as requested ");
        marks = sc.nextInt();
        if (marks <= 90 && marks >= 100) {
            System.out.println("he is in class A");
        } else if (marks <= 80 && marks >= 90) {
            System.out.println("he belong to B");


        } else if (marks >= 80 && marks >= 70) {
            System.out.println("he belongs to C");


        } else if (marks >= 70 && marks >= 50) {
            System.out.println("he belongs to class D");

        } else {
            System.out.println("he belongs to E");
        }


        sc.close();


    }
}
