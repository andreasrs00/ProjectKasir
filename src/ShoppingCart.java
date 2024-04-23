import java.util.ArrayList;
import  java.util.List;

public class ShoppingCart {
    private List<Product> cartItems;

    // constructor
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // add a product to shoppingcart
    public void addToCart(Product product){
        cartItems.add(product);
        System.out.println(product.getName() + " was successfully added to the cart" );
    }

    // Calculate the total shopping price in the basket
    public double calculateTotalPrice(){
        double totalPrice = 0;
        for (Product product : cartItems){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    // Displays the contents of the shopping cart
    public void displayCartItems() {
        System.out.println("Shopping Cart Contents:");
        for (Product product : cartItems) {
            System.out.println("Name : " + product.getName() + ", Price: " + product.getPrice());
        }
    }

    // Empty the shopping cart
    public void clearCart() {
        cartItems.clear();
        System.out.println("The shopping cart was successfully emptied.");
    }

}
