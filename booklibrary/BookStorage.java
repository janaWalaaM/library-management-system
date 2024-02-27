package booklibrary;
import java.util.ArrayList;
import java.util.Scanner;
public class BookStorage {
    public static Scanner in = new Scanner(System.in); 
    private Publisher publisher1 = new Publisher("Dover Publication",4,"March",2005);
    private Publisher publisher2 = new Publisher("HarperCollinsPublishers",31,"July",2002);
    private Publisher publisher3 = new Publisher(" National Geographic Society",29 ,"November" ,2018);
    private Publisher publisher4 = new Publisher("Manning Publications",25 ,"May", 2016);
    private Publisher publisher5 = new Publisher("Piatkus Books ",5 ,"January ",2016);
    private Publisher publisher6 = new Publisher("Bloomsbury Publishing PLC",13 ,"June ",1996);
    private Publisher publisher7 = new Publisher("Avery Publishing Group",16 ,"October", 2018);
    private Publisher publisher8 = new Publisher("Thought Catalog Books",1,"June ", 2020);
    private Publisher publisher9 = new Publisher(" Plata Publishing;",27 ,"April", 2017);
    private Publisher publisher10 = new Publisher("Canongate Books Ltd",18," February", 2021);
    private String[] author = {"Jules Verne","Neil Gaiman","National Geographic Society","Aditya Bhargava"," Cal Newport"," Daniel Goleman","James Clear","Brianna Wiest ","Robert T Kiyosaki"," Matt Haig"};
    private String[] genre = {"Science Fiction","Horror","Space","Programming"," Economics","Psychiatry","Motivational Self-Help","Lifestyle","Business","Literary Fiction"};
    private Book book1 = new Book("Journey to the center of the earth","English",240,22.5,author[0],publisher1,genre[0]);
    private Book book2 = new Book("Coraline","English",172,30,author[1],publisher2,genre[1]);
    private Book book3 = new Book("Space Atlas","English",352,178,author[2],publisher3,genre[2]);
    private Book book4 = new Book("Grokking Algorithms","English",256,204,author[3],publisher4,genre[3]);
    private Book book5 = new Book("Deep Work","English",304 ,89,author[4],publisher5,genre[4]);
    private Book book6 = new Book("Emotional Intelligence","English",368,45,author[5],publisher6,genre[5]);
    private Book book7 = new Book("Atomic Habits","English",320,58,author[6],publisher7,genre[6]);
    private Book book8 = new Book("The Mountain Is You","English",248,242,author[7],publisher8,genre[7]);
    private Book book9 = new Book("Rich Dad Poor Dad","English", 336,44,author[8],publisher9,genre[8]);
    private Book book10 = new Book("The Midnight Library" ,"English", 304,50,author[9],publisher10,genre[9]);
    private Book[] bookList = {book1,book2, book3, book4, book5, book6, book7, book8, book9, book10};
    private Reviews review = new Reviews("No one reviwed this book",0);
    private Reviews[] reviewList = new Reviews[100];
    private int numberOfReviews = 0;
    private AccountsMangements account = new AccountsMangements();
    
    private String[] Titles = new String[100];
    private int[] choices = new int[100]; 
    
    
    
    public Book getBook1() {
        return book1;
    }

    public void setBook1(Book book1) {
        this.book1 = book1;
        book1.setSammary("an adventure novel");
    }

    public Book getBook2() {
        return book2;
    }

    public void setBook2(Book book2) {
        this.book2 = book2;
        book2.setSammary("a Horror novel");
    }

    public Publisher getPublisher3() {
        return publisher3;
    }

    public void setPublisher3(Publisher publisher3) {
        this.publisher3 = publisher3;
    }

    public Publisher getPublisher4() {
        return publisher4;
    }

    public void setPublisher4(Publisher publisher4) {
        this.publisher4 = publisher4;
    }

    public Publisher getPublisher5() {
        return publisher5;
    }

    public void setPublisher5(Publisher publisher5) {
        this.publisher5 = publisher5;
    }

    public Publisher getPublisher6() {
        return publisher6;
    }

    public void setPublisher6(Publisher publisher6) {
        this.publisher6 = publisher6;
    }

    public Publisher getPublisher7() {
        return publisher7;
    }

    public void setPublisher7(Publisher publisher7) {
        this.publisher7 = publisher7;
    }

    public Publisher getPublisher8() {
        return publisher8;
    }

    public void setPublisher8(Publisher publisher8) {
        this.publisher8 = publisher8;
    }

    public Publisher getPublisher9() {
        return publisher9;
    }

    public void setPublisher9(Publisher publisher9) {
        this.publisher9 = publisher9;
    }

    public Publisher getPublisher10() {
        return publisher10;
    }

    public void setPublisher10(Publisher publisher10) {
        this.publisher10 = publisher10;
    }

    public Book getBook3() {
        return book3;
    }

    public void setBook3(Book book3) {
        this.book3 = book3;
        book3.setSammary("Mapping The Universe And Beyond");
    }

    public Book getBook4() {
        return book4;
    }

    public void setBook4(Book book4) {
        this.book4 = book4;
        book4.setSammary("An Illustrated Guide For Programmers And Other Curious ");
    }

    public Book getBook5() {
        return book5;
    }

    public void setBook5(Book book5) {
        this.book5 = book5;
        book5.setSammary("Rules For Focused Success In A Distracted World");
    }

    public Book getBook6() {
        return book6;
    }

    public void setBook6(Book book6) {
        this.book6 = book6;
        book6.setSammary("Why It Can Matter More Than IQ");
    }

    public Book getBook7() {
        return book7;
    }

    public void setBook7(Book book7) {
        this.book7 = book7;
        book7.setSammary("An Easy & Proven Way To Build Good Habits & Break Bad Ones");
    }

