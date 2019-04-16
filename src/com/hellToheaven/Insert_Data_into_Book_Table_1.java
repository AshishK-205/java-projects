package com.hellToheaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_Data_into_Book_Table_1 {
    public static void main(String[] args){
        Connection con = null;
        Statement stmt = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/library_management","root","");

            //creating the statement////////////
            stmt = con.createStatement();
            System.out.println("Data is inserting");
            String inserDataIntoBookTable0 = "insert into books(callno,name,author,publisher,quantity,issued,added_date)" +
                    "values('A@4','Java The Complete Reference','Herbert Schildt','Ashish','2','2','2018-05-20 19:37:56')";

            String inserDataIntoBookTable1 = "insert into books(callno,name,author,publisher,quantity,issued,added_date)" +
                    "values('B@1','MySQL','Paul Dubois','Addision Wesley','2','2','2018-05-20 19:47:50')";

            stmt.executeUpdate(inserDataIntoBookTable0);
            stmt.executeUpdate(inserDataIntoBookTable1);
            System.out.println("Data is successfully inserted");
        }
        catch(Exception e){
            System.out.println("class registration failed");
            System.out.println("failed to connect to the database");
            e.printStackTrace();
        }
    }
}
