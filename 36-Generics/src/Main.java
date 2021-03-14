import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("Antalya");
        // şuan yukarıda yaptığımız yani tipini belirlediğimiz
        // liste bir generik liste olmuş oluyo sadece String ifadelerle çalışan

        //***********************************************************

        MyList<String> cities1 = new MyList<String>();
        cities1.add("ankara");
        // yukarıdada o type'ı String olarak belirledik ve operasyonların
        // alacağı parametrelerde String tipinde olmuş oldu.

        //***********************************************************

        MyList<Customer> names = new MyList<Customer>();
        // bu sefer de o tip olarak Customer classın'dan bir tip almasını istedik.

        names.add(new Customer());
        names.remove(new Customer());
        // içine Customer objesinden bişey verdik.

    }
}
