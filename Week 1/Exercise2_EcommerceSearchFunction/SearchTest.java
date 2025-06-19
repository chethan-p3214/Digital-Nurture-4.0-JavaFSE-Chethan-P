import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product("201", "Mobile", "Electronics"),
            new Product("202", "Tablet", "Electronics"),
            new Product("203", "Charger", "Accessories")
        };

        // Linear search
        int result1 = SearchAlgorithms.linearSearch(products, "Tablet");
        System.out.println("Linear Search Result: " + (result1 >= 0 ? products[result1] : "Not Found"));

        // Sort products by name for binary search
        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));
        int result2 = SearchAlgorithms.binarySearch(products, "Charger");
        System.out.println("Binary Search Result: " + (result2 >= 0 ? products[result2] : "Not Found"));
    }
}
