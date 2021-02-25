public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager1 = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager.baseDataBaseManager = new OracleDataBaseManager();
        customerManager1.baseDataBaseManager = new SqlServerDataBaseManager();
        customerManager2.baseDataBaseManager = new SqlServerDataBaseManager();
        // yukarıdaki gibi bağımlı olmadan çağırabiliriz.

        customerManager.getCustomers();
        customerManager1.getCustomers();
        customerManager2.getCustomers();
        // burda çağırdık bu sayede herhangi bir server'a bağımlı olmadna çağırabiliriz.

        //-------------------------------------------------------------------------


    }
}
