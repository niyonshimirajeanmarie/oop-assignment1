package _27197;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double income;
        double turnoveramount = 0.118;
        double balance;

        TaxCalculate j = new TaxCalculate();

        System.out.println("enter the income as you want ");
        Scanner sc = new Scanner(System.in);
        income = sc.nextDouble();

        // ✅ Proper validation
        if (income <= 0) {
            System.out.println("Invalid income! Please enter a value greater than 0.");
            return; // stop program
        }
        else {
            balance = income * turnoveramount;
            System.out.println("Initial turnover balance = " + balance);
        }

        // ✅ VERY IMPORTANT: send income to TaxCalculate class
        j.income = income;

        // Call calculations
        j.calculateturnover();
        j.calculatepensioncontribution();
        j.calculatevat();
        j.calculateincometax();
        j.calculatepaye();
        j.calculaterentaltax();
        j.calculateinsurancepremium();
        j.calculatematernitycontribution();
        j.calculatemedicalcontribution();
        j.calculatewithholdingtax();
    }
}