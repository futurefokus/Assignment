import InventoryManagement.Product;
import InventoryManagement.Supplier;
import InventoryManagement.Inventory;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Laptop", 101, 1200.00);
        products[1] = new Product("Smartphone", 102, 800.00);
        products[2] = new Product("Tablet", 103, 600.00);

        Inventory[] inventories = new Inventory[3];
        inventories[0] = new Inventory("Pinduoduo", "Kazakhstan", products);
        inventories[1] = new Inventory("AliExpress", "China", products);
        inventories[2] = new Inventory("Ozon", "Russia", products);
        inventories[0].displayProducts();
        System.out.println();

        Supplier supplier1 = new Supplier("TechSupplier1", 201, products[1]);
        Supplier supplier2 = new Supplier("TechSupplier2", 202, products[0]);
        Supplier supplier3 = new Supplier("TechSupplier3", 203, products[2]);
        System.out.println(supplier1.getProductDetails());
        System.out.println(supplier2.getProductDetails());
        System.out.println(supplier3.getProductDetails());
        System.out.println();

        supplier1.isOlderThan(supplier2);
        supplier2.isOlderThan(supplier3);
    }
}
