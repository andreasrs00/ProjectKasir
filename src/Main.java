public class Main {
    public static void main(String[] args) {
        // Buat objek Product
        Product product1 = new Product("Product1", 10.0, 100);
        Product product2 = new Product("Product2", 15.0, 50);

        // Buat objek ProductManagement
        ProductManagement productManagement = new ProductManagement();

        // Tambahkan produk ke dalam manajemen produk
        productManagement.addProduct(product1);
        productManagement.addProduct(product2);

        // Tampilkan semua produk
        System.out.println("All Products:");
        productManagement.displayProduct();
        System.out.println();

        // Buat objek ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart();

        // Tambahkan produk ke dalam keranjang belanja
        shoppingCart.addToCart(product1);
        shoppingCart.addToCart(product2);

        // Tampilkan isi keranjang belanja
        System.out.println("Shopping Cart Contents:");
        shoppingCart.displayCartItems();
        System.out.println("Total Price: $" + shoppingCart.calculateTotalPrice());
        System.out.println();

        // Buat objek SalesTransaction
        SalesTransaction salesTransaction = new SalesTransaction(productManagement, shoppingCart);

        // Proses penjualan
        salesTransaction.processSale("Product1", 1);
        salesTransaction.processSale("Product2", 2);

        // Cetak struk
        System.out.println("Receipt:");
        salesTransaction.printReceipt();
        System.out.println();

        // Tes autentikasi
        Authentication authentication = new Authentication();
        User admin = new Admin("admin", "admin123");
        authentication.addUser(admin);
        User loggedInUser = authentication.authenticate("admin", "admin123");
        if (loggedInUser != null) {
            loggedInUser.login();
        } else {
            System.out.println("Authentication failed. Invalid username or password.");
        }
    }
}
