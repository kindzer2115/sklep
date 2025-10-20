public class Clothing extends Product implements Discountable {
    private String size;

    public Clothing(String name, double price, int id, String size) {
        super(name, price, id);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void applyDiscount(double percentage) {
        setPrice(getPrice() * (1 - percentage / 100));
    }

    @Override
    public String toString() {
        return super.toString() + ", Rozmiar: " + size;
    }
}
