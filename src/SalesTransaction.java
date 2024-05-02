public class SalesTransaction {
    private final ProductManagement productManagement;
    private final ShoppingCart shoppingCart;

    // constructor
    public SalesTransaction(ProductManagement productManagement, ShoppingCart shoppingCart) {
        this.productManagement = productManagement;
        this.shoppingCart = shoppingCart;
    }

    // Method to process a sale
    public void processSale(String productName, int quantity) {
        Product product = findProduct(productName);
        if (product != null && product.getStock() >= quantity) {
            // add product to cart
            for (int i = 0; i < quantity; i++) {
                shoppingCart.addToCart(product);
            }
            // update product stock
            product.setStock(product.getStock() - quantity);
        } else {
            System.out.println("product not found or insufficient stock.");
        }
    }

    // method to find a product by name
    private Product findProduct (String productName) {
        for (Product product : productManagement.getProductList()){
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    // method to print for the current shopping cart
    public void printReceipt() {
        double totalPrice = shoppingCart.calculateTotalPrice();
        if (totalPrice > 0) {
            Receipt receipt = new Receipt(shoppingCart.getCartItems(), totalPrice);
            receipt.printReceipt();
            // clear the cart after printing receipt
        } else {
            System.out.println("Shopping cart is empty. No receipt to print");
        }
    }
}
