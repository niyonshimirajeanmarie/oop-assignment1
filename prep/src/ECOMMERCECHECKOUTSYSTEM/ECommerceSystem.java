package ECOMMERCECHECKOUTSYSTEM;

public class ECommerceSystem {

    public ECommerceSystem validateCart(String itemId, int qty) {
        if(itemId.trim().isEmpty()) System.out.println("Item ID invalid!");
        if(qty<=0) System.out.println("Quantity must be greater than zero!");
        System.out.println("Cart validated.");
        return this;
    }

    public ECommerceSystem validateAddress(String address) {
        if(address.trim().isEmpty()) System.out.println("Address cannot be empty!");
        System.out.println("Address validated.");
        return this;
    }

    public ECommerceSystem validateCoupon(String code, double orderValue) {
        if(code.trim().isEmpty()) System.out.println("Coupon code invalid!");
        if(orderValue<=0) System.out.println("Order value invalid!");
        System.out.println("Coupon validated.");
        return this;
    }

    public ECommerceSystem validatePayment(String method, String details) {
        if(method.trim().isEmpty()) System.out.println("Payment method invalid!");
        if(details.trim().isEmpty()) System.out.println("Payment details invalid!");
        System.out.println("Payment validated.");
        return this;
    }

    public ECommerceSystem confirmOrder(String orderId) {
        if(orderId.trim().isEmpty()) System.out.println("Order ID invalid!");
        System.out.println("Order confirmed successfully.");
        return this;
    }
}
