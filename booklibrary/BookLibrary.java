package booklibrary;
import java.util.Scanner;

public class BookLibrary {
    public static void main(String[] args) {
        
      try {   
        BookStorage books = new BookStorage();
        books.setBook1(books.getBook1());
        books.setBook2(books.getBook2());
        books.setBook3(books.getBook3());
        books.setBook4(books.getBook4());
        books.setBook5(books.getBook5());
        books.setBook6(books.getBook6());
        books.setBook7(books.getBook7());
        books.setBook8(books.getBook8());
        books.setBook9(books.getBook9());
        books.setBook10(books.getBook10());
        AccountsMangements account = new AccountsMangements();
        String name =null;
        String email = null;
        String password = null;
        String title = null;
        String author = null;
        UserAccount user = new UserAccount(name,email,password);
        Scanner in = new Scanner(System.in);
        int option = 0;
        boolean check = false;
        boolean check2 = false;
        
        for(int i=0;;i++){
        System.out.println("1- Recommanded books "+"\n"+"2- genres"+"\n"+
        "3- search for a book"+"\n"+"4- myAccount"+"\n"+"5- Quite");
        option = in.nextInt();
        switch (option){
            case 1:
               books.displayRecommandedBooks();
               System.out.println("Enter the option number of book that you want: ");
               option = in.nextInt();
               check = account.accountChecker(user);
               switch(option){
                   case 1:
                    System.out.println(books.getBook1());
                    books.choseOption(books.getBook1(), check, user);
                    break;
                   case 2:
                    System.out.println(books.getBook2());
                    books.choseOption(books.getBook2(), check, user);
                    break;
                    case 3:
                    System.out.println(books.getBook3());
                    books.choseOption(books.getBook3(), check, user);
                    break;
             
               
                 case 4:
                    System.out.println(books.getBook4());
                    books.choseOption(books.getBook4(), check, user);
                    break;
               
               
               
                 case 5:
                    System.out.println(books.getBook5());
                    books.choseOption(books.getBook5(), check, user);
                    break;
               
               
               
                 case 6:
                    System.out.println(books.getBook6());
                    books.choseOption(books.getBook6(), check, user);
                    break;
               
               
                case 7:
                    System.out.println(books.getBook7());
                    books.choseOption(books.getBook7(), check, user);
                    break;
               
                case 8:
                    System.out.println(books.getBook8());
                    books.choseOption(books.getBook8(), check, user);
                    break;
               
               
                case 9:
                    System.out.println(books.getBook9());
                    books.choseOption(books.getBook9(), check, user);
                    break;
               
               case 10:
                    System.out.println(books.getBook10());
                    books.choseOption(books.getBook10(), check, user);
                    break;
               
               }
               break;
            case 2:
                books.displayBooksByGeners1();
                System.out.println("Enter the option number of book that you want: ");
                option = in.nextInt();
                check = account.accountChecker(user);
                switch(option){
                    case 1:
                        System.out.println(books.getBook1());
                        books.choseOption(books.getBook1(),check,user);
                        break;
                    case 2:
                        System.out.println(books.getBook2());
                        books.choseOption(books.getBook2(),check,user);
                        break;
                    case 3:
                    System.out.println(books.getBook3());
                    books.choseOption(books.getBook3(), check, user);
                    break;
             
               
                 case 4:
                    System.out.println(books.getBook4());
                    books.choseOption(books.getBook4(), check, user);
                    break;
               
               
               
                 case 5:
                    System.out.println(books.getBook5());
                    books.choseOption(books.getBook5(), check, user);
                    break;
               
               
               
                 case 6:
                    System.out.println(books.getBook6());
                    books.choseOption(books.getBook6(), check, user);
                    break;
               
               
                case 7:
                    System.out.println(books.getBook7());
                    books.choseOption(books.getBook7(), check, user);
                    break;
               
                case 8:
                    System.out.println(books.getBook8());
                    books.choseOption(books.getBook8(), check, user);
                    break;
               
               
                case 9:
                    System.out.println(books.getBook9());
                    books.choseOption(books.getBook9(), check, user);
                    break;
               
               case 10:
                    System.out.println(books.getBook10());
                    books.choseOption(books.getBook10(), check, user);
                    break;    
                }
                break;
            case 3:
                System.out.println("Search by: "+"\n"+"1- Title"+"\n"+"2- Author");
                option = in.nextInt();
                switch(option){
                    case 1:
                        System.out.println("Title of book: ");
                        title = in.nextLine();
                        title = in.nextLine();
                        books.searchByTitle(title, check, user);
                        break;
                    case 2:
                        System.out.println("Author of book: ");
                          author = in.nextLine();
                          author = in.nextLine();
                        books.searchByAuthor(author, check, user);
                        break;
                }
                break;
            case 4:
                check = account.accountChecker(user);
                check2 = account.accountChecker2(user);
                if(check == false){
                    System.out.println("Enter your name:");
                    name = in.next();
                    System.out.println("Enter your email: ");
                    email = in.next();
                    System.out.println("Make a new password: ");
                    password = in.next();
                    user.setName(name);
                    user.setPassword(password);
                    user.setEmail(email);
                    account.signIn(user,check, check2);
                    if(check2 == true){
                        account.LogIn(user, check, books);
                    }
                }
                else{
                    account.profile(user,books,check);
                }
                break;
        }
        if(option ==5)
            break;
        }
    }
      catch( Exception h ) {                                
            System.out.println( "your Entry is wrong " );   
        } 
            
             finally {                                                    
            System.out.println( "finally codes always execute" );
        }
 
    
        System.out.println( "The program still work properly" );
    }
}
    

