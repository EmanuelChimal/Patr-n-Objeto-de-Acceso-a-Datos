package folder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConMySQL {
    private Connection conn;
    private final String bd;
    private final String host;
    private final String port;

    public ConMySQL() {
        bd = "mrysiEscuelas";
        host = "localhost";
        port = "3306";
        conn = null;
    }

    private boolean setDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return true;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

    public Connection getConnection() throws SQLException {
        if (setDriver()) {
            String URL = "jdbc:mysql://" + host + ":" + port + "/" + bd;
            conn = DriverManager.getConnection(URL, "lania", "admin");
        }
        return conn;
    }
}
