package booklibrary;

public class Book {
    private String title;
    private String language;
    private int pages;
    private double price;
    private String author;
    private Publisher publisher;
    private String genre;
    private String sammary;

    public Book() {
    }
    
    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String language, int pages, double price, String author, Publisher publisher, String genre) {
        this.title = title;
        this.language = language;
        this.pages = pages;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSammary() {
        return sammary;
    }

    public void setSammary(String sammary) {
        this.sammary = sammary;
    }
    
    

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", language=" + language + ", pages=" + pages + ", price=" + price + ", author=" + author + ", publisher=" + publisher + ", genre=" + genre + '}';
    }

//    @Override
//    protected Book clone(){
//        return new Book(this.title, this.language, this.pages, this.price, this.author, this.publisher, this.genre);
//    }
    
    
    
    
}
