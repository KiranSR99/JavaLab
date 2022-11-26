package database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateTable extends DatabaseConnect{
    public static void tableCreation(){
        try{
            Connection conn = getConnection();
            PreparedStatement create = conn.prepareStatement("CREATE TABLE `javadatabase`.`student` " +
                    "(`ID` INT(5) NOT NULL AUTO_INCREMENT , `fullname` VARCHAR(50) NOT NULL , `address` VARCHAR(50) NOT NULL , " +
                    "`class` int(5) NOT NULL ,`roll` int(5) NOT NULL , PRIMARY KEY (`ID`)) ENGINE = InnoDB;");
            create.executeUpdate();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Function Completed !!");
        }
    }

    public static void main(String[] args) {
        tableCreation();
    }
}
