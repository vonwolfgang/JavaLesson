public class ProductValidator {

    // static constructor
    static{
        System.out.println("Static construct is starting");
    }
    static{
        System.out.println("Static1 construct is starting");
    }

    // constructor
    public ProductValidator(){
        System.out.println("Construct is starting");
    }


    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    // inner class
    public static class OtherClass{
        public static void delete(){

        }

    }



}

// yukarıda şey dedik fonksiyonumuzun içine bir tane Product sınıfından
// nesne parametresi verdik sonra dedik ki eğer product nesnesinin
// price'ı sıfırdan büyükse ve ismi verilmişse true döndür bunun dışında false döndür dedik
// isEmpty() içi boş mu diye bakıyor. Biz yukarıda ! işareti koyarak içi boş değil ise dedik.
// yukarıdaki operasyonu static yapmamız sayesinde bu operasyonu ProductValidator.isValid() şeklinde
// çağırabiliriz. Static tanımlamanın şöyle bir eksisi var biz eğer new'leseydik o new'lediğimiz nesne
// işimiz bittiğinde bellekten atılacaktı ama static bellekten uygulama sıfırlanana kadar atılmıyor.
// yani bir kişi static bir nesneyi kullandığında uygulamada diğer kişilerde aynı nesneyi kullanıyor.
// new'lediğinde ise herkes farklı bir nesne kullanmış oluyor bu önemli bişe.
// yukarıda tanımladığımız constructor eğer biz newlemessek çalışmaz ama C# 'da çalışır.
// java'da ise eğer static bir şekilde constructor çalıştırmak istersek yukarıdaki gibi static yapıcı bloklar tanımlarız.
// birden fazla static yapıcı blok oluşturulabilir ve onların hepsi çalışır
// java'da ana class static olamıyor ama C#'da ana class static olabiliyor.
// yukarıdaki gibi ana class altında bir tane inner class tanımladık inner class'ın içinde static metod tanımlamak için
// inner class'ın isimlendirmesine de static koymak gerekiyor.









