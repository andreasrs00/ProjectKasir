public class Cashier extends User {
    public Cashier(String username, String password) {
        super(username, password);
    }

    @Override
    public void login() {
        System.out.println("Cashier login");
    }

    // Additional methods for cashier
    public void processSale(SalesTransaction salesTransaction, String productName, int quantity) {
        salesTransaction.processSale(productName, quantity);
    }

    public void printReceipt(SalesTransaction salesTransaction) {
        salesTransaction.printReceipt();
    }
}
