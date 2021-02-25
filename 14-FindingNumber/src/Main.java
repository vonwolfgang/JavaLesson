public class Main {

    public static void main(String[] args) {

        int[] numbers_1 = {1,2,3,4,5,6};

        System.out.println(FindingNumber(numbers_1, 7));

    }


    public static String FindingNumber(int[] array, int find_numbers ){

        String message = "your number is not in your array";

        for(int i = 0; i< array.length; i++){

            if(find_numbers == array[i]) {
                message = "your number is in your array";
            }
        }

        return message;
    }




}



