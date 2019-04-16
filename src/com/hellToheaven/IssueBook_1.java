package com.hellToheaven;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IssueBook_1 extends JFrame{
    public IssueBook_1(){
        setTitle("Issue Book");

        JLabel issueBookLabel = new JLabel("Issue Book");
        JLabel bookCallNoLabel = new JLabel("Book CallNo.");
        JLabel studentId = new JLabel("Student Id:");
        JLabel studentNameLabel = new JLabel("Student Name:");
        JLabel studentContactNoLabel = new JLabel("Student ContactNo:");
        JButton issueBookBtn = new JButton("Issue Book");
        JButton backBtn = new JButton("Back");
        JTextField bookCallNoField = new JTextField();
        JTextField studentIdField = new JTextField();
        JTextField studentNameField = new JTextField();
        JTextField studentContactNoField = new JTextField();

        issueBookBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookcallno = bookCallNoField.getText();
                int student_id = Integer.parseInt(studentIdField.getText());
                String studentName = studentNameField.getText();
                String studentContact = studentContactNoField.getText();

                int result = IssueBookDao_1.sava(bookcallno,student_id,studentName,studentContact);
                if(result>0){
                    JOptionPane.showMessageDialog(IssueBook_1.this,
                            "successfully issue","Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(IssueBook_1.this,
                            "failed to issue","Failed",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LibrarySection_1.main(new String[]{});
            }
        });
        //////////////// issueBookLabel /////////////////////////////////////
        issueBookLabel.setFont(new Font("Tahoma",Font.PLAIN,29));

        //////////////// bookCallNo /////////////////////////////////////
        bookCallNoLabel.setFont(new Font("Tahoma",Font.PLAIN,22));
        bookCallNoField.setFont(new Font("Tahoma",2,22));

        //////////////// studentId /////////////////////////////////////
        studentId.setFont(new Font("Tahoma",Font.PLAIN,22));
        studentIdField.setFont(new Font("Tahoma",2,22));

        //////////////// studentName /////////////////////////////////////
        studentNameLabel.setFont(new Font("Tahoma",Font.PLAIN,22));
        studentNameField.setFont(new Font("Tahoma",2,22));

        //////////////// contactNo /////////////////////////////////////////////
        studentContactNoLabel.setFont(new Font("Tahoma",Font.PLAIN,22));
        studentContactNoField.setFont(new Font("Tahoma",2,22));

        //////////////// issueBookBtn /////////////////////////////////////
        issueBookBtn.setFont(new Font("Tahoma",Font.PLAIN,22));

        //////////////// backBtn /////////////////////////////////////
        backBtn.setFont(new Font("Tahoma",Font.PLAIN,22));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createSequentialGroup().addContainerGap(150,Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(bookCallNoLabel)
        .addComponent(studentId)
        .addComponent(studentNameLabel)
        .addComponent(studentContactNoLabel).addGap(120))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(issueBookLabel)
        .addComponent(bookCallNoField,GroupLayout.PREFERRED_SIZE,450,GroupLayout.PREFERRED_SIZE)
        .addComponent(studentIdField,GroupLayout.PREFERRED_SIZE,450,GroupLayout.PREFERRED_SIZE)
        .addComponent(studentNameField,GroupLayout.PREFERRED_SIZE,450,GroupLayout.PREFERRED_SIZE)
        .addComponent(studentContactNoField,GroupLayout.PREFERRED_SIZE,450,GroupLayout.PREFERRED_SIZE)
        .addComponent(issueBookBtn,GroupLayout.PREFERRED_SIZE,150,GroupLayout.PREFERRED_SIZE)
        .addComponent(backBtn,GroupLayout.PREFERRED_SIZE,150,GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250,Short.MAX_VALUE));

        layout.setVerticalGroup(layout.createSequentialGroup().addGap(90)
                .addComponent(issueBookLabel)
                .addGap(50)
                .addContainerGap(100,Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(bookCallNoLabel)
        .addComponent(bookCallNoField,GroupLayout.PREFERRED_SIZE,26,GroupLayout.PREFERRED_SIZE))
                .addGap(30)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(studentId)
        .addComponent(studentIdField,GroupLayout.PREFERRED_SIZE,26,GroupLayout.PREFERRED_SIZE))
                .addGap(30)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(studentNameLabel)
        .addComponent(studentNameField,GroupLayout.PREFERRED_SIZE,26,GroupLayout.PREFERRED_SIZE))
                .addGap(30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(studentContactNoLabel)
        .addComponent(studentContactNoField,GroupLayout.PREFERRED_SIZE,26,GroupLayout.PREFERRED_SIZE))
                .addGap(30)
        .addComponent(issueBookBtn,GroupLayout.PREFERRED_SIZE,62,GroupLayout.PREFERRED_SIZE)
                .addGap(30)
        .addComponent(backBtn,GroupLayout.PREFERRED_SIZE,62,GroupLayout.PREFERRED_SIZE)
                .addGap(30)
        .addContainerGap(450,Short.MAX_VALUE));

        setSize(1150,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] main){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IssueBook_1().setVisible(true);
            }
        });
    }
}
