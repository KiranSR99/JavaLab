package database;

//import java.sql.Connection;
import java.sql.*;
import java.util.Scanner;

public class DeleteRecord extends database.DatabaseConnect {
    public static void delete(){
        Connection conn = null;
        Scanner sc = new Scanner(System.in);
        try{
            conn = getConnection();
            PreparedStatement delete = conn.prepareStatement("DELETE FROM `student` WHERE id=?");

            System.out.print("Enter ID to delete record: ");
            delete.setInt(1,sc.nextInt());
            delete.executeUpdate();
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
            System.out.println("Record deleted from table.");
        }
    }


    public static void main(String[] args) {
        delete();
    }
}
