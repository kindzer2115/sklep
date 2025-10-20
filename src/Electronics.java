public class Electronics extends Product implements Discountable {
    private String brand;

    public Electronics(String name, double price, int id, String brand) {
        super(name, price, id);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void applyDiscount(double percentage) {
        setPrice(getPrice() * (1 - percentage / 100));
    }

    @Override
    public String toString() {
        return super.toString() + ", Marka: " + brand;
    }
}
