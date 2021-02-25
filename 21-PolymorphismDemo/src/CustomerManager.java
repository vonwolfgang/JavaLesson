
public class CustomerManager {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger logger){
            this.baseLogger = logger;

    }

    public void add(){

        System.out.println("customer added");
        this.baseLogger.log("log message");


    }

}
