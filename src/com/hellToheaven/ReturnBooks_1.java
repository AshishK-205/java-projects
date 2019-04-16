package com.hellToheaven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReturnBooks_1 extends JFrame{
    public ReturnBooks_1(){
        setTitle("Return Books");

        JLabel returnBookLabel = new JLabel("Return Book");
        JLabel bookCallNo = new JLabel("Book CallNo:");
        JLabel studentId = new JLabel("Student ID:");
        JTextField bookCallNoField = new JTextField();
        JTextField studentField = new JTextField();
        JButton returnBookBtn = new JButton("Return Book");
        JButton backBtn = new JButton("Back");
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LibrarySection_1.main(new String[]{});
            }
        });

        returnBookBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookcallno = bookCallNoField.getText();
                int id = Integer.parseInt(studentField.getText());

                int result = ReturnBooksDao_1.delete(bookcallno,id);
                if(result>0){
                    JOptionPane.showMessageDialog(ReturnBooks_1.this,
                            "book return successfully","Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(ReturnBooks_1.this,
                            "book does not exist","Error",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        ///////////////////  returnBookLabel /////////////////////////////////
        returnBookLabel.setFont(new Font("Tahoma",Font.PLAIN,28));

        ///////////////////  bookCallNo /////////////////////////////////
        bookCallNo.setFont(new Font("Tahoma",Font.PLAIN,22));
        bookCallNoField.setFont(new Font("Tahoma",2,22));

        ///////////////////  studentID /////////////////////////////////
        studentId.setFont(new Font("Tahoma",Font.PLAIN,22));
        studentField.setFont(new Font("Tahoma",2,22));

        ///////////////////  returnBook /////////////////////////////////
        returnBookBtn.setFont(new Font("Tahoma",Font.PLAIN,22));

        /////////////////// backButton /////////////////////////////////
        backBtn.setFont(new Font("Tahoma",Font.PLAIN,22));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addContainerGap(150,Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(bookCallNo)
                        .addComponent(studentId)).addGap(60)
                .addGroup(layout.createParallelGroup()
                        .addComponent(returnBookLabel)
                        .addComponent(bookCallNoField,GroupLayout.PREFERRED_SIZE,450,GroupLayout.PREFERRED_SIZE)
                        .addComponent(studentField,GroupLayout.PREFERRED_SIZE,450,GroupLayout.PREFERRED_SIZE)
                        .addComponent(returnBookBtn,GroupLayout.PREFERRED_SIZE,200,GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtn,GroupLayout.PREFERRED_SIZE,200,GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250,Short.MAX_VALUE));

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addContainerGap(120,Short.MAX_VALUE)
                .addComponent(returnBookLabel)
                .addGap(30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(bookCallNo)
                        .addComponent(bookCallNoField,GroupLayout.PREFERRED_SIZE,26,GroupLayout.PREFERRED_SIZE))
                .addGap(30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(studentId)
                        .addComponent(studentField,GroupLayout.PREFERRED_SIZE,26,GroupLayout.PREFERRED_SIZE))
                .addGap(30)
                .addComponent(returnBookBtn,GroupLayout.PREFERRED_SIZE,50,GroupLayout.PREFERRED_SIZE)
                .addGap(30)
                .addComponent(backBtn,GroupLayout.PREFERRED_SIZE,50,GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250,Short.MAX_VALUE)
        );

        setSize(1150,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ReturnBooks_1().setVisible(true);
            }
        });
    }
}
