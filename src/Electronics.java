public class Electronics extends Product implements Discountable {
    private String brand;

    public Electronics(String name, double price, int id, String brand) {
        super(name, price, id);
        this.brand = brand;
    }

    @Override
    public void applyDiscount(double percentage) {
    }

    @Override
    public String toString() {
        return super.toString() + " (Marka: " + brand + ")";
    }
}
