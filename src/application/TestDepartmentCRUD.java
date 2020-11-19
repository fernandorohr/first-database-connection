package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class TestDepartmentCRUD {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("-------FIND ALL DEPARTMENTS-------");
        List<Department> departments = departmentDao.findAll();
        System.out.println(departments);

        System.out.println("\n-------FIND SELLER BY ID-------");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n-------INSERT A DEPARTMENT-------");
        Department newDepartment = new Department(3, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("New department ID: " + newDepartment.getId());

        System.out.println("\n-------UPDATE A DEPARTMENT-------");
        Department updateDepartment = new Department(6, "Movie");
        departmentDao.update(updateDepartment);
        System.out.println("Department updated!");

        System.out.println("\n-------DELETE A DEPARTMENT-------");
        departmentDao.deleteById(5);
        System.out.println("Department deleted!");
    }
}
