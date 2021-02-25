import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "Hello man";
        System.out.println(message);

        System.out.println("number of character : " + message.length());
        // metnin uzunluğunu verir.

        System.out.println("show the character which fifth in this sentence : " + message.charAt(4));
        // 4. indexde ki karkateri yani 5. karakteri verir bize

        System.out.println("concat man" + message.concat(" shit "));
        // birleştirmeye yarıyor bu da.

		System.out.println("startswith" + message.startsWith("a"));
		// bu karakter ile mi başlıyor diye sorar doğru ise true yanlış ise false döndürür.

		System.out.println("endswith" + message.endsWith("s"));
		// girilen karakter ile mi bitiyor diye bakar doğru ise true yanlış ise false döndürür.

		char[] characters = new char[5]; // bir dizi oluşturduk
		message.getChars(0,5,characters,0);
		// yukarıda yaptığımız olayda şu oldu oluşturduğumuz characaters array'inin içine
		// getChars fonksiyonu sayesinde karakterleri çektik begin dizinin 0. indexinden 5. indexine kadar koy
		// dstbegin ise message'nin 0. indexinden koymaya başla dedik.

		System.out.println(message.indexOf("l"));
		// aramaya baştan başlar içindeki karakterin index'ini bulunca yazdırır.

		System.out.println(message.lastIndexOf("l"));
		// aramaya sondan başlar içindeki karaktere denk gelince indexini baştan sayılmaya göre yazdırır..

		System.out.println(message.replace(' ', '-'));
		// yukarıdaki fonksiyon sayesinde boşluk karakterlerine kısa çizgi karakteri koyabiliyoruz.
		// bu yeni bi string oluşturur yani yeni bi değişkene atarak kullanabilirsin.

		System.out.println(message.substring(2,4));
		// yukarıdaki kod şey işine yarıyor metnimizi 2 ile 4 indexleri arasında bölüyor. onu alıyor.


		for(String word : message.split(" ")){
			System.out.println(message.split(word));
		}
		// split fonksiyonu ise metni dizi şeklinde içine girdiğimiz karkatere göre ayırır.

		System.out.println(message.toLowerCase());
		// tüm harfleri küçültür
		System.out.println(message.toUpperCase());
		// tüm harfleri büyütür
		System.out.println(message.trim());
		// metnin başındaki ve sonundaki boşlukları atar.

	}
}
