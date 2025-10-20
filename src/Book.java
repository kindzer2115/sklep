public class Book extends Product implements Discountable {
    private String author;

    public Book(String name, double price, int id, String author) {
        super(name, price, id);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void applyDiscount(double percentage) {
        setPrice(getPrice() * (1 - percentage / 100));
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + author;
    }
}
