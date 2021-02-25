public class Main {

    public static void main(String[] args) {

        top_1(1,2,3,4,5);

    }
    public static void bos() {
        System.out.println("bos");
        // void metotları bişey return etmez bişey yazdırcak olması
        // return ettiği anlamına gelmez.
    }

    public static int hey(){
        return 5;
    }


    public static String hey_1(){
        return "hey";
    }


    public static double hey_2(){
        return 5123;
    }

    // böyle neyi return ettirmek istiyorsan onun tipinde metot tanımlayabilirsin
    // parametre olarak string, int, double, float, array felan verebilirsin
    // parametre vermek istiyosanda vermek istediğin parametreyi yazıosun tipiyle birlikte direk


    public static int top_1(int... numbers){
          int top = 0;
           for (int number:numbers){
               top+=number;
           }

        return top;
    }
// yukarıdaki gibi int... nubmers gibi yapınca
// sınırsız int parametre verebilcek şekilde yaptık
// parametre olarak array göndermiş gibi oluyor



}
