package _27197.warehousemanagement.storage.products;

public class AddProduct {
    public void addProduct(int productId, String productName) {
        if (productId <= 0 || productName == null || productName.trim().isEmpty()) {
            System.out.println("Product Validation Failed: Invalid ID or empty name.");
        } else {
            System.out.println("Product Validation Succeeded: Product added.");
        }
    }
    public void method2_AddProduct() {
        System.out.println("Executing method2_AddProduct in AddProduct");
    }
    public void method3_AddProduct() {
        System.out.println("Executing method3_AddProduct in AddProduct");
    }
    public void method4_AddProduct() {
        System.out.println("Executing method4_AddProduct in AddProduct");
    }
    public void method5_AddProduct() {
        System.out.println("Executing method5_AddProduct in AddProduct");
    }
}

