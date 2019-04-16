package com.hellToheaven;

import java.sql.*;

public class IssueBookTable_1 {
    public static void main(String[] args){
        Connection con = null;
        Statement stmt = null;

        try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/library_management","root","");

                //creating the statement
                stmt = con.createStatement();

                System.out.println("Table is creating");

                String createTableIssuesBooks = "create table if not exists issuebooks"
                        + "(id int not null auto_increment,"+"bookcallno varchar(100) not null,"
            +"student_id int not null,"+"student_name varchar(100) not null,"
                        +"studentcontact varchar(100) not null,"
                        +"issued_date timestamp not null default current_timestamp on update current_timestamp,"
            +"primary key(id))";

                stmt.executeUpdate(createTableIssuesBooks);
                System.out.println("Table is created");
        }
        catch (Exception e){
            System.out.println("class registration failed");
            System.out.println("database connection failed");
            e.printStackTrace();
        }
    }
}
