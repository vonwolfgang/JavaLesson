import java.lang.invoke.ConstantBootstraps;

public class Main {

    public static void main(String[] args) {

        String hey = isPrime(0);
        System.out.println(hey);

    }

    static String isPrime(int n) {

        String message = "your number is prime";

        if (n < 2) {
            message = "Your input must be greater than or equal to 2.";
        }

        else if(n==2){
            message = "your number is prime";
        }

        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    message = "your number is not prime";
                }
            }
        }

        return message;
    }
}
