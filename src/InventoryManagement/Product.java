package InventoryManagement;

public class Product {
    private String name;
    private int productId;
    private double price;

    public Product(String name, int productId, double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', productId=" + productId + ", price=" + price + "}";
    }
}
