import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Receipt {
    private List<Product> cartItems;
    private double totalPrice;
    private Date date;

    // Constructor
    public Receipt(List<Product> cartItems, double totalPrice) {
        this.cartItems = cartItems;
        this.totalPrice = totalPrice;
        this.date = new Date();
    }

    // Method to print the receipt
    public void printReceipt() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-<<--dd HH:mm:ss");
        System.out.println("Receipt");
        System.out.println("Date: " + dateFormat.format(date));
        System.out.println("--------------------------");
        System.out.println("Items Purchased:");
        for (Product product : cartItems) {
            System.out.println("Name : " + product.getName() + ", Price: " + product.getPrice());
        }
        System.out.println("--------------------------");
        System.out.println("Total Price: " + totalPrice);
        System.out.println("--------------------------");
    }
}
