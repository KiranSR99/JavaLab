package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnect {

    public static Connection getConnection(){
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3308/JavaDatabase";
            String username = "root";
            String password = "";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Database Connected !");
            return conn;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    public static void main(String[] args) throws Exception {
        getConnection();
    }
}
