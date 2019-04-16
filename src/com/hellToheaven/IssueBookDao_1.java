package com.hellToheaven;

import com.hellToheaven.DB_1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class IssueBookDao_1 {
    public static int sava(String bookcallno,int student_id,String student_name,String studentcontact){
        int status = 0;
        try{
            Connection con = DB_1.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into issuebooks(bookcallno,student_id,student_name,studentcontact) " +
                    "values(?,?,?,?)");
            ps.setString(1,bookcallno);
            ps.setInt(2,student_id);
            ps.setString(3,student_name);
            ps.setString(4,studentcontact);

            status = ps.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }
}
