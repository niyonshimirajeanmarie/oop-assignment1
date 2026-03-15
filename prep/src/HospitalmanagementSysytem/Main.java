package HospitalmanagementSysytem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        HospitalSystem hs = new HospitalSystem();

        hs.registerPatient(name, age, gender)
                .recordVitals(36.5, 120, 80)
                .assignDoctor("General")
                .diagnosis("Flu")
                .prescription("Take rest")
                .billing(5000);
    }
}