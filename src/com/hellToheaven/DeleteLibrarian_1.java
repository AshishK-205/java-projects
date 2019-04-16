package com.hellToheaven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteLibrarian_1 extends JFrame {
    public DeleteLibrarian_1(){
        setTitle("Delete Librarian");

        JLabel enterID = new JLabel("Enter ID:");
        JTextField deleteField = new JTextField();
        JButton deleteBtn = new JButton("Delete");
        deleteBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int id = Integer.parseInt(deleteField.getText());
                int result =LibrarianDao_1.delete(id);
                if(result>0){
                    JOptionPane.showMessageDialog(DeleteLibrarian_1.this,
                            "Librarian Deleted Successfully","Deletion",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(DeleteLibrarian_1.this,
                            "Librarian failed to delete","Deletion",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        JButton backBtn = new JButton("Back");
        backBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                AdminSection_1.main(new String[]{});
            }
        });
        //////////////// enter ID //////////////////////////////////
        enterID.setFont(new Font("Tahoma",Font.PLAIN,20));

        ////////////////// deleteBtn ///////////////////////////////
        deleteBtn.setFont(new Font("Tahoma",Font.PLAIN,18));

        ////////////////// backBtn ///////////////////////////////
        backBtn.setFont(new Font("Tahoma",Font.PLAIN,18));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addContainerGap(200,Short.MAX_VALUE)
                .addComponent(enterID).addGap(50)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(deleteField,GroupLayout.PREFERRED_SIZE,200,GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteBtn,GroupLayout.PREFERRED_SIZE,150,GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtn,GroupLayout.PREFERRED_SIZE,150,GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200,Short.MAX_VALUE)
        );

        layout.setVerticalGroup(layout.createSequentialGroup().addContainerGap(150,Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(enterID)
                        .addComponent(deleteField,GroupLayout.PREFERRED_SIZE,27,GroupLayout.PREFERRED_SIZE)
                        .addGap(50))
                .addComponent(deleteBtn,GroupLayout.PREFERRED_SIZE,50,GroupLayout.PREFERRED_SIZE).addGap(40)
                .addComponent(backBtn,GroupLayout.PREFERRED_SIZE,50,GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250,Short.MAX_VALUE));


        setSize(1150,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DeleteLibrarian_1().setVisible(true);
            }
        });
    }
}

