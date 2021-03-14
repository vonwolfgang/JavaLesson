import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        // yukarıda sadece string veri tipini içine alabilen bir koleksiyon oluşturduk.

        names.add("hey");
        names.add("hey1");
        names.add("hey2");
        names.add("ahey");
        // içine bişeyler koyduk

        names.remove("hey1");
        // remove ederken sadece index ile değil aynı zamanda direk silinecek elemanı yazarak da silebiliriz.

        Collections.sort(names);
        // bu şey sıralamaya yarıyor String olduğu için type 'ımız alfabetik sıralıcak.


        for(String i : names){
            System.out.println(i);
        }

    }
}
