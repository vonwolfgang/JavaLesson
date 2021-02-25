public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        // customerManager isminde bir obje oluşturduk
        CustomerManager customerManager_1 = new CustomerManager();
        // customerManager isminde bir obje oluşturduk
        customerManager.Add();
        customerManager.Delete();
        customerManager.listed();
        // classın içindeki fonksiyonları çağırdık
        // classlar referans tiptir
        customerManager = customerManager_1;
        // birinci objenin referansı değişti. 1. objenin referansını tutan birşey
        // olmadığı için 1. referans değeri silindi




    }
}



