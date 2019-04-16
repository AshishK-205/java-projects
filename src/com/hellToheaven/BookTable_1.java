package com.hellToheaven;

import java.sql.*;

public class BookTable_1 {
        public static void main(String[] args){
            Connection con = null;
            Statement stmt = null;

            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/library_management","root","");

                //creating the statement
                stmt = con.createStatement();

                System.out.println("Books table is creating:");

                String bookTable = "create table if not exists books " +
                        "(id int not null auto_increment,"+"callno varchar(100) not null,"
                +"name varchar(100) not null,"
                        +"author varchar(100) not null,"+"publisher varchar(100) not null,"
                        +"quantity int not null,"
                +"issued int not null,"
                        +"added_date timestamp not null default current_timestamp on update current_timestamp,"
                +"primary key(id),"+"unique key callno(callno),"+"unique key callno_2(callno))";

                stmt.executeUpdate(bookTable);
                System.out.println("Books table is created:");
            }
            catch(Exception e){
                System.out.println("class registration failed");
                System.out.println("failed to connect to the database");
                e.printStackTrace();
            }
        }
}
