public class CustomerDal implements IEntityRepository<Customer>{
    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }
}

// yukarıda ise oluşturduğumuz CustomerDal objesinin içine IEntitiRepository'i implements ettik ama implement ederken
// biz operasyonlar belli bir tip alması gerekiyordu bu tipi de Customer diye bir class oluşturduk ve tip olarak ise Customer
// tipinde objeler al içine dedik.

