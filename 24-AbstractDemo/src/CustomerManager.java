public class CustomerManager {

    BaseDataBaseManager baseDataBaseManager;

    public void getCustomers(){

        baseDataBaseManager.getData();

    }
}

// yukarıda ki yaptığımız işlem şu aslında bu databaselerin annesi olarak
// BaseDataBaseManager belirledik sonra bundan bişey oluşturduk
// ve getCustomers içinde onu çağırdık çünkü bağımlı olmak istemedik
// bu sayede istediğimiz server'a göre çağırabiliriz.
