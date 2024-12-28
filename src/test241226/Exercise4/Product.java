package test241226.Exercise4;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private int warrantyMonths;

    public Product(String productId, String productName, String priceStr, String warrantyStr) {
        this.productId =  productId;
        this.productName = productName;
        this.price = Double.parseDouble(priceStr);
        this.warrantyMonths = Integer.parseInt(warrantyStr);
    }

    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public int getWarrentyMonths() { return warrantyMonths; }

}
