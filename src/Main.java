public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();


        cart.products.add(new Book("Java dla początkujących", 50.0, 1, "Jan Kowalski"));
        cart.products.add(new Electronics("Telefon", 1200.0, 2, "Samsung"));
        cart.products.add(new Clothing("Koszulka", 80.0, 3, "L"));


        System.out.println("Koszyk przed zniżką:");
        for (Product p : cart.products) {
            System.out.println(p);
        }


        System.out.println("\nStosowanie zniżki 10%:");
        for (Product p : cart.products) {
            if (p instanceof Discountable) {
                ((Discountable) p).applyDiscount(10);
            }
            System.out.println(p);
        }
    }
}
