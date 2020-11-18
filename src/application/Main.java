package application;

import entities.Department;
import entities.Seller;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Department department = new Department(1, "book");
        Seller seller = new Seller(12, "Fernando", "fernando@gmail.com", new Date(), 3000.0, department);
        System.out.println(seller);
    }
}
