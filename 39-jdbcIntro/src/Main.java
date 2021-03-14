import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


    }


    //---------------------------------------------------------------------------------------------------------


    public static void selectDemo(){

        Connection connection = null;
        // Conneciton sınıfını kullanarak bağlantı yapıcaz

        DbHelper helper = new DbHelper();

        Statement statement = null;
        // Statement class'ını import ettik.

        ResultSet resultSet;
        // Resultset sınıfını import ettik ve result objesini oluşturduk.



        try{

            connection = helper.getConnection();

            statement = connection.createStatement();
            // statement objesi içindeki createStatement() sayesinde sorgu gönderdik.
            // ama bu sorguyu her bir bağlantı için ayrı ayrı göndermemiz gerekir. Çünkü elimizde
            // birden çok bağlantı olabilir.

            resultSet = statement.executeQuery("SELECT Code,Name,Continent,Region FROM country");
            // bu iste sorgu yollarken executeQuery metodu sayesinde içine yazdığımız
            // sorguyu sql de çalıştırıcak.

            ArrayList<Country> countries = new ArrayList<Country>();
            // bitane ArrayList oluşturduk

            while(resultSet.next()){
                // resultSet.next() dememizin sebebi resultSet içindeki satırları tek tek dolaşıcak
                // taki dolaşacak satır kalmayana kadar.

                countries.add(new Country(resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
                // yukarıda şey yaptık oluşturduğumuz country arraylist'in içine bi tane country objesi oluşturduk
                // oluşturduğumuz nesneye parametre olarak kolon isimlerini verdik ama verirken resultsetin içine atanmış olan
                // bu kolon isimlerini sql server dan execute şeyiyle çektiğimiz kolonları verdik.
            }
        }

        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {

            try {
                connection.close();
                // herhangi bir bağlantı kurulamama olasılılığına karşı bunu da try catch içine aldık.
            }

            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            // en sonda da bağlantıyı kessin diye bunu ekledik.
        }
    }


    //-----------------------------------------------------------------------------------------------------------


    public static void insertData(){

        Connection connection = null;
        // Conneciton sınıfını kullanarak bağlantı yapıcaz

        DbHelper helper = new DbHelper();

        PreparedStatement preparedStatement = null;
        // PreparedStatement classını import ettik ve obje oluşturduk

        ResultSet resultSet;
        // Resultset sınıfını import ettik ve result objesini oluşturduk.



        try{

            connection = helper.getConnection();
            // bağlantıyı açtık.

            String sql = "INSERT INTO city(Name, CountryCode, District, Population) VALUES (?,?,?,?)";
            // yukarıda istediğimiz kolonlara ne geleceğini kullanıcıdan alabilmek için kolonlara ait değerlerin olduğu yerlere soru işareti koyduk ve bunu bir değişkene atadık.

            preparedStatement = connection.prepareStatement(sql);
            // kayıt eklemek için ise yukarıdaki gibi farklı bir class kullanıyoruz. Bu class'ın içine eklemek istediğimiz kayıdı verdik.

            preparedStatement.setString(1,"Düzce 2");
            preparedStatement.setString(2,"TUR");
            preparedStatement.setString(3,"Turkey");
            preparedStatement.setInt(4,70000);
            // yukarıda ise soru işaretli yerlere gelecek değerleri belirledik örnek olarak 1. soru işaretine geleceğini belirtmek için 1 yazdık ve
            // yanına gelmesini istediğimiz değeri verdik. Bunu vereceğimiz şeyin türüne göre set ettik yani String verceksek setString int verceksek setInt ile yaptık.

            preparedStatement.execute();
            // işlemi çalıştırdık.

            System.out.println("city signed in");
        }

        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {

            try {
                preparedStatement.close();
                connection.close();

            }

            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            // herhangi bir bağlantı kurulamama olasılılığına karşı bunu da try catch içine aldık.
            // en sonda da bağlantıyı kessin diye connection.close yaptık ama statement'ide kapatmamız gerekiyor o yüzden
            // preparedStatement.close'da yaptık.
        }

    }

    //----------------------------------------------------------------------------------------------------------

    public static void update(){

        Connection connection = null;
        // Connection sınıfını kullanarak bağlantı yapıcaz

        DbHelper helper = new DbHelper();

        PreparedStatement preparedStatement = null;
        // PreparedStatement classını import ettik ve obje oluşturduk

        ResultSet resultSet;
        // Resultset sınıfını import ettik ve result objesini oluşturduk.



        try{

            connection = helper.getConnection();
            // bağlantıyı açtık.

            String sql = "update city set population=12000 where id=?";
            // yaptırmak istediğimiz sorguyu sql değişkeninin içine atadık. Yukarıda kayıt düzenleme yaptık.
            // Hangis ıd'de kayıt düzenleme yapacağımızı kullanıcıdan almak için oraya soru işareti koyduk.

            preparedStatement.setInt(1,123);
            // yukarıda ise soru işaretli yere 123 yaz dedik.

            preparedStatement = connection.prepareStatement(sql);
            // sorgumuzu gerçekleştirecek olan şey yukarıdaki şey.

            preparedStatement.execute();
            // işlemi çalıştırdık.

            System.out.println("record is updated");
        }

        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {

            try {
                preparedStatement.close();
                connection.close();

            }

            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            // herhangi bir bağlantı kurulamama olasılılığına karşı bunu da try catch içine aldık.
            // en sonda da bağlantıyı kessin diye connection.close yaptık ama statement'ide kapatmamız gerekiyor o yüzden
            // preparedStatement.close'da yaptık.
        }

    }


    //----------------------------------------------------------------------------------------------


    public static void delete(){

        Connection connection = null;
        // Connection sınıfını kullanarak bağlantı yapıcaz

        DbHelper helper = new DbHelper();

        PreparedStatement preparedStatement = null;
        // PreparedStatement classını import ettik ve obje oluşturduk

        ResultSet resultSet;
        // Resultset sınıfını import ettik ve result objesini oluşturduk.



        try{

            connection = helper.getConnection();
            // bağlantıyı açtık.

            String sql = "delete from city where id=?";
            // yaptırmak istediğimiz sorguyu sql değişkeninin içine atadık. Kayıt silme yaptık
            // Hangi id'de kayıt silme yapacağımızı kullanıcıdan almak için oraya soru işareti koyduk.

            preparedStatement.setInt(1,123);
            // yukarıda ise soru işaretli yere 123 yaz dedik.

            preparedStatement = connection.prepareStatement(sql);
            // sorgumuzu gerçekleştirecek olan şey yukarıdaki şey.

            preparedStatement.execute();
            // işlemi çalıştırdık.

            System.out.println("record is deleted");
        }

        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {

            try {
                preparedStatement.close();
                connection.close();

            }

            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            // herhangi bir bağlantı kurulamama olasılılığına karşı bunu da try catch içine aldık.
            // en sonda da bağlantıyı kessin diye connection.close yaptık ama statement'ide kapatmamız gerekiyor o yüzden
            // preparedStatement.close'da yaptık.
        }

    }


}

// jdbc bir kütüphane veri tabanlarına erişim için kullanılan bir kütüphane.
// oracle, mysql, sqlserver bunlar veri tabanlarıdır.
