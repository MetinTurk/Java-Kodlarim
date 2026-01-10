
package VeriTabani;

import java.sql.*;

public class VeritabaniBaglantisi {
    private static final String URL = "jdbc:mysql://localhost:3306/film_kutuphanesi";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Sila1234"; 

    public static Connection baglan() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
