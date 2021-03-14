public class Main {

    public static void main(String[] args) {

        KronometreThread thread = new KronometreThread("thread1");
        KronometreThread thread2 = new KronometreThread("thread2");
        KronometreThread thread3 = new KronometreThread("thread3");

        thread.start();
        thread2.start();
        thread3.start();

        // thread 'lerin özelliği şu normalde yazılım dillerinde işlemler sırasıyla gerçekleştirilir
        // yani eğer thread olmasaydı yukarıdaki işlem önce thread.start çalışıp biticek sonra
        // thread2.start çalışıcaktı ama thread olduğu için 3'ü de aynı anda çalışıcak thread'in güzelliği bu.



    }
}
