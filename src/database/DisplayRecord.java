package database;

import java.sql.*;
import java.util.Scanner;

public class DisplayRecord extends database.DatabaseConnect {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            Scanner sc = new Scanner(System.in);
            conn = getConnection();
            Statement smt=conn.createStatement();

            System.out.print("Enter name: ");
            String fullname = sc.nextLine();

            //query to display all records from table student
            String q="SELECT * FROM student WHERE fullname='"+fullname+"'";

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
        } catch(Exception e){
            System.out.println(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    /* ignore */
                }
            }
        }
    }

}
