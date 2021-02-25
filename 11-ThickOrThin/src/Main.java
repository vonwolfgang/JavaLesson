public class Main {

    public static void main(String[] args) {

        System.out.println(thick_or_thin('e'));
    }

    public static String thick_or_thin(char x){

        char[] thin = {'E','e', 'i' };
        char[] thick = {'A', 'a','I', 'o', 'O'};
        String message = "";

        for(int i=0 ; i<3;i++){

            if(x == thin[i]) {

                message = "your char is thin";
            }
        }

        for(int j=0 ; j<5;j++){

            if(x == thick[j]) {

                message = "your char is thick";
            }
        }

        return message;
    }




}
