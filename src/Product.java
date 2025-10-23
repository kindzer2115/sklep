public class Product implements Discountable {
    private String name;
    private double price;
    private int id;

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getId() { return id; }

    @Override
    public void applyDiscount(double percentage) {
        setPrice(getPrice() * (1 - percentage / 100));
    }

    @Override
    public String toString() {
        return id + ". " + name + " - " + String.format("%.2f", price) + " zł";
    }
}
