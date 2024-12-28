package test241226.Exercise4;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Product> products = new HashMap<>();
        List<Invoice> invoices = new ArrayList<>();

        String filePath = "src/test241226/Exercise4/MUAHANG.in";
        try (Scanner in = new Scanner(new File(filePath))) {
            // Input product information
            int numProducts = Integer.parseInt(in.nextLine());
            while(numProducts-- > 0) {
                Product product = new Product(
                    in.nextLine(),      // productId
                    in.nextLine(),      // productName
                    in.nextLine(),      // price
                    in.nextLine()       // warranty
                );
                products.put(product.getProductId(), product);
            }

            // Input customer information
            int numInvoices = Integer.parseInt(in.nextLine());
            int initialCustomerNumber = 0;
            while(numInvoices-- > 0) {
                String customerName = in.nextLine();
                String customerAddress = in.nextLine();
                String productId = in.nextLine();
                int quantity = Integer.parseInt(in.nextLine());
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate purchaseDate = LocalDate.parse(in.nextLine(), formatter);
                Product product = products.get(productId);
                int customerNumber = ++initialCustomerNumber;

                Invoice invoice = new Invoice(
                    customerName,
                    customerAddress,
                    productId,
                    quantity,
                    purchaseDate,
                    product,
                    customerNumber
                );
                invoices.add(invoice);
            }
        }
        
        Collections.sort(invoices, (a, b) -> {
            int dateCompare = a.getWarrentyExpireDate().compareTo(b.getWarrentyExpireDate());
            if (dateCompare == 0) {
                return a.getCustomerId().compareTo(b.getCustomerId());
            }
            return dateCompare;
        });

        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }
}
