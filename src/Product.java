public class Product {
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
    public int getId() { return id; }

    @Override
    public String toString() {
        return id + ". " + name + " - " + String.format("%.2f", price) + " zł";
    }
}
