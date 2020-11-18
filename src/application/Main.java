package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("-------FIND SELLER BY ID-------");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n-------FIND SELLER BY DEPARTMENT-------");
        List<Seller> sellers = sellerDao.findByDepartment(new Department(2, null));
        sellers.forEach(System.out::println);
    }
}
