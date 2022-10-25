import business.ProductManager;
import core.loging.DatabaseLogger;
import core.loging.FileLogger;
import core.loging.Logger;
import core.loging.MailLogger;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import dataAccess.ProductDao;
import entities.Product;



public class Main {

    public static void main(String[] args) throws Exception {
        Product product1=new Product(1,"Samsung",5000);
        Logger[] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};

        ProductManager productManager=new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);

    }
}
