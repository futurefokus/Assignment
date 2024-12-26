package InventoryManagement;

public class Inventory {
    private String warehouseName;
    private String location;
    private Product[] products;

    public Inventory(String warehouseName, String location, Product[] products) {
        this.warehouseName = warehouseName;
        this.location = location;
        this.products = products;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public String getLocation() {
        return location;
    }

    public Product[] getProducts() {
        return products;
    }

    public void displayProducts() {
        System.out.println("Products in " + warehouseName + " (" + location + "):");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
