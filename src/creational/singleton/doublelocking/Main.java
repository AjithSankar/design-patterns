package creational.singleton.doublelocking;

class DBConnection {
    // Lazy initialization
    private static volatile DBConnection dbConnection;

    // Restricting Object creating by having private access modifier to the constructor
    private DBConnection () {
        System.out.println("Instance created : " + this.hashCode());
    }

    /**
    Creates a singleton instance lazily when {@link DBConnection#getInstance()} called
    */
    public static DBConnection getInstance() {

        if (dbConnection == null) {  // First check (No Lock)
            synchronized (DBConnection.class) {
                if (dbConnection == null) {  // Second check (with locking)
                    dbConnection = new DBConnection();
                }
            }
        }

        return dbConnection;
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
