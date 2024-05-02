import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    private List<Product> productList;

    // Constructor
    public ProductManagement() {
        productList = new ArrayList<>();
    }

    // add a new product
    public void addProduct(Product product) {
        productList.add(product);
    }

    // delete products by the name
    public void deleteProduct(String productName) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(productName)) {
                productList.remove(i);
                System.out.println(productName + " has been successfully removed");
                return;
            }
        }
        System.out.println(productName + " was not found");
    }

    // edit products by the name
    public void editProduct(String productName, double newPrice, int newStock) {
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                product.setPrice(newPrice);
                product.setStock(newStock);
                System.out.println(productName + " was successfully edited");
                return;
            }
        }
        System.out.println(productName + " was not found");
    }

    // Displays a list of products
    public void displayProduct() {
        System.out.println("Product List:");
        for (Product product : productList) {
            System.out.println("Name: " + product.getName() + ", price: $" + product.getPrice() + ", stock: " + product.getStock());
        }
    }

    // search for product by the name
    public Product searchProduct(String productName) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(productName)) {
                System.out.println("Name: " + product.getName() + ", price: $" + product.getPrice() + ", stock: " + product.getStock());
                return product;
            }
        }
        System.out.println(productName + " was not found");
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
