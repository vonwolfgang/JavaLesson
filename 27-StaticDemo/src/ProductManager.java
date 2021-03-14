public class ProductManager {

    public void add(Product product){
        //ProductValidator validator = new ProductValidator();
        if(ProductValidator.isValid(product)){
            System.out.println("added");
        }
       else{
           System.out.println("the product couldn't add");
        }
    }
}

// yukarıda ürünü kontrol eden sınıfı çağırdık bu sınıfın içindeki
// valid metodunu kullandık, ve eğer valid metodu true ise ürün eklenicek
// true değil ise eklenmicek.

// yukarıdaki gibi ProductValidator'u new lemeden direk operasyonunu kullanabilmemizin sebebi operasyonu static çevirmemizdir.

