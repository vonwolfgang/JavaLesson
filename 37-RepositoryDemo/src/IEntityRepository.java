public interface IEntityRepository<T extends IEntity> {

    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
// yukarıda bir tane interface tanımladık ama tipi değişken olabilir dedik yani generic kullandık
// biz T verdik ve içine yazdığımız operasyonların tipine de aynı T den oluşacak bir obje alabilir dedik.

// yukarıda generic kısıtlaması vermek için bu IEntityRepository sadece IEntity şeylerini generic eder dedik ve
// bu sayede generic sınırlandırması yapmış olduk.

