package booklibrary;
import java.util.*;

public class UserAccount{
    private String name;
    private String email;
    private  String password;
    private ArrayList<Wishlist> wishList = new ArrayList<Wishlist>();
    private ArrayList<ShoppingCart> cartList = new ArrayList<ShoppingCart>();

    public UserAccount() {
    }

    public UserAccount(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    
    public void addToShopCart(ShoppingCart cart){
        cartList.add(cart);
    }

    public void addToWishList(Wishlist wish){
        wishList.add(wish);
    }

    public ArrayList<Wishlist> getWishList() {
        return wishList;
    }

    public void setWishList(ArrayList<Wishlist> wishList) {
        this.wishList = wishList;
    }

    public ArrayList<ShoppingCart> getCartList() {
        return cartList;
    }

    public void setCartList(ArrayList<ShoppingCart> cartList) {
        this.cartList = cartList;
    }

    
    
    
    @Override
    public String toString() {
        return "UserAccount{" + "name=" + name + ", email=" + email + ", password=" + password + '}';
    }

    
    }

    
    

