package com.hellToheaven;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ViewLibrarian_1 extends JFrame{
    private JPanel panel;
    private JTable table;
    public ViewLibrarian_1(){
        super("View Librarian");
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5,5,5,5));
        panel.setLayout(new BorderLayout(1,0));
        setContentPane(panel);
        String data[][] = null;
        String column[] = null;

        try{
            Connection con = DB_1.getConnection();
            PreparedStatement ps  = con.prepareStatement("select * from librarian");
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            int cols = resultSetMetaData.getColumnCount();
            column = new String[cols];
            for(int i=1;i<=cols;i++){
                column[i-1] = resultSetMetaData.getColumnName(i);
            }

            rs.last();
            int rows = rs.getRow();
            rs.beforeFirst();


            data = new String[rows][cols];
            int count=0;
            while(rs.next()){
                for(int i=1;i<=cols;i++){
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
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewLibrarian_1().setVisible(true);
            }
        });
    }
}
