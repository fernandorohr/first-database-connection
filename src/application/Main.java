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

        System.out.println("\n-------FIND ALL SELLERS-------");
        List<Seller> allSellers = sellerDao.findAll();
        allSellers.forEach(System.out::println);

//        System.out.println("\n-------INSERT A NEW SELLER-------");
//        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 3000.0, new Department(2, null));
//        sellerDao.insert(newSeller);
//        System.out.println("New seller ID: " + newSeller.getId());

        System.out.println("\n-------UPDATE A SELLER-------");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n-------FIND SELLER BY DEPARTMENT-------");
        sellerDao.deleteById(10);
        System.out.println("Deletion completed");
    }
}
