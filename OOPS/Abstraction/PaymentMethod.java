package Abstraction;

public class PaymentMethod extends BankAccount {

    @Override
    public boolean payment() {

        return false;

        
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'payment'");
    }
     

    public static void main(String[] args) {
        
        PaymentMethod ob = new PaymentMethod();
        
    }

    


}
