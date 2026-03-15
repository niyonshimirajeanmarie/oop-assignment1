package auca.Exercise;

import java.util.Scanner;

public class SimulateSimpleBankingTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;

        System.out.print("Enter deposit amount: ");
        balance += sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        balance -= sc.nextDouble();

        System.out.println("Current balance: " + balance);
    }
}
