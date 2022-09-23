public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Marka Laptop",5000,3,"Siyah");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}