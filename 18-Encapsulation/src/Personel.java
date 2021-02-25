public class Personel {

    // constructor parametreli
    public Personel(int id, String name, String lastname, double cost){

        System.out.println("working the constructor");
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.cost = cost;
    }
    // bu parametreli constructor olduğu için bunu kullanabilmemiz için
    // bu şekilde parametre ile class içindeki değişkeni tanımlamamız gerekir.


    // constructor parametresiz.
    public Personel(){
        System.out.println("working the constructor 2");
    }




    private int id;
    private String name;
    private String lastname;
    private double cost;

}
// yukarıda bi tane parametreli constructor tanımladık bu constructor sayesinde
// Personel classından birr obje newlerken mutlaka parametreleri vermen gerekir.
// ama yukarıda ilk verdiğimiz constructor parametreli constructordı ondan dolayı parametre ile new lemek gerek
// şimdi altına bi tane daha constructor tanımladık bu da parametresiz olarak tanımladık
// artık newlerken hem parametreli hem parametresiz olarak tanımlayabiliriz bu olaya overloading denir
// bu aşırı yükleme demektir.
