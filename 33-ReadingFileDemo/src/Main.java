import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        // BufferedReader dosya okumamıza yarayan bir sınıf ilk başta içi boş olarak
        // bir tane tanımladık.
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Computer\\Desktop\\Java_programing\\33-ReadingFileDemo\\src\\numbers.txt"));
            // burda içi boş olarak tanımladığımız dosyanın içini BufferedReader içinde bulunan FileReader objesi ile doldurduk o objede içine
            // dosyanın path'ini alıyor onu da verdik.
            String line = null;
            // dosya okuma işlemlerinde dosya satır satır okunur ondan dolayı
            // boş bir string ifade tanımladık
            while((line = reader.readLine())!=null){
                // readLine() satır satır oku dedik eğer satır içindeki değer boş değilse True dönücek
                // böylece işleme devam edicek. Bu yukarıdaki readLine işlemi içinde bir catch bloğu ekledik
                // olası bir hata olabilir diye ide otomatik olarak ekledi.
                total += Integer.valueOf(line);
                // Integer.valueOf() diyerek bir değeri int'e dönüştürebilirsin.
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            // burda hatayı döndür dedik eğer try bloğunda hata alırsak. Bu hata dosya bulunamadı hatası
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                reader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            // yukarıda ki şeyi de ayrıca bir try catch bloğuna aldık çünkü biz dosyayı kapa komutunu verdik
            // ama dosyanın açılacağının garantisi yok o yüzden dedikki dosyayı kapatmaya çalış eğer dosyayı kapatamıyorsan
            // IOException gönder dedik.
        }




    }
}
