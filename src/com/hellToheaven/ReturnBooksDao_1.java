package com.hellToheaven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.BlockingDeque;

public class ReturnBooksDao_1 {
    public static int delete(String bookcallno,int student_id){
        int status = 0;
        try{

            Connection connection = DB_1.getConnection();
            status = updateBook(bookcallno);
           if(status>0){
               PreparedStatement ps = connection.prepareStatement("delete from issuebooks where bookcallno=? and student_id=?");
               ps.setString(1,bookcallno);
               ps.setInt(2,student_id);
               status = ps.executeUpdate();
           }
           connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return status;
    }

    public static int updateBook(String bookcallno){
        int status = 0;
        int quantity = 0;
        int issued = 0;

        try{
            Connection con = DB_1.getConnection();
            PreparedStatement ps = con.prepareStatement("select quantity,issued from books where callno=?");
            ps.setString(1,bookcallno);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                quantity = rs.getInt("quantity");
                issued = rs.getInt("issued");
            }

            if(issued>0){
                PreparedStatement ps2 = con.prepareStatement("update books set quantity=?,issued=? where callno=?");
                ps2.setInt(1,quantity+1);
                ps2.setInt(2,issued-1);
                ps2.setString(3,bookcallno);

                status = ps2.executeUpdate();
            }
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }
}
