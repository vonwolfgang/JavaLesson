public class Main {

    public static void main(String[] args) {

        int number_1=25, number_2=20, number_3=2;
        int bigger_number = number_3;

        if(bigger_number<number_2){
            bigger_number = number_2;
        }

        if(bigger_number<number_1){
            bigger_number = number_1;
        }

        System.out.println(bigger_number);

    }
}
