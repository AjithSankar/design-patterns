package creational.singleton.eager;

class DBConnection {
    // Eagerly creating the object during class loading. This object is not associated with any instance of the class because it's static.
    private static DBConnection dbConnection = new DBConnection();

    // Restricting Object creating by having private access modifier to the constructor
    private DBConnection () {

    }

    public static DBConnection newInstance() {
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
