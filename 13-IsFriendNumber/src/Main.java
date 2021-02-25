public class Main {

    public static void main(String[] args) {
        System.out.println(IsFriendNumber(220,284));

    }
    public static String IsFriendNumber(int x, int y){

        String message = "Your numbers are not friend number";
        int top_x = 0;
        int top_y = 0;

        for(int i =1; i<x;i++){
            if(x%i==0){

                top_x += i;
            }
        }

        for(int j =1; j<x;j++){
            if(y%j==0){

                top_y += j;
            }
        }

        if(x==top_y && y == top_x){

            message = "your numbers are friend number";
        }

        return message;
    }





}
