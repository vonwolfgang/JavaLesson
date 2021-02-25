public class MySqlCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("My sql added");
    }
}
// implements interface'i içine aldık demek
// Override yazmasının sebebi kodun okunurluğunu arttırmak için
// otomatik olarak oldu çünkü ampül kullandık.
// yukarıdaki gibi 1. interface'in yanına virgül koyup 2. interface'i ekleyebiliriz


