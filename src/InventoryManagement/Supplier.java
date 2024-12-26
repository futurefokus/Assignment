package InventoryManagement;

public class Supplier {
    public Supplier() {}

    public Supplier(String name, int supplierId, Product product) {
        this.name = name;
        this.supplierId = supplierId;
        this.product = product;
    }

    private String name;
    private int supplierId;
    private Product product;

    public String getName() {
        return this.name;
    }

    public int getSupplierId() {
        return this.supplierId;
    }

    public String getProductName() {
        return this.product.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getProductDetails() {
        return this.getName() + " supplies the product: " + this.getProductName();
    }

    public void isOlderThan(Supplier supplier) {
        if (this.supplierId < supplier.getSupplierId()) {
            System.out.println(this.name + " has been in business longer than " + supplier.getName());
        } else {
            System.out.println(this.name + " has not been in business longer than " + supplier.getName());
        }
    }
}
