package week3App;

import week3App.business.ProductManager;
import week3App.core.logging.DatabaseLogger;
import week3App.core.logging.FileLogger;
import week3App.core.logging.Logger;
import week3App.core.logging.MailLogger;
import week3App.dataAccess.HibernateProductDao;
import week3App.dataAccess.JdbcProductDao;
import week3App.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Telefon",10000);
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
}