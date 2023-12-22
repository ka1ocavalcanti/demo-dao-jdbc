package application;

import model.entities.Department;
import model.entities.Seller;
import modelDao.DaoFactory;
import modelDao.SellerDao;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21,"BoB", "bob@gmail", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
