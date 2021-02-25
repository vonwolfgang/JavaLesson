

// Getter - Setter
public class Product {

    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;



    public int getId() {
        return _id;
    }
    // getter tanımladık bu sayede id değerini okuyabiliyoruz

    public void setId(int id) {
        //this._id = id;
        _id = id;
    }
    // yanda setter tanımladık bu sayede yukarıdaki classda tanımladığımız
    // id değerini set edebiliyoruz yani düzenleyebiliyoruz
    // this. demek yerine isimler karışmasın diye böylede yapılabilir.
    // parametre olarak vermemiz gerekti düzenlememiz içinde this.id dememizin sebebide

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        this._price = price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }
}

// burda product'ın özelliklerini değişken şeklinde tutan bir sınıf tanımladık

// yukarıdaki gibi tanımlarsak başına public felan yazmadan default olarak bu public olur
// c sharp da ise bu private'dır default değeri.

// Private : sadece tanımlandığı blok da ve alt bloklarda geçerlidir
// Public : heryerde geçerlidir.