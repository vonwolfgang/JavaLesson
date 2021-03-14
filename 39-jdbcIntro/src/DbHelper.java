import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

    private String userName = "root";
    // sql server için kullanıcı adımızı tutan bir string oluşturduk

    private String password = "Omer1010.";
    // gene sql server'ımız için şifremizi tutan bir string oluşturduk

    private String dbUrl = "jdbc:mysql://localhost:3306/world";
    // yukarıda ise hangi data ya bağlanacağımızı tutan bir path oluşturduk bu path'te
    // jdbc:mysql://(bu kısma bağlanacağımız makinenin ip'ini giricez biz kendi makinamıza bağlanacağımız için local host verdik)
    // :(bu kısım ise bağlanacağımız port)/(bu kısım ise data set ismi)



    public Connection getConnection() throws SQLException {

        return DriverManager.getConnection(dbUrl, userName, password);
        // biz connection şeyini yaparken try catch kullandık herhangi bir bağlanamama sorununa karşı
        // DriverManager bir class heralde o class'daki getConnection ile bağlantıyı kurduk
        // getConnection içine path, username ve password istiyordu onlarıda verdik.
        // try catch içine alınca nedense hata veriyordu bu nedenle hata fırlatma şeklini kullandım.
    }


    public void showErrorMessage(SQLException exception){
        System.out.println("Error message : " + exception.getMessage());
        // exception.getMessage() mesajı verir.
        System.out.println("Error code : " + exception.getErrorCode());
        // exception.getErrorCode() hatanın kodunu verir.
    }
}
