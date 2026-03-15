package auca.Exercise;

public class AssignDiscountBasedOnPurchaseAmount {
    public static void main(String[] args) {
        double purchaseAmount = 600;
        double discount = 0;

        if(purchaseAmount >= 1000)
            discount = 0.2;
        else if(purchaseAmount >= 500)
            discount = 0.1;
        else
            discount = 0;

        System.out.println("Discount: " + (discount * 100) + "%");
    }
}
