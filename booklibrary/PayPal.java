package booklibrary;

public class PayPal extends PaymentMethod{
    
    @Override
    public void cardNumber(long number){
       super.setCardNumber(number);
    }; 

    @Override
    public void expirationDate(Date date) {
        super.setExpirationDate(date);
    }

    @Override
    public void CVC(int number) {
        super.setCardNumber(number);
    }
}
