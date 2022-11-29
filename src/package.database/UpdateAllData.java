package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateAllData extends DatabaseConnect{
    public static void update(){
        Scanner sc = new Scanner(System.in);
        try{
            Connection conn = getConnection();
            PreparedStatement update = conn.prepareStatement("UPDATE student SET fullname=?, address=?, class=?, roll=?");

//            System.out.print("Enter ID to edit data: ");
//            update.setInt(5,sc.nextInt());

            System.out.print("Student's full name: ");
            update.setString(1,sc.nextLine());

            System.out.print("Address: ");
            update.setString(2,sc.nextLine());

            System.out.print("Class: ");
            update.setInt(3,sc.nextInt());

            System.out.print("Roll no: ");
            update.setInt(4,sc.nextInt());

            update.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Data updated into table.");
        }
    }

    public static void main(String[] args) throws Exception {

        PreparedStatement count = getConnection().prepareStatement("SELECT count(*) FROM student");
        ResultSet rs = count.executeQuery();
        rs.next();
        int rows = rs.getInt(1);

        for (int i = 0; i<=rows; i++){
            update();
        }
    }
}
