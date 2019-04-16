package com.hellToheaven;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_Data_Into_LibrarianDao_1 {
    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/library_management","root","");

            ///// create the statement to execute the query///
            stmt = conn.createStatement();
            System.out.println("Data is inserted");

            String dataInserting0 = "insert into librarian(name,password,email,address,city,contactNo) " +
                        "values('Ashish Kumar','ashish123','ashishakr20595.ak@gmail.com'," +
                    "'moonkanivashihu12','Dehradun','7417678091')";

            String dataInserting1 = "insert into librarian(name,password,email,address,city,contactNo) " +
                    "values('Sanat Biswas','sanat123','sanatbiswa123@gmail.com'," +
                    "'moonkanivashihuChltahaiKya12','Dehradun','1217678091')";

            String dataInserting2 = "insert into librarian(name,password,email,address,city,contactNo) " +
                    "values('Kala','kalaSaurabh103','kalaSaurabh123@orkut.com'," +
                    "'city_Of_dream','Dehradun','6917678091')";

            String dataInserting3 = "insert into librarian(name,password,email,address,city,contactNo) " +
                    "values('John Rambo','johnrambo123','johnrambo@gmail.com'," +
                    "'Usa mile 1200','usa','12321191')";

//            stmt.executeUpdate(dataInserting0);
//            stmt.executeUpdate(dataInserting1);
//            stmt.executeUpdate(dataInserting2);
            stmt.executeUpdate(dataInserting3);
            System.out.println("Data is inserted successfully");

        }
        catch (Exception e){
            System.out.println("class registration failed:");
            System.out.println("failed to connect to the database:");
            e.printStackTrace();
        }
    }
}
