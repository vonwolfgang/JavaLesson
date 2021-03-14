public class Main {

    public static void main(String[] args) throws Exception {


        AccountManager accountManager = new AccountManager();
        System.out.println("Account : " + accountManager.getBalance());
        accountManager.depozit(100);
        System.out.println("Account : " + accountManager.getBalance());
        accountManager.withDraw(100);
        // bu sefer bunu da ya try catch içine almamız gerekir ya da yukarı da
        // bir hata alınabileceğini ve handle edilmediğini yukarıda throws Exception diyerek belirtmemiz gerekir
        // biz hatayı belirttik try except yazmadık.

    }
}
