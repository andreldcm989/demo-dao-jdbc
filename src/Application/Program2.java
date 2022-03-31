package Application;

import java.util.List;
import java.util.Scanner;

import model.Entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao depDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department insert ====");
        Department dep = new Department(null, "Library");
        depDao.insert(dep);
        System.out.println("Inserted new ID = " + dep.getId());

        System.out.println("\n=== TEST 2: Department findById ====");
        dep = depDao.findById(14);
        System.out.println(dep);

        System.out.println("\n=== TEST 3: Department update ====");
        Department dep2 = depDao.findById(7);
        dep2.setName("Equipments");
        depDao.update(dep2);
        System.out.println("Update completed! ");

        System.out.println("\n=== TEST 4: Seller delete ====");
        System.out.println("Enter ID for delete test: ");
        int id = sc.nextInt();
        depDao.deleteById(id);
        System.out.println("Delete completed! ");

        System.out.println("\n=== TEST 5: findAll =======");
        List<Department> list = depDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

        sc.close();
    }
}
