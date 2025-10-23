public class Book extends Product implements Discountable {
    private String author;

    public Book(String name, double price, int id, String author) {
        super(name, price, id);
        this.author = author;
    }

    @Override
    public void applyDiscount(double percentage) {
    }

    @Override
    public String toString() {
        return super.toString() + " (Autor: " + author + ")";
    }
}
