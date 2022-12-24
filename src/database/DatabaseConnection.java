package database;

import java.sql.*;
public class DatabaseConnection{
    public static void main(String[] args){
        try{
            // loading/register the driver
            Class.forName("com.mysql.jdbc.Driver");

            //Creating connection
            String url = "jdbc:mysql://127.0.0.1:3306/bca_3rd_2079";
            String username = "root";
            String pw ="";
            Connection cn = DriverManager.getConnection(url, username, pw);
            System.out.println("Database Connection Success!");

            // Creating statement
            Statement stat = cn.createStatement();
            String sql = "insert into account (full_name, card_number, pin, balance) values ('Kiran Shrestha', 1234567890, 1234, 10500.50)";
            stat.executeUpdate(sql); // insert/update
        }catch(ClassNotFoundException | SQLException cnfe){
            cnfe.printStackTrace();
        }
    }
}