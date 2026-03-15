package _27197.warehousemanagement;

import _27197.warehousemanagement.storage.products.*;
import _27197.warehousemanagement.storage.inventory.*;
import _27197.warehousemanagement.storage.sections.*;
import _27197.warehousemanagement.storage.suppliers.*;
import _27197.warehousemanagement.storage.warehouseareas.*;
import _27197.warehousemanagement.operations.receiving.*;
import _27197.warehousemanagement.operations.dispatch.*;
import _27197.warehousemanagement.operations.transfers.*;
import _27197.warehousemanagement.operations.auditing.*;
import _27197.warehousemanagement.operations.reports.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- WAREHOUSE MANAGEMENT SYSTEM ---\n");

        
        System.out.println(">> Product Management:");
        AddProduct ap = new AddProduct();
        ap.addProduct(101, "Laptop");
        ap.addProduct(0, ""); 
        new ViewProduct().method1_ViewProduct();
        new SearchProduct().method1_SearchProduct();
        System.out.println();

        
        System.out.println(">> Inventory Management:");
        CheckInventory ci = new CheckInventory();
        ci.checkInventoryLevel(20, 10);
        ci.checkInventoryLevel(5, 10); 
        new AuditInventory().method1_AuditInventory();
        new AlertLowInventory().method1_AlertLowInventory();
        System.out.println();

        
        System.out.println(">> Storage & Logistics:");
        new AddSection().method1_AddSection();
        new AddArea().method1_AddArea();
        new AddSupplier().method1_AddSupplier();
        System.out.println();

        
        System.out.println(">> Warehouse Operations:");
        ReceiveGoods rg = new ReceiveGoods();
        rg.receiveGoods(50, true);
        
        DispatchGoods dg = new DispatchGoods();
        dg.dispatch(true, 50, 20);

        CreateTransfer ct = new CreateTransfer();
        ct.transfer(true);
        System.out.println();

        
        System.out.println(">> Auditing & Reporting:");
        new AuditLogs().method1_AuditLogs();
        new InventoryReport().method1_InventoryReport();
        new DailyWarehouseReport().method1_DailyWarehouseReport();
        
        System.out.println("\n--- SYSTEM RUN COMPLETED SUCCESSFULY ---");
    }
}

