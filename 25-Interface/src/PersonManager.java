public class PersonManager {

    private ICustomerDal customerDal;
    // dışarıdan erişimi engellemek adına private dedik.

    public PersonManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add(){
        customerDal.add();
        // içeride çağırdık.
    }
}

// bu da diğer bir kullanım yöntemidir. şey dedik burda da bi tane constructor
// tanımladık sonrasında da bu constructor içine bi tane ICustomerDal  parametresi verdik.

