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
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);
        
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);

        for(Seller s : sellers) {
            System.out.println(s);
        }

    }
}