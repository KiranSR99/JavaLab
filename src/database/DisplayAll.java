package database;

import java.sql.*;

public class DisplayAll extends database.DatabaseConnect {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            conn = getConnection();
            Statement smt=conn.createStatement();

            //query to display all records from table student
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
