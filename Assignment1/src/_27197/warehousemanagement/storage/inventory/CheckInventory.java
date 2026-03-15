package _27197.warehousemanagement.storage.inventory;

public class CheckInventory {
    public void checkInventoryLevel(int quantity, int threshold) {
        if (quantity < threshold) {
            System.out.println("Inventory Validation Failed: Low inventory alert triggered.");
        } else {
            System.out.println("Inventory Validation Succeeded: Inventory level OK.");
        }
    }
    public void method2_CheckInventory() {
        System.out.println("Executing method2_CheckInventory in CheckInventory");
    }
    public void method3_CheckInventory() {
        System.out.println("Executing method3_CheckInventory in CheckInventory");
    }
    public void method4_CheckInventory() {
        System.out.println("Executing method4_CheckInventory in CheckInventory");
    }
    public void method5_CheckInventory() {
        System.out.println("Executing method5_CheckInventory in CheckInventory");
    }
}

