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

    // Remove a product from the shopping cart
    public void removeFromCart(String productName) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getName().equals(productName)) {
                cartItems.remove(i);
                System.out.println(productName + " was successfully removed from the cart.");
                return;
            }
        }
        System.out.println(productName + " was not found in the cart.");
    }

    // Calculate the total shopping price in the cart
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

    public List<Product> getCartItems() {
        return cartItems;
    }
}
