public class Validator {

    public <T extends IEntity> void validate(T entity){

    }


}
// yukarıda ise bir class'ı generic etmeden o class içindeki metodu generic ettik
// ayrıca extends IEntity diyerek de hangi genericlerin alınabileceğini belirtip generic kısıtlaması yapmış olduk.

