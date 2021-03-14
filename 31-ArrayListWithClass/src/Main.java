import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"ömer", "özkan"));
        customers.add(new Customer(2,"hello", "again"));
        customers.add(new Customer(3,"it's", "me"));
        // yukarıda ise türü Customer olan bir array list tanımladık ve içine de
        // customer class'ından objeler le doldurduk.


        customers.remove(new Customer(1,"ömer", "özkan"));
        // yukarıda remove kullandığımız zaman ArrayList'imizin içinde bu elemanın silinmesini bekleriz ama silinmez
        // çünkü biz yukarıda remove'un içine new Customer diyerek başladık dolayısıyla yeni bir referans numarası oluşturmuş olduk
        // yeni bir referans numarası olunca da biz de ise yeni oluşan referans numarasını silicek remove yani listedeki referans no'sunu değil.

        Customer hey = new Customer(2, "heyy", "ok");
        customers.add(hey);
        customers.remove(hey);
        // ama yukarıdaki gibi önceden new'leyip sonra remove'un içine yeniden new'lemeden verirsek
        // bu sefer silicektir çünkü yeni bir referans numarası oluşturmadık. önceden oluşturulmuş olan referans no'sunu
        // silmesi için verdik.


        for(Customer i: customers){
            System.out.println(i.firstName + " " + i.lastName + " " + i.id );
        }
        // listedeki elemanları gezdik.

    }
}
