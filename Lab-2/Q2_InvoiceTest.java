public class Q2_InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(
                "P1234",
                "Hammer",
                5,
                12.50);

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    String getPartNumber() {
        return partNumber;
    }

    void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    String getPartDescription() {
        return partDescription;
    }

    void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    int getQuantity() {
        return quantity;
    }

    void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    double getPricePerItem() {
        return pricePerItem;
    }

    // Calculate invoice amount
    double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}
