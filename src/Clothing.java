public class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, int id, String size) {
        super(name, price, id);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " (Rozmiar: " + size + ")";
    }
}
