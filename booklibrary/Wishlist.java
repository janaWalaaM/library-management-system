package booklibrary;

public class Wishlist extends Book {
    private int numberOfBook;

    public Wishlist(String title, String language, int pages, double price, String author, Publisher publisher, String genre) {
        super(title, language, pages, price, author, publisher, genre);
    }
    
}
