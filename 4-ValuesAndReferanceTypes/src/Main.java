public class Main {

    public static void main(String[] args){

        int[] numbers = new int[] {1,2,3};
        int[] numbers1 = new int[] {1,2,3,4,5};

        numbers1 = numbers;
        // diziler referans tiptir. numbers'ın referans no sunu numbers1 'in referans no suna eşitledik
        // artık ikisi de aynı referans no suna gidiyor

        numbers[0] = 10;
        System.out.println(numbers1[0]);
        // iki dizi de aynı referansa gittiği için numbers1[0]'ın eşiti 10 olmuş olacak

        //----------------------------------------------------

        int number_1 = 10;
        int number_2 = 20;

        number_2 = number_1;
        number_1 = 30;
        System.out.println(number_2);
        // burda bu int felan gibi şeyler value tip dir yani
        // burda number_1 değerini 30 yaptık ama number_2 değeri değişmedi
        // çünkü biz number_2= number_1 yaparken number_1 değerini number_2 atadık
        // referansını atamadık.









    }
}
