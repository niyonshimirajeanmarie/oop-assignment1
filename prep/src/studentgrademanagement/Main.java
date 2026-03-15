package studentgrademanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Class Name: ");
        String className = sc.nextLine();

        System.out.print("Enter Subject 1 Name: ");
        String sub1 = sc.nextLine();

        System.out.print("Enter Marks for Subject 1: ");
        double m1 = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Subject 2 Name: ");
        String sub2 = sc.nextLine();

        System.out.print("Enter Marks for Subject 2: ");
        double m2 = sc.nextDouble();

        GradeCalculator gc = new GradeCalculator();

        gc.validateStudent(name, roll, className)
                .validateMarks(sub1, m1)
                .validateMarks(sub2, m2)
                .calculateTotal(m1, m2)
                .generateReport();
    }
}
