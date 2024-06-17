package folder;

/**
 *
 * @author Alan DoubleEight4
 */
private Connection conn;
private String bd;
private String host;
private String port;

public ConexionMYSQL (){
    bd = "mrysiEscuelas";
    host = "localhost";
    port = "3306";
    conn = null;
}
private boolean setDriver(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        return true;
} catch (ClassNotFoundException ex) {
        return false;
}
}
public Connection getConnection() throws SQLException{
    if(setDriver()){
        String URL = "jdbc:mysql://"+host+":"+port+"/"+bd;
        conn = DriverManager.getConnection(URL, "lania", "admin");
}
    return conn;
}
