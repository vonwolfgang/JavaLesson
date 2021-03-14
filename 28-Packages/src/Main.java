
import math.FourOperations;
import math.Logarithm;
// yukarıda kendi oluşturduğumuz package'ın class'larını import ettik.

import math.*;
// yukarıdaki gibi dediğimizde ise o package'nin içindeki tüm class'ları import eder.


import java.util.Scanner;
// paket import ettik. Bu package kullanıcıdan input almaya yarıyor.


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // yukarıda sadece class oluşturduk oluştururken içine parametre olarak System.in istiyor.
        System.out.println("login your name : ");

        String name = scanner.nextLine();
        // String inputu aldık kullanıcıdan

        System.out.println("hello : " + name );

        //------------------------------------------------


        FourOperations fourOperation = new FourOperations();
        System.out.println(fourOperation.top(2,4));
        // yukarıda kendi oluşturduğumuz package'ı import ettik sonra onun içindeki class'ı
        // new'ledik sonra da o class'ın içindeki metodu kullandık.

        Logarithm logarithm = new Logarithm();
        // class'ı newledik.





    }
}
