public class FourOperations {

    public int topla(int number1, int number2){
        return number1+number2;
    }

    public int topla(int number1, int number2, int number3){
        return number1+number2+number3;
    }

}
// yukarıda aynı isimli iki methodu aynı class içinde tanımladık
// ama birinin parametresi 2 tane diğerininki 3 taneydi buna overload denir
// iki parametre ile işlem yapmak isteyen iki parametre vererek 3 parametre ile işlem
// yapmak isteyen 3 parametre ile işlem yapar.