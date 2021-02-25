public class Main {

    public static void main(String[] args) {
	String[] students = new String[3];
	// yukarıda 3 elemanlı students isminde bir string array 'i tanımladık.

        students[0] ="hello";
        students[1] ="hello_1";
        students[2] ="hello_2";

        for(String x: students){
            System.out.println(x);
        }
        // yukarıdaki for döngüsü sayesinde students içinde ki ifadeleri dolaşabiliyoruz.

        //---------------------------------------------------------------------

        // MATRİXLER

        String[][] cities = new String[3][3];
        // yukarıda 3'e 3 'lük bir matrix tanımladık.
        cities[0][0] = "hello";
        cities[0][1] = "hello";
        cities[0][2] = "hello";
        cities[1][0] = "hello";
        cities[1][1] = "hello";
        cities[1][2] = "hello";
        cities[2][0] = "hello";
        cities[2][1] = "hello";
        cities[2][2] = "hello";

        for(int i= 0; i<=2; i++ ){
            for(int j=0; j<=2; j++){
                System.out.println(cities[i][j]);

            }
            System.out.println("----------------");
        }

        //String[][][] cities = new String[3][3][3];
            // 3 boyutlu matrixler yukarıdaki gibi bişe heralde.



    }
}
