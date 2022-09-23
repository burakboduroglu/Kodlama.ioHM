public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Marka Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}