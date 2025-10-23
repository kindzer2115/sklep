public class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, int id, String brand) {
        super(name, price, id);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString() + " (Marka: " + brand + ")";
    }
}
