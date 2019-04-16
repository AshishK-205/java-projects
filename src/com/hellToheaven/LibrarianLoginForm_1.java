package com.hellToheaven;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibrarianLoginForm_1 extends JFrame{
    public LibrarianLoginForm_1(){
        setTitle("Librarian Login Form");

        JLabel LibrarianLoginForm = new JLabel("Librarian Login Form");
        JLabel enterName = new JLabel("Enter Name:");
        JLabel enterPassword = new JLabel("Enter Password:");
        JTextField nameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');
        JButton login = new JButton("Login");
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String name = nameField.getText();
                String password = String.valueOf(passwordField.getText());
                if(LibrarianDao_1.validate(name,password)){
                       LibrarySection_1.main(new String[]{});
                }
                else{
                    JOptionPane.showMessageDialog(LibrarianLoginForm_1.this,
                            "Sorry! username and password are incorrect","Login Error",
                            JOptionPane.ERROR_MESSAGE);
                    nameField.setText("");
                    passwordField.setText("");
                }
            }
        });

        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                LibraryManagementAshish_1.main(new String[]{});
            }
        });

        /////////////// admin login form label //////////////////////
        LibrarianLoginForm.setFont(new Font("Tahoma",3,22));
        LibrarianLoginForm.setForeground(Color.RED);

        /////////////// enterName label and field //////////////////////
        enterName.setFont(new Font("Tahoma",3,22));
        nameField.setFont(new Font("Tahoma",2,22));

        /////////////// passworssName label and field //////////////////////
        enterPassword.setFont(new Font("Tahoma",3,22));
        passwordField.setFont(new Font("Tahoma",2,22));

        /////////////// login button //////////////////////
        login.setFont(new Font("Tahoma",3,22));

        /////////////// back button //////////////////////
        back.setFont(new Font("Tahoma",3,22));


        GroupLayout layout2 = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout2);

        layout2.setHorizontalGroup(layout2.createSequentialGroup().addGap(350)
                .addGroup(layout2.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(enterName)
                        .addComponent(enterPassword).addGap(150))
                .addGroup(layout2.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(LibrarianLoginForm)
                        .addComponent(nameField,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                        .addComponent(passwordField,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                        .addGroup(layout2.createSequentialGroup()
                        .addComponent(login).addGap(55)
                        .addComponent(back))).addContainerGap(350,Short.MAX_VALUE)
        );
        //.addComponent(login)).addContainerGap(350,Short.MAX_VALUE)

        layout2.setVerticalGroup(layout2.createSequentialGroup().addGap(100)
                .addComponent(LibrarianLoginForm).addGap(40)
                .addContainerGap(150,Short.MAX_VALUE)
                .addGroup(layout2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(enterName)
                        .addComponent(nameField,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE))
                .addGap(40)
                .addGroup(layout2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(enterPassword)
                        .addComponent(passwordField,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE))
                .addGap(40)
               .addGroup(layout2.createParallelGroup()
               .addComponent(login)
               .addComponent(back))
                .addContainerGap(550,Short.MAX_VALUE));


        setSize(1150,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LibrarianLoginForm_1().setVisible(true);
            }
        });
    }
}

