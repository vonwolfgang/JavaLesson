public class Main {

    public static void main(String[] args) {

        Product product =new Product();
        product.set_name("laptop");
        product.setId(1);
        product.set_description("asus laptop");
        product.set_price(5000);
        product.set_stockAmount(3);
        // yukarısı getter setter tanımlama.

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        // yukarıda ise ProductManager'dan productManager objesi oluşturduk bu obje ile
        // sınıfın içindeki Add fonksyionunu kullandık bu fonksiyon da parametre olarak içine Product sınıfından 1 obje alıyordu
        // yukarıda tanımladığımız Product sınıfının product objesini içine verdik.

        Personel personel = new Personel();
        // yukarıda parametresiz constructor tanımladık
        Personel personel_1 = new Personel(2,"Led","Zeppelin",3000);
        // yukarıda parametreli constructor tanımladık






    }
}
