package week3App.dataAccess;

import week3App.entities.Product;

public class HibernateProductDao implements ProductDao{
    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile veritabanına eklendi");

    }
}
