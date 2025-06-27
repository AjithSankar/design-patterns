package creational.singleton.lazy;

class DBConnection {
    // Lazy initialization
    private static DBConnection dbConnection;

    // Restricting Object creating by having private access modifier to the constructor
    private DBConnection () {

    }

    /**
    Creates a singleton instance lazily when {@link DBConnection#newInstance()} called
    */
    public static DBConnection newInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }

        return dbConnection;
    }

}


public class Main {

    public static void main(String[] args) {
        DBConnection dbConnection1 = DBConnection.newInstance();
        DBConnection dbConnection2 = DBConnection.newInstance();

        System.out.println(dbConnection1);
        System.out.println(dbConnection2);

        System.out.println(dbConnection1 == dbConnection2);

    }
}
