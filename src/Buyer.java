public class Buyer extends User {
    private ShoppingCart shoppingCart;

    public Buyer(String username, String password) {
        super(username, password);
        this.shoppingCart = new ShoppingCart();
    }

    @Override
    public void login() {
        System.out.println("Buyer login");
    }

    public void addToCart(ProductManagement productManagement, String productName) {
        Product product = productManagement.searchProduct(productName);
        if (product != null) {
            shoppingCart.addToCart(product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void viewCart() {
        shoppingCart.displayCartItems();
    }

    public void clearCart() {
        shoppingCart.clearCart();
    }

    public void checkout(SalesTransaction salesTransaction) {
        salesTransaction.printReceipt();
    }
}
