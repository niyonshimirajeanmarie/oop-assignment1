package _27197.warehousemanagement.operations.receiving;

public class ReceiveGoods {
    public void receiveGoods(int quantity, boolean supplierExists) {
        if (quantity <= 0 || !supplierExists) {
            System.out.println("Receiving Validation Failed: Quantity must be > 0 and supplier must exist.");
        } else {
            System.out.println("Receiving Validation Succeeded: Goods received.");
        }
    }
    public void method2_ReceiveGoods() {
        System.out.println("Executing method2_ReceiveGoods in ReceiveGoods");
    }
    public void method3_ReceiveGoods() {
        System.out.println("Executing method3_ReceiveGoods in ReceiveGoods");
    }
    public void method4_ReceiveGoods() {
        System.out.println("Executing method4_ReceiveGoods in ReceiveGoods");
    }
    public void method5_ReceiveGoods() {
        System.out.println("Executing method5_ReceiveGoods in ReceiveGoods");
    }
}

