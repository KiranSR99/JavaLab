package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayAll extends DatabaseConnect {
    public static void main(String[] args) {
        try{
            Connection conn = getConnection();
            Statement smt=conn.createStatement();

            //query to display all records from table employee
            String q="Select * from student";

            //to execute query
            ResultSet rs=smt.executeQuery(q);

            //to print the resultset on console
            if(rs.next()){
                do{
                    System.out.println(rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
                }while(rs.next());
            }
            else{
                System.out.println("Record Not Found...");
            }
            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
