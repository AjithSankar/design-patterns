package creational.singleton.BillPugh;

// This technique leverages the Java class loader mechanism for thread safety and lazy initialization without any synchronization.
class DBConnection {

    private DBConnection () {
        System.out.println("Instance created : " + this.hashCode());
    }

    private static final class SingletonHelper {
        private static final DBConnection INSTANCE = new DBConnection();
    }

    public static DBConnection getInstance() {
        return SingletonHelper.INSTANCE;
    }

}


public class Main {

    public static void main(String[] args) {
        DBConnection dbConnection1 = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();

        System.out.println(dbConnection1);
        System.out.println(dbConnection2);

        System.out.println(dbConnection1 == dbConnection2);

    }
}
