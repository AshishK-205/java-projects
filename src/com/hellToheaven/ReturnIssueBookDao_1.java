package com.hellToheaven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReturnIssueBookDao_1 {
    public static int save(String callno, int quantity, int issuedBooks,int student_id) {
        int status1 = 0;
        try {
            Connection con = DB_1.getConnection();
            PreparedStatement ps = con.prepareStatement("select qunatity,issued from books where callno=?");
            ps.setString(1, callno);
          //  ps.setInt(2, quantity);
            //ps.setInt(3, issuedBooks);
            ResultSet rs = ps.executeQuery();
            int quantity1=0;
            int issuedbooks1=0;
            while(rs.next()){
                 quantity1 = rs.getInt("quantity");
                 issuedbooks1 = rs.getInt("issued");
            }

            PreparedStatement ps2 = con.prepareStatement("update books set quantity=? and issued=? where callno=?");
            ps2.setInt(1,quantity1-1);
            ps2.setInt(2,issuedbooks1+1);
            ps.setString(1,callno);
            int status = ps2.executeUpdate();

            PreparedStatement ps3 = con.prepareStatement("select bookcallno from issuebooks where student_id=?");
            ps3.setInt(1,student_id);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return status1;
    }
}
