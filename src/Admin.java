public class Admin extends User {
    public Admin(String username, String password){
        super(username, password);
    }

    @Override
    public void login() {
        System.out.println("Admin Login");
    }

    // Additional methods for admin
    public void addProduct(ProductManagement productManagement, String name, double price, int stock) {
        Product product = new Product(name, price, stock);
        productManagement.addProduct(product);
        System.out.println("Product added successfully.");
    }

    public void deleteProduct(ProductManagement productManagement, String productName) {
        productManagement.deleteProduct(productName);
    }

    public void editProduct(ProductManagement productManagement, String productName, double newPrice, int newStock) {
        productManagement.editProduct(productName, newPrice, newStock);
    }

    public void displayAllProducts(ProductManagement productManagement) {
        productManagement.displayProduct();
    }

    public void searchProduct(ProductManagement productManagement, String productName) {
        productManagement.searchProduct(productName);
    }
}
