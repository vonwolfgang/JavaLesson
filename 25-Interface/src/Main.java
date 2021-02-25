public class Main {

    public static void main(String[] args) {

        ICustomerDal customerDal = new OracleCustomerDal();
        // tanımlamak için interface tarafından implemente edilmiş sınıfı newledik.

        //---------------------------------------------------------------------

        CustomerManager customerManager = new CustomerManager();
        // objemizi tanımladık ama tanımladığımız objenin içinde interface vermiştik
        // bu interface'in hangi çocuğunu kullancağımızı tanımlamamız gerekiyor.
        customerManager.customerDal = new OracleCustomerDal();
        // bu interface'in hangi çocuğunu tanımlayacağımızı belirttik.
        customerManager.add();
        // sonra sınıfın içindeki add fonksiyonunu çağırdık.

        //---------------------------------------------------------------------

        PersonManager personManager = new PersonManager(new MySqlCustomerDal());
        // obje oluşturduk obje oluştururken de ICustomerDal'ın çocuklarından birini
        // parametre olarak verdik.
        personManager.add();
        // çağırdık sonra onu.


    }
}

// 1 class birden fazla interface alabiliyor.

