import java.util.Scanner;

public class Hotel {

    static Scanner sc = new Scanner(System.in);

    static String guestName;
    static int roomNumber;
    static int daysStayed;
    static double costPerDay;
    static double foodCharges;

    static double roomCost;
    static double serviceCharges;
    static double tax;
    static double grossBill;
    static double discount;
    static double finalBill;
    static String category;

    public static void main(String[] args) {

        recordGuestInfo();
        calculateRoomCost();
        calculateFoodCost();
        calculateServiceCharges();
        calculateTax();
        calculateGrossBill();
        calculateDiscount();
        calculateFinalBill();
        determineGuestCategory();
        displayBillReport();
    }

    public static void recordGuestInfo() {
        System.out.println("Enter Guest Name:");
        guestName = sc.nextLine();

        System.out.println("Enter Room Number:");
        roomNumber = sc.nextInt();

        System.out.println("Enter Number of Days Stayed:");
        daysStayed = sc.nextInt();

        System.out.println("Enter Cost Per Day:");
        costPerDay = sc.nextDouble();

        System.out.println("Enter Food Charges:");
        foodCharges = sc.nextDouble();
    }

    public static void calculateRoomCost() {
        roomCost = daysStayed * costPerDay;
    }

    public static void calculateFoodCost() {
    }

    public static void calculateServiceCharges() {
        serviceCharges = roomCost * 0.05;
    }

    public static void calculateTax() {
        double subtotal = roomCost + foodCharges + serviceCharges;
        tax = subtotal * 0.18;
    }

    public static void calculateGrossBill() {
        grossBill = roomCost + foodCharges + serviceCharges + tax;
    }

    public static void calculateDiscount() {
        if (grossBill > 5000) {
            discount = grossBill * 0.10;
        } else if (grossBill > 3000) {
            discount = grossBill * 0.05;
        } else {
            discount = 0;
        }
    }

    public static void calculateFinalBill() {
        finalBill = grossBill - discount;
    }

    public static void determineGuestCategory() {
        if (finalBill > 5000) {
            category = "VIP";
        } else if (finalBill > 3000) {
            category = "Premium";
        } else {
            category = "Standard";
        }
    }

    public static void displayBillReport() {
        System.out.println("\n===== HOTEL BILL REPORT =====");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Days Stayed: " + daysStayed);
        System.out.println("Room Cost: " + roomCost);
        System.out.println("Food Charges: " + foodCharges);
        System.out.println("Service Charges: " + serviceCharges);
        System.out.println("Tax: " + tax);
        System.out.println("Gross Bill: " + grossBill);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalBill);
        System.out.println("Guest Category: " + category);
        System.out.println("==============================");
    }
}
