import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private Cart cart;
    private ArrayList<Product> availableProducts;
    private final double DISCOUNT = 10;

    public Store() {
        cart = new Cart();
        availableProducts = new ArrayList<>();
        availableProducts.add(new Electronics("Telefon Samsung", 2500.00, 1, "Samsung"));
        availableProducts.add(new Electronics("Laptop Lenovo", 3800.00, 2, "Lenovo"));
        availableProducts.add(new Book("Wiedźmin", 49.99, 3, "Andrzej Sapkowski"));
        availableProducts.add(new Clothing("Bluza Nike", 199.99, 4, "L"));
    }

    public void startShopping() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== WITAJ W SKLEPIE INTERNETOWYM ===");

        while (true) {
            System.out.println("\nDostępne produkty:");
            for (Product p : availableProducts) {
                System.out.println(p);
            }
            System.out.println("0. Zakończ zakupy");
            System.out.print("Wybierz numer produktu: ");
            choice = scanner.nextInt();
            if (choice == 0) break;

            Product selected = findProductById(choice);
            if (selected != null) cart.addProduct(selected);
            else System.out.println("Nie ma produktu o takim numerze.");
        }

        System.out.println("\n=== PODSUMOWANIE PRZED ZNIŻKĄ ===");
        cart.showCart();
        double totalBeforeDiscount = cart.getTotal();
        System.out.println("cena przed obniżką: " + String.format("%.2f", totalBeforeDiscount) + " zł");

        cart.applyDiscountToAll(DISCOUNT);

        System.out.println("\n=== PODSUMOWANIE PO ZNIŻCE ===");
        cart.showCart();
        double totalAfterDiscount = cart.getTotal();
        System.out.println("cena po obniżce 10%: " + String.format("%.2f", totalAfterDiscount) + " zł");
    }

    private Product findProductById(int id) {
        for (Product p : availableProducts) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
