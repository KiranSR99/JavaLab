package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {

    public static Connection getConnection(){
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/JavaDatabase";
            String username = "root";
            String password = "";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Database Connection Successful !");
            return conn;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    public static void main(String[] args) throws Exception {
        Connection conn = getConnection();

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                /* ignore */
            }
        }
    }
}
