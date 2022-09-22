public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
        product1.setName("Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("resim-1.jpg");

        Product product2 = new Product();
        product2.setName("Çay Makinesi");
        product2.setUnitPrice(7500);
        product2.setDiscount(7);
        product2.setUnitsInStock(3);
        product2.setImageUrl("resim-2.jpg");


        Product product3 = new Product();
        product3.setName("Dondurma Makinesi");
        product3.setUnitPrice(7500);
        product3.setDiscount(7);
        product3.setUnitsInStock(3);
        product3.setImageUrl("resim-2.jpg");


        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products){
            System.out.println("<li>" + product.getName() + "<li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("İsim");
        individualCustomer.setLastName("Soyad");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Şirket Adı");
        corporateCustomer.setPhone("0533333333");
        corporateCustomer.setTaxNumber("111111111111");
        corporateCustomer.setCustomerNumber("54321");


        Customer[] customers = {individualCustomer, corporateCustomer};
    }
}