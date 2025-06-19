import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String id, int quantity, double price) {
        Product product = inventory.get(id);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(String id) {
        inventory.remove(id);
    }

    public void printInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
