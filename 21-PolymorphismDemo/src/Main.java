import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsoleLogger()};
        // yukarıda BaseLogger'dan array oluşturduk içinde extend edilmiş çocukları olan bir array.

        for(BaseLogger logger : loggers){
            logger.log("log message");
        }

        //-----------------------------------------------------

        System.out.println("*********************************");

        //------------------------------------------------------
        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();
        CustomerManager customerManager1 = new CustomerManager(new FileLogger());
        customerManager1.add();
        CustomerManager customerManager2 = new CustomerManager(new EmailLogger());
        customerManager2.add();


    }
}
