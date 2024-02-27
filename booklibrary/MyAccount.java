package booklibrary;

public interface MyAccount {
    
     public void LogIn(UserAccount username,boolean check,BookStorage books);
     public void LogOut(UserAccount user);
     public void profile(UserAccount user, BookStorage books,boolean check);
}
