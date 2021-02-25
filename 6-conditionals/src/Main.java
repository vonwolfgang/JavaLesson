public class Main {

    public static void main(String[] args) {


        int number = 10;

        if (number < 20) {
            System.out.println("number is lower the twenty");
        } else if (number == 10) {
            System.out.println("hello again");
        } else {
            System.out.println("oye man oye");
        }

        //----------------------------------------

        char grade = 'A';
        switch (grade) {


            case 'A':
            case'B': // yanda yaptığımız şey sayesinde hem A hem B girersen bu koşula girebilio.
                System.out.println("hello man");
                break;
            case 'C':
                System.out.println("hello man_2");
                break;
            case 'D':
                System.out.println("hello man_3");
                break;
            case 'F':
                System.out.println("hello man_4");
                break;
            default:
                System.out.println("yo ye man_5");
                break;
        }


    }
}
