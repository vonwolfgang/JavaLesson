public class KronometreThread implements Runnable {

    private Thread t;
    // bir Thread nesnesi oluşturduk
    private String threadName;
    // Thread'leri birbirinden ayırabilmek için bir tane de threadName oluşturduk.

    public KronometreThread(String threadName ){
        this.threadName = threadName;
        System.out.println("your thread is creating now : " + threadName);
    }
    // Thread'in ismini alabilmek için bir tane constructor yazdır threadName için.

    @Override
    public void run() {
        System.out.println("your thread is working now : " + threadName);

        try{
            for(int i=1 ; i<=10; i++ ){
                System.out.println(threadName + ":" + i);
                Thread.sleep(1000);
                // sleep ettirdik milisaniye cinsinden verdik yazıcak 1000 milisaniye beklicek, sonra yazıcak.

            }
        }
        catch (InterruptedException exception){
            System.out.println("your thread cut : " + threadName);
        }
        System.out.println("mission of thread is finished : " + threadName);
        // yukarıdaki işlemleri try catch içine almamız gerekti çünkü herhangi bir sıkıntı çıkma ihtimali var.

    }

    public void start(){

        System.out.println("your thread object is creating");

        if(t == null){
            // yukarıda t nesnesi yani Thread sınıfından oluşturulmuş t nesnesi null ise
            t = new Thread(this,threadName);
            // yeni bir Thread nesnesi yarattık bunu yaratırken bizden ilgili olduğu classın referansı gibi bişe istiyor
            // o yüzden this dedik bi de Thread ismi istiyor Thread ismine de threadName'i verdik.
            t.start();
            // en sonda da Thread sınıfındaki start metodunu kullanarak Thread'i başlattık.
        }
    }

}

// Runnable isimli bir sınıfı import ettik sonra buraya implement ettik.
// onun içinde de run isimli bir metot var bu metodu da buraya eklettik.
// run metodu içine ne yazarsak o kod thread olarak çalışacaktır.
//

