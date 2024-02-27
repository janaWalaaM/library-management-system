package booklibrary;
import java.util.*;
import java.time.LocalDateTime;

public class AccountsMangements implements NewAccount, MyAccount{
    
    Scanner in = new Scanner(System.in);
    private UserAccount[] accountList = new UserAccount[100];
    private ArrayList<UserAccount> list= new ArrayList<UserAccount>();
    private int numberOfAccount;
    private ArrayList<UserAccount> listClone = new ArrayList<UserAccount>();
    private LocalDateTime time ;

    public AccountsMangements() {
        

    }

    public ArrayList<UserAccount> getList() {
        return list;
    }

    public void setList(ArrayList<UserAccount> list) {
        this.list = list;
    }
    
    
    
    @Override
    public void signIn(UserAccount user, boolean check, boolean check2) {
        for(int i =0;i<listClone.size();i++){
        
            if(check2 == true){
            break;
            }
        }
        
        if(check == false && check2 == false){
            list.add(user);
            System.out.println("You've made a new account");
            numberOfAccount ++;
        }
        }
    
    @Override
    public void LogIn(UserAccount user,boolean check,BookStorage books){
         

         for(int i =0;i<listClone.size();i++){
            if(listClone.get(i) == user){
                list.add(user);
                System.out.println("you've logged succefully");
                break;
            }
            System.out.println("The password or username may be wrong, try again!");
        }
}

    @Override
    public void profile(UserAccount user,BookStorage books,boolean check) {
        outer:for(int i =0;i<list.size();i++){
            if(user == list.get(i)){
              for(i=0;;i++){  
                System.out.println(user.toString());
                System.out.println("Choose option: "+"\n"+"1- My wishlist"+"\n"+"2- Shop cart"+"\n"+
                "3- Log out"+"\n"+"4- Quite");
                int option = in.nextInt();
                switch(option){
                    case 1:
                       displaywishlist(user);
                       Book[] book = books.getBookList();
                       
                       if(user.getWishList() != null){
                        for(i = 0;i<book.length;i++){   
                            if(book[i] instanceof Wishlist){
                                books.choseOption(book[i], check, user);
                            }
                        } 
                        
                       }
                       break;
                    case 2:
                      displayCartList(user);
                      Book[] book2 = books.getBookList();

           if(user.getCartList()  != null){
            for(i = 0;i<book2.length;i++){   
                if(book2[i] instanceof ShoppingCart ){


                    System.out.println("Choose option:\n1- Continue the shopping process\n2- Checkout ");

                    option = in.nextInt();

                     switch (option){

                         case 1 :
                         break ;

                         case 2:
                         double x=0;
                             for(i = 0;i<book2.length;i++){  
                               if(book2[i] instanceof ShoppingCart )  
                                 x += book2[i].getPrice();


                         }
                             System.out.println("Total price :"+x);

                             System.out.println("Choose the payment method\n1- Visa \n2- PayPal ");


                        option = in.nextInt();
                        
                          switch (option){

                   case 1:
                        Visa v1=new Visa();
                        System.out.println("enter card number");
                        long cardnumber  = in.nextInt();  
                        v1. cardNumber(cardnumber);
                        System.out.println("enter the Expiration Date");
                       System.out.println("day");
                        int d = in.nextInt();
                        System.out.println("month");
                        int m= in.nextInt();     
                         System.out.println("year");
                        int y= in.nextInt(); 

                        Date d1 =new Date(d,m,y);
                        v1.expirationDate(d1);
                        System.out.println("enter the CVC");      
                        int cvc = in.nextInt();  
                        v1.CVC(cvc);
                        time  = LocalDateTime.now();
                        break;


                    case 2 :
                        PayPal v2=new PayPal();
                        System.out.println("enter card number");
                        long cardnumberp  = in.nextInt();  
                        v2. cardNumber(cardnumberp);
                        System.out.println("enter the Expiration Date");
                         System.out.println("day");
                        int d11 = in.nextInt()  ;
                        System.out.println("month");
                        int m11= in.nextInt();   
                         System.out.println("year");
                        int y11= in.nextInt(); 

                        Date d2 =new Date(d11,m11,y11);
                        v2.expirationDate(d2);
                        System.out.println("enter the CVC");      
                        int cvcS = in.nextInt();  
                        v2.CVC(cvcS);  
                        time  = LocalDateTime.now();
                        break ;
                              
                        }
                          
                         System.out.println("Choose option:\n1- Quite \n2- display your bill ");
             
                                option = in.nextInt();
                        
                        switch(option){
                       
                            case 1:
                         
                               break ;  
                               
                            case 2:
                            System.out.println("you order");
                          
                           for(i = 0;i<book2.length;i++){  
                           
                           if(book2[i] instanceof ShoppingCart ) {
                           System.out.println("\t"+book2[i].getTitle() +": $"+book2[i].getPrice());
                           
                            }
                             
                            }

                       System.out.println(  "    ----------------------------------------");
                             
                            System.out.println("\tTotal price :$"+x);
                                
                               System.out.println("\tyou ordered in " + time+"\n\n");
                               
                               break;
                               
                            
                        
                        }
                        break;
                    
                
                }
          break;
      }   
    }
    }
                    case 3:
                        LogOut(user);
                        break;
                }
                if(option == 4 || option == 3){
                    break outer;
                }
            }
        }
        }
    }
    
    public boolean accountChecker(UserAccount user){
        if(list.contains(user)){
            return true;
        }
        return false;
    }
    
    public void displaywishlist(UserAccount user){
    for(int i =0;i<list.size();i++){
        if(user == list.get(i)){
            System.out.println(user.getWishList());
                
      }
      }
    
   }
   
    public void displayCartList(UserAccount user){
      for(int i =0;i<list.size();i++){
        if(user == list.get(i)){
            System.out.println(user.getCartList());
    
      }
      }
    
   }
    public boolean accountChecker2(UserAccount user){
        if(listClone.contains(user)){
            return true;
        }
        return false;
    }
    
    @Override
    public void LogOut(UserAccount user){
        for(int i =0;i<list.size();i++){
            if(user == list.get(i)){
                listClone.add(user);
                UserAccount u = null;
                list.set(i, u);
                break;
            }
        }
    }
}
