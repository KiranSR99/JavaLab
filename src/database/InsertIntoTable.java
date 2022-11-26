package database;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertIntoTable extends DatabaseConnect{
    public static void insert(){
        Scanner sc = new Scanner(System.in);
        try{
            Connection conn = getConnection();
            PreparedStatement insert = conn.prepareStatement("INSERT INTO student(fullname,address,class,roll)"
            +"VALUES (?,?,?,?)");
            System.out.print("Student's full name: ");
            insert.setString(1,sc.nextLine());

            System.out.print("Address: ");
            insert.setString(2,sc.nextLine());

            System.out.print("Class: ");
            insert.setInt(3,sc.nextInt());

            System.out.print("Roll no: ");
            insert.setInt(4,sc.nextInt());

            insert.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Data inserted into table.");
        }
    }

    public static void main(String[] args) {
        insert();
    }
}
