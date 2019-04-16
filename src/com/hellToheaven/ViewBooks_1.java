package com.hellToheaven;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ViewBooks_1 extends JFrame{
    JPanel panel;
    JTable table;
    public ViewBooks_1(){
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5,5,5,5));
        panel.setLayout(new BorderLayout(0,0));
        setContentPane(panel);

        String data[][] = null;
        String column[] = null;

        try{
            Connection con = DB_1.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from books");
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            int col = resultSetMetaData.getColumnCount();
            column = new String[col];
            for(int i=1;i<=col;i++){
                column[i-1] = resultSetMetaData.getColumnName(i);
            }

            rs.last();
            int row = rs.getRow();
            rs.beforeFirst();

            data = new String[row][col];
            int count=0;
            while(rs.next()){
                for(int i=1;i<=col;i++){
                    data[count][i-1] = rs.getString(i);
                }
                count++;
            }
            con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
       table = new JTable(data,column);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane,BorderLayout.CENTER);

        setSize(1150,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new ViewBooks_1().setVisible(true);
    }
}
