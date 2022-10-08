package week3App.dataAccess;

import week3App.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır... SQL
        System.out.println("JDBC ile veritabanına eklendi.");
    }

}
