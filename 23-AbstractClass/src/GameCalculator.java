public abstract class GameCalculator {

    public abstract void calculate();
    // yukarıda ise şey dedik bu class'ı kim kullanıyorsa calculate fonksiyonunun içermek zorunda
    // ve bu fonksiyonu kendi içinde overwrite etmek zorunda dedik.

    public final void gameOver(){

        System.out.println("game is over");
    }
    // final ekleyerek GameCalculator'u kim kullanıyorsa gameOver fonksiyonunu olduğu gibi kullanmak zorunda.
    // overwrite edilemez yaptık.
}

// abstract sınıf olabilmesi için başında abstract yazmak gerek
// abstract sınıfın illa abstract operasyonu olcak diye bişey yok ama olucaksa da
// operasyonun başına da abstract yazmak gerek.
// abstract sınıflar newlenemez. Newlemek için içini doldurmak gerekir.
