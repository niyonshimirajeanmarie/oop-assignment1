package auca.Exercise;

public class SimulateStoreCheckoutwithDiscount {
    public static void main(String[] args) {
        double[] prices = {100, 200, 150};
        double total = 0;

        for(double price : prices) total += price;

        double discount = 0;
        if(total > 500) discount = total * 0.1;

        double finalTotal = total - discount;

        System.out.println("Total Price: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalTotal);
    }
}
