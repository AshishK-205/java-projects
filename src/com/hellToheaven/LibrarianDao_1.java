package com.hellToheaven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LibrarianDao_1 {
        public static int save(String name1,String password,String email,String address,String city,String contactNo){
            int status =0 ;
            try{
                    Connection con = DB_1.getConnection();
                    PreparedStatement ps =
                            con.prepareStatement("insert into librarian(name,password,email,address,city,contactNo) values(?,?,?,?,?,?)");
                    ps.setString(1,name1);
                    ps.setString(2,password);
                    ps.setString(3,email);
                    ps.setString(4,address);
                    ps.setString(5,city);
                    ps.setString(6,contactNo);
                status = ps.executeUpdate();
                con.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return  status;
        }

        public  static int delete(int id){
                int status = 0;
                Connection con = DB_1.getConnection();
                try{
                    PreparedStatement ps = con.prepareStatement("delete from librarian where id=?");
                    ps.setInt(1,id);
                    status = ps.executeUpdate();
                    con.close();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                return status;
        }

        public static boolean validate(String name1,String password){
            boolean status = false;
            Connection con = DB_1.getConnection();
            try{
                PreparedStatement ps = con.prepareStatement("select * from librarian where name=? and password=?");
                ps.setString(1,name1);
                ps.setString(2,password);
                ResultSet rs =ps.executeQuery();
                status = rs.next();
                con.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            return status;
        }

}