    public Book getBook8() {
        return book8;
    }

    public void setBook8(Book book8) {
        this.book8 = book8;
        book8.setSammary("Transforming Self-Sabotage Into Self-Mastery");
    }

    public Book getBook9() {
        return book9;
    }

    public void setBook9(Book book9) {
        this.book9 = book9;
        book9.setSammary("What The Rich Teach Their Kids About Money That The Poor And Middle Class Do Not! ");
    }

    public Book getBook10() {
        return book10;
    }

    public void setBook10(Book book10) {
        this.book10 = book10;
         book10.setSammary(" The No.1 Sunday Times Bestseller And Worldwide Phenomenon");
    }
    
    

    public Publisher getPublisher1() {
        return publisher1;
    }

    public void setPublisher1(Publisher publisher1) {
        this.publisher1 = publisher1;
    }

    public Publisher getPublisher2() {
        return publisher2;
    }

    public void setPublisher2(Publisher publisher2) {
        this.publisher2 = publisher2;
    }

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }
    
    public void displayRecommandedBooks(){
        for(int i =0;i<bookList.length;i++){
            int j = i+1;
            System.out.println(j+"- "+bookList[i].getTitle());
        }
    }
    public void choseOption(Book book,boolean check,UserAccount user){
        int option = 0;
        for(int i = 0; i< reviewList.length;i++){
            reviewList[i] = new Reviews();
        }
        for(int j=0;;j++){
        System.out.println("1- Read discription of the book"+"\n"+"2- Rate and Write a review"+"\n"+
        "3- display reviews"+"\n"+"4- add the book to shop cart"+"\n"+"5- add to wishlist"+"\n"+"6- Quite");
        option = in.nextInt();
        
        switch (option){
            case 1:
                System.out.println(book.getSammary());
                break;
            case 2:
                if(check == true){
                    System.out.println("Review text: ");
                    String write = in.next();
                    review.setReview(write);
                    for(int i =1;;i++){
                       System.out.println("Rating from 5: ");
                       int rate = in.nextInt();
                       if(rate <=5){      
                            review.setRating(rate);
                            System.out.println("Your review is added");
                            reviewList[numberOfReviews]= review;
                            numberOfReviews ++;
                            break;
                   }
                        else{
                            System.out.println("Please enter correct rate");
                   }
                }
                 
                }
                else{
                   System.out.println("You should log or sign in"); 
                }
                break;
            case 3:
                outer: for(int i =0;i<reviewList.length;i++){
                    if(reviewList[i].getReview() != null){
                        System.out.println(numberOfReviews+" reviews");
                        System.out.println(reviewList[i].toString());
                        continue outer;
                    }
                    else{
                        continue outer;
                    }
                }
                break;
            case 4:
             if(check == true){   
                for(int i = 0;i<bookList.length;i++){
                    if(bookList[i] == book){
                        ShoppingCart cart = new ShoppingCart(bookList[i].getTitle(),bookList[i].getLanguage(),bookList[i].getPages()
                            ,bookList[i].getPrice(),bookList[i].getAuthor(),bookList[i].getPublisher(),bookList[i].getGenre());
                        bookList[i] = cart;
                        user.addToShopCart(cart);
                        System.out.println("Added to your cart");
                        break;
                    }
               }
             }
			    break;
            case 5:
                if(check == true){
                    for(int i = 0;i<bookList.length;i++){
                        if(bookList[i] == book){
                            Wishlist wish = new Wishlist(bookList[i].getTitle(),bookList[i].getLanguage(),bookList[i].getPages()
                            ,bookList[i].getPrice(),bookList[i].getAuthor(),bookList[i].getPublisher(),bookList[i].getGenre());
                            bookList[i] = wish;
                            user.addToWishList(wish);
                            System.out.println("Added to your wishlist");
                            break;
                    }
               }
                }
            break;  
        }
        if(option == 6)
            break;
    }
    }
    
    
    public void displayBooksByGeners1(){
        for(int i =0;i<bookList.length;i++){
            int j = i+1;
            System.out.println(j+"- "+bookList[i].getGenre());
            
        }
        
        
    }
    
    public void searchByTitle(String title, boolean check,UserAccount user){
        for(int i = 0; i< bookList.length;i++){
            int c = title.compareToIgnoreCase(bookList[i].getTitle());
            if(c == 0){
                System.out.println(bookList[i].toString());
                choseOption(bookList[i],check,user);
                break;
            }
            if(c>0 && c<0){
                System.out.println("Not Found");
                break;
            }
            
        }
}
    public void searchByAuthor(String author, boolean check,UserAccount user){
        int j = 0;
        for(int i = 0; i< Titles.length;i++){
            Titles[i] = new String();
        }
        for(int i = 0; i< choices.length;i++){
            choices[i] = i;
        }
        for(int i =0;i<bookList.length;i++){
            int c = author.compareToIgnoreCase(bookList[i].getAuthor());
            if(c == 0){
                j++;
                System.out.println(j+"- "+bookList[i].getTitle());
                Titles[i] = bookList[i].getTitle();
                choices[i] = j;
                }
            }
        int option = 0;
        System.out.println("Choose book: ");
        option = in.nextInt(); 
        outer: for(int i =0;i<=bookList.length;i++){
            boolean n = option == choices[i];
            if(n){
                for(i =0,j =0;i<bookList.length;i++,j++){
                    int c = Titles[i].compareToIgnoreCase(bookList[i].getTitle());
                    if(c == 0 && n){
                         System.out.println(bookList[i].toString());
                         choseOption(bookList[i],check,user);
                         break outer;
                    }   
                }
            }
            }
        
        }
    
    

}
    

