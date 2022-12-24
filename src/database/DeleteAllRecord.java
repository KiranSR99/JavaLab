package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteAllRecord extends database.DatabaseConnect {
    public static void delete(){
        Connection conn = null;
        Scanner sc = new Scanner(System.in);
        try{
            conn = getConnection();
            PreparedStatement delete = conn.prepareStatement("DELETE FROM `student`");
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
