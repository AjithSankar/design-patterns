package structural.proxy;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create() {
        System.out.println("Employee created successfully...");
    }
}
