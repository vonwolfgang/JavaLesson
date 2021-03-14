import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        createFile();
        getFileinfo();
        readFile();
        writeFile();

    }

    public static void createFile(){

        File file = new File("C:\\Users\\Computer\\Desktop\\Java için oluşturulan file\\students.txt");
        // yukarıda File sınıfından bir obje oluşturarak bu obje içine bi dosyanın yolunu alıyor ama içi boş bir dosya bu ve
        // içine students.txt isminde birşey oluştur dedik.
        try {
            if(file.createNewFile()){
                // oluşturma işlemini ise createNewFile() fonksiyonu ile yaptık
                System.out.println("the folder found");
                // bu işlemi if fonksiyonu içine aldık çünkü eğer createNewFile işlemi başarı ile tamamlanırsa işlem True döner
                // bu demekki içeride dosya yok ve yeni yaratıldı.
            }
            else{
                System.out.println("the file has already been in there");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        // ve ayrıca bu işlemlerin hepsini try except içine almamız gerekti çünkü dosyalar da try except önemli yani. xd
    }

    public static void getFileinfo(){
        File file = new File("C:\\Users\\Computer\\Desktop\\Java için oluşturulan file\\students.txt");
        if(file.exists()){
            // exist fonksiyonu ise bunun içinde bir dosya var ise true döndürüyor.

            System.out.println("File name : " + file.getName());
            // getName() ile ise o dosyanın ismini vericek.
            System.out.println("File path : " + file.getPath());
            // getPath() dosyanın yolunu veriyor.
            System.out.println("The file can write? : " + file.canWrite());
            // dosyada yazma yetkisi var mı yok mu onu söyler
            System.out.println("The file can read? : " + file.canRead());
            // dosyada okuma yetkisi var mı yok mu onu söyler
            System.out.println("what is the file size : " + file.length());
            // dosyanın boyunu söyler byte cinsinden


        }
    }

    public static void readFile(){

        File file = new File("C:\\Users\\Computer\\Desktop\\Java için oluşturulan file\\students.txt");

        try {
            Scanner reader = new Scanner(file);
            // dosyayı okumak için Scanner sınıfından bir obje oluşturduk ama bu objeyi de import ettik
            // obje oluşurken objenin içine hangi dosyayı okuyacağımızı yazdık.
            while (reader.hasNextLine()){
                // while döngüsü içine aldık çünkü reader objesi de satır satır okuyor ve
                // okunacak satır var olduğu sürece devam edicek.
                String line = reader.nextLine();
                // bir değişken oluşturduk ve onun içine de nextLine() ile okuduğumuz satırları attık.
                System.out.println(line);
                // en son yazdırdık.
            }
            reader.close();
            // dosyayı açtığımız için okumak için bellekten sonra uçurmamız gerek bu nedenden dolayı da kapatırız.
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // bu işlemide try catch içine alıp handle etmemiz gerekiyordu öylede yaptık.
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Computer\\Desktop\\Java için oluşturulan file\\students.txt", true));
            // FileWriter'ı etkili kullanabilmek için bunu BufferedWriter içinde kullanmamız gerekiyor o yüzden BufferedWriter
            // içine FileWriter'ı parametre olarak verdik. eğer parametreleri bu kadar da bırakırsak bu üstüne yazma olmuş olur
            // ve önceki yazılanlar gider bu yüzden True parametresini ekledik bu append'i etkinleştirdi.
            writer.newLine();
            // bu ise yeni satır oluştur sonra ahmeti ekle manasına geldi
            writer.write("ahmet");
            // sonra write fonksiyonu ile dosyamıza bişeler ekledik.
            writer.close();
            // en sonda da dosyayı kapattık.
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }



}
