package structural.proxy;

public class Main {

    public static void main(String[] args) {

        EmployeeDao employeeDao = new EmployeeDaoProxy();
        employeeDao.create();
    }
}
