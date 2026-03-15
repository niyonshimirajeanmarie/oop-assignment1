package _27197.warehousemanagement.operations.dispatch;

public class DispatchGoods {
    public void dispatch(boolean productExists, int stock, int dispatchQuantity) {
        if (!productExists || stock < dispatchQuantity) {
            System.out.println("Dispatch Validation Failed: Product missing or insufficient stock.");
        } else {
            System.out.println("Dispatch Validation Succeeded: Goods dispatched.");
        }
    }
    public void method2_DispatchGoods() {
        System.out.println("Executing method2_DispatchGoods in DispatchGoods");
    }
    public void method3_DispatchGoods() {
        System.out.println("Executing method3_DispatchGoods in DispatchGoods");
    }
    public void method4_DispatchGoods() {
        System.out.println("Executing method4_DispatchGoods in DispatchGoods");
    }
    public void method5_DispatchGoods() {
        System.out.println("Executing method5_DispatchGoods in DispatchGoods");
    }
}

