public class CustomerManager {

    ICustomerDal customerDal;
    public void add(){
        customerDal.add();
    }
}
// yukarıdaki işlem sayesinde tek bir server'a bağımlı olmaktan kurtulduk
// çünkü ICustomerDal diğer server'ların annesi ve bu sayede de
// istediğimiz server'a göre çağırabiliriz. Böyle bir tasarım deseni olduğu gibi
// başka bir tasarım deseni de vardır.

