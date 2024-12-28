package test241226.Exercise4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Invoice {
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String productId;
    private int quantity;
    private LocalDate purchaseDate;
    private double totalPrice;
    private LocalDate warrentyExpireDate;
    
    public Invoice(
        String customerName, String customerAddress, String productId, 
        int quantity, LocalDate purchaseDate, Product product, int customerNumber 
    ) {
        this.customerId = String.format("KH%02d", customerNumber);
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.productId = productId;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
        this.totalPrice = product.getPrice()*quantity;
        this.warrentyExpireDate = purchaseDate.plusMonths(product.getWarrentyMonths());
    }

    public String getCustomerId() { return this.customerId; }
    public LocalDate getWarrentyExpireDate() { return this.warrentyExpireDate; }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%s %s %s %s %f, %s", customerId, customerName, customerAddress, 
        productId, totalPrice, warrentyExpireDate.format(formatter));
    }
}
