public class Main {

    public static void main(String[] args) {


        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("has made a error");
        }
        catch (StringIndexOutOfBoundsException exception1) {
            System.out.println("has made a error");
        }
        catch (Exception exception) {
            System.out.println("logged" + exception);
        }
        finally{
            System.out.println("I always work");
        }


    }
}
// yukarıdaki try catch isminde iki blog tanımladık bu bloklardan try'ın içine yazdığımız
// kod bloğu çalışıcak ve bu bloğun içinde hata alınmaz ise diğer bloklar çalışmıcak eğer hata alınırsa
// orda alınan hata catch bloğuna parametre olarak verilicek ve catch bloğu çalışıcak.
// yukarıdaki bloklardan ilk başta ya try çalışır ya da catch ama finally bloğu her türlü çalışır.
// yukarıdaki gibi birden fazla catch bloğu olabilir, ve direk Exception yazmak yerine hatanın ismini yazıp
// onun içinden bir objeyi de verebiliriz yukarıdaki gibi.
// yukarıdaki gibi 3. catch bloğu gibi bir blok da konur bu blok ise yukarıda koyduğumuz catch bloklarında ki hatalardan birisinin
// dışında bir hata aldığımız zaman 3. olan çalışır. Çünkü Exception Class'ı tüm hataların base'idir.


