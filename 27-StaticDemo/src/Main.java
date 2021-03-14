public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "laptop";
        product.price = 20;
        manager.add(product);
        //------------------------------------------------

        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnection();
        // böyle class altında class kullanmak çok da iyi bi kullanım değil.
        
    }
}
