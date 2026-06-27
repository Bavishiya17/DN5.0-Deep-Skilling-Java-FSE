import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(int id, String name, int qty, double price) {

        Product product = products.get(id);

        if (product != null) {
            product.setProductName(name);
            product.setQuantity(qty);
            product.setPrice(price);
            System.out.println("Product Updated");
        } else {
            System.out.println("Product Not Found");
        }
    }

    public void deleteProduct(int id) {

        if (products.remove(id) != null) {
            System.out.println("Product Deleted");
        } else {
            System.out.println("Product Not Found");
        }
    }

    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("Inventory Empty");
            return;
        }

        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}