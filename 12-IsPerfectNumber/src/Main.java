public class Main {

    public static void main(String[] args) {

        System.out.println(IsPerfectNumber(6));

    }

    public static String IsPerfectNumber(int x){

        String message = " your number is not perfect";
        int top = 0;

        for(int i=1; i<x; i++){

            if(x%i == 0){
                top += i;
            }
        }

        if(top == x){

            message = "your number is perfect";
        }

        return message;
    }




}
