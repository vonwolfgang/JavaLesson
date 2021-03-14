public class AccountManager {

    private double balance;

    public void depozit(double amount){
        balance = getBalance() + amount;
    }

    public void withDraw(double amount1) throws Exception{
        if(balance>=amount1){
            balance = getBalance() - amount1;
        }
        else{
            throw new Exception("your money is not enough");
        }
        // yukarıda kendi hatamızı yazdık. Fonksiyonun yanına da throws Exception diyerek
        // bizim bu hatayı handle etmediğimizi böyle bir hatanın olduğunu ve kullanıcının handle etmesi gerektiğini
        // belirttik.
    }

    public double getBalance() {
        return balance;
    }
}
