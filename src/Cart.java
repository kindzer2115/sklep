import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Dodano do koszyka: " + product.getName());
    }

    public void showCart() {
        if (products.isEmpty()) {
            System.out.println("Koszyk jest pusty.");
            return;
        }

        System.out.println("\n=== Twój koszyk ===");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}
