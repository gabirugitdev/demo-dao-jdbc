package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("-- findById --");
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);

        System.out.println("-- findByDepartment --");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);

        for(Seller s : sellers) {
            System.out.println(s);
        }

        System.out.println("-- findAll --");
        List<Seller> list = sellerDao.findAll();

        for(Seller s : list) {
            System.out.println(s);
        }

        System.out.println("");
    }
}