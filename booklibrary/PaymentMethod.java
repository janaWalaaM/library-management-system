package booklibrary;

public abstract class PaymentMethod {
   private long cardNumber;
   private Date expirationDate;
   private int cvc;

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }
   
   
   
   public abstract void cardNumber(long number); 
   
   public abstract void expirationDate(Date date);
   
   public abstract void CVC(int number);
    
    
}
