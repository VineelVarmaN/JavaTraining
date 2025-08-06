package javalearning.newtopicslearned;

//sealed class Payment will be used by child sealed classes
sealed class Payment permits BankTransfer, CreditCardPayment, NetBanking {
    public void pay(double amount){
        System.out.println("The payment done!");
    }
}
//1. Sealed child class
//child sealed class can inherit parent sealed class and permits another child classes to inherit child sealed class
//creditcardpayment inherits payment class && creditcardpayment class can be inherited by Icici class
sealed class CreditCardPayment extends Payment permits Icici{
    @Override
    public void pay(double amount) {
        System.out.println("The payment done with credit card for : $"+amount);
    }
}
//final icici class inherits creditcardpayment class and cannot be inherited again
final class Icici extends CreditCardPayment{
    @Override
    public void pay(double amount) {
        System.out.println("The icici bank payment done with credit card for : $"+amount);
    }
}

//2. non sealed child class can inherit parent sealed class and can be accessed by all other child classes
//netbanking inherits payment class && netbanking class can be inherited by all child classes
non-sealed class NetBanking extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("The payment done with netbanking for : $"+amount);
    }
}
//axis class inherits netbanking class
class Axis extends NetBanking{
    @Override
    public void pay(double amount) {
        System.out.println("The axis bank payment done with net banking for : $"+amount);
    }
}

//3. final class can inherit parent sealed class and cannot be inherited by all other classes
//banktransfer inherits payment class and cannot be inherited by all classes
final class BankTransfer extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("The payment done with banktransfer for : $"+amount);
    }
}
public class SealedClassPaymentExample {
    public static void main(String[] args) {
        //1. sealed parent class
        Payment paymentObj = new Payment();
        paymentObj.pay(2000);
        //sealed child class
        Payment creditCardPaymentObj = new CreditCardPayment();
        creditCardPaymentObj.pay(2100);
        CreditCardPayment iciciObj = new Icici();
        iciciObj.pay(2200);
        //non-sealed child class
        Payment netBankingObj = new NetBanking();
        netBankingObj.pay(2300);
        NetBanking axisObj = new Axis();
        axisObj.pay(2400);
        //final child class
        Payment bankTransferObj = new BankTransfer();
        bankTransferObj.pay(2500);
    }
}
