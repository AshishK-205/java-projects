package com.hellToheaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_1 {
    public static Connection getConnection(){
        Connection conn = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/library_management","root","");
        }
        catch (Exception e){
            System.out.println("class registration failed:");
            System.out.println("failed to connect to the database:");
            e.printStackTrace();
        }
        return conn;
    }

}
