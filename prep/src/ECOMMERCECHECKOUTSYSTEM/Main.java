package ECOMMERCECHECKOUTSYSTEM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item ID: ");
        String itemId = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Coupon Code: ");
        String coupon = sc.nextLine();

        ECommerceSystem ec = new ECommerceSystem();

        ec.validateCart(itemId, qty)
                .validateAddress(address)
                .validateCoupon(coupon, 500)
                .validatePayment("Credit Card", "1234-5678-9876-5432")
                .confirmOrder("ORD001");
    }
}
