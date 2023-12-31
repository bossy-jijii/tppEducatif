package databaseConnection;
import java.sql.*;
public class syseducDatabase {
   Connection con;

    public syseducDatabase() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/syseduc","root","RACHIDA1975@");
    }
    public Connection getConnection(){
        return this.con;
    }

}
