package structural.proxy;

public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDao employeeDao;
    private boolean isRequestFromAdmin;

    public EmployeeDaoProxy() {
        employeeDao = new EmployeeDaoImpl();
        isRequestFromAdmin = true;
    }

    @Override
    public void create() {
        if (isRequestFromAdmin) {
            employeeDao.create();
        } else {
            throw new RuntimeException("Normal User can't create employee");
        }
    }
}
