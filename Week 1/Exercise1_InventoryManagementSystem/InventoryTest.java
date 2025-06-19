public class InventoryTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product("101", "Laptop", 10, 799.99);
        Product p2 = new Product("102", "Mouse", 50, 19.99);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.printInventory();

        inventory.updateProduct("101", 8, 749.99);
        inventory.deleteProduct("102");
        inventory.printInventory();
    }
}
