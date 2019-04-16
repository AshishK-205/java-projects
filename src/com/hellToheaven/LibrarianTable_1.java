package com.hellToheaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LibrarianTable_1 {
    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/library_management","root","");

            ///////////creating statement //////////////////
            stmt = conn.createStatement();
            System.out.println("Librarian table creating:");
            String createLibrarianTable =
                   "create table if not exists librarian "
                            +"(id int not null auto_increment,"+"name varchar(255) not null,"+
            "password varchar(255) not null,"+"email varchar(255) not null,"+"address varchar(255) not null,"
            +"city varchar(255) not null,"+"contactNo varchar(10) not null,"+"primary key(id))";

            /// update the database/////////////////
            stmt.executeUpdate(createLibrarianTable);

            System.out.println("Table is created successfully");

        }
        catch (Exception e){
            System.out.println("class registration failed:");
            System.out.println("failed to connect to the database:");
            e.printStackTrace();
        }


    }
}
