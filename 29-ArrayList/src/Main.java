import java.util.ArrayList;
// Array list'leri yani koleksiyonları kullanabilmek için yukarıdaki şeyi import etmen gerek

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3};
        // yukarıda bir dizi tanımladık.
        numbers = new int[4];
        // yukarıda aynı isimli 4 elemanlı bir dizi tanımladık
        // yeniden aynı isimli bir dizi tanımladığımız için ilk tanımladığımız dizinin tutulduğu referans çöp oldu
        // yani silindi çünkü aynı isimli yeni bir dizi new'ledik.
        System.out.println(numbers[0]);
        // int dizilerin default elemanı 0 olduğu için de yukarıdaki gibi yazdırırsak 0. indexdeki eleman 0 gelicektir.

        //------------------------------------------------------

        // koleksiyonlarda ise yukarıdaki gibi bir olay yok yani
        // sen yukarıdaki gibi bir koleksiyon tanımladın sonra aynı isimli ama
        // 4 elemanlı içi boş bir koleksiyon daha tanımladığında önceki koleksiyonunda ki ilk 3 eleman
        // yeni tanımladığın koleksiyona aktarılıyor 4. index deki elemanı boş kalıyor.

        //-------------------------------------------------------

        ArrayList numbers1 = new ArrayList();
        // koleksiyon tanımlama

        System.out.println(numbers1.size());
        // size() koleksiyon eleman sayısını okur.
        numbers1.add(1);
        numbers1.add(10);
        // add() eleman eklemek için
        numbers1.add("Antalya");

        System.out.println(numbers1.get(2));
        // get.() ise herhangi bir indexde ki elemanı okumak için kullanılır.

        numbers1.set(0,100);
        // set() ise hangi indexdeki elemanı ne yapayım diye soruyor
        // bizde 0. indexdeki elemanı 100 yaptık.

        numbers1.remove(0);
        // remove() ile istediğimiz indexde ki elemanı silebiliriz.
        // böyle bir durumda silinen yere doğru diğer elemanlar kayar.

        numbers1.clear();
        // clear() içindeki tüm elemanları siler.

        for( Object i : numbers1){

            System.out.println(i);
        }
        // yukarıda i'yi Object olarak tanımladık çünkü koleksiyonların içine verilebilecekler
        // Object olarak geçer yani herşeyi verebilirsin bu yüzden koleksiyonun içinde dolaşacağı için
        // i'yi object olarak tanımladık.



    }
}
