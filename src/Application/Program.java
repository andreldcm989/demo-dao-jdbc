package Application;

import java.util.Date;

import model.Entities.Department;
import model.Entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
