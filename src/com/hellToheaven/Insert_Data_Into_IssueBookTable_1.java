package com.hellToheaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_Data_Into_IssueBookTable_1 {
    public static void main(String[] args){
        Connection con = null;
        Statement stmt = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/library_management","root","");

            //creating the statement
            stmt = con.createStatement();

            String insertIntoIssueBook0 = "insert into issuebooks(bookcallno,student_id,student_name,studentcontact,issued_date) "
                    + "values('A@4','2','Ashish Kumar','7417678091','2018-05-20 19:37:56')";

            String insertIntoIssueBook1 = "insert into issuebooks(bookcallno,student_id,student_name,studentcontact,issued_date) "
                    + "values('B@1','3','Sanat Biswas','34218091','2018-05-20 19:57:56')";

            stmt.executeUpdate(insertIntoIssueBook0);
            stmt.executeUpdate(insertIntoIssueBook1);
            System.out.println("Data is successfully inserted");
        }
        catch (Exception e){
            System.out.println("class registration failed");
            System.out.println("database connection failed");
            e.printStackTrace();
        }
    }
}
