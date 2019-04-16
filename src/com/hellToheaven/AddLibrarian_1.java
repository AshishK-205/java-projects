package com.hellToheaven;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class AddLibrarian_1 extends JFrame {
    public AddLibrarian_1(){
        // JFrame frame = new JFrame();
        setTitle("AddLibrarian_1");
        JLabel addLibrarianLabel = new JLabel("Add Librarian");
        JLabel name = new JLabel("Name:");
        JLabel passWord = new JLabel("Password:");
        JLabel email = new JLabel("Email:");
        JLabel address = new JLabel("Address:");
        JLabel city = new JLabel("City:");
        JLabel contactNo = new JLabel("Contact No.:");
        JTextField nameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');
        JTextField emailField = new JTextField();
        JTextField addressField = new JTextField();
        JTextField cityField = new JTextField();
        JTextField contactField = new JTextField();
        JButton addLibrarian = new JButton("Add Librarian");
        nameField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                nameField.requestFocus();
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });

        addLibrarian.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String password = String.valueOf(passwordField.getText());
                String email = emailField.getText();
                String address = addressField.getText();
                String city = cityField.getText();
                String contactNo = contactField.getText();

                if (name.equals("") || password.equals("") || email.equals("") || address.equals("") || city.equals("") || contactNo.equals("")) {
                    JOptionPane.showMessageDialog(AddLibrarian_1.this,
                            "please fill all the information correctly",
                            "Information", JOptionPane.WARNING_MESSAGE);
                } else {
                    int result = LibrarianDao_1.save(name, password, email, address, city, contactNo);

                    if (result > 0) {
                        JOptionPane.showMessageDialog(AddLibrarian_1.this,
                                "Librarian Added Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                    } else {

                        JOptionPane.showMessageDialog(AddLibrarian_1.this,
                                "please fill all information correctly", "Information"
                                , JOptionPane.INFORMATION_MESSAGE);
                        nameField.setText("");
                        passwordField.setText("");
                        emailField.setText("");
                        addressField.setText("");
                        cityField.setText("");
                        contactField.setText("");
                    }
                }
            }

        });
        JButton beck = new JButton("Back");
        beck.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                AdminSection_1.main(new String[]{});
            }
        });
        ///////////// librarian label //////////////////////////
        addLibrarianLabel.setFont(new Font("Tahoma",3,22));
        addLibrarianLabel.setForeground(Color.RED);

        /////////name label and name field //////////////////////////
        name.setFont(new Font("Tahoma",3,22));
        nameField.setFont(new Font("Tahoma",2,22));

        /////////password label and password field//////////////////////////
        passWord.setFont(new Font("Tahoma",3,22));
        passwordField.setFont(new Font("Tahoma",2,22));

        /////////email label and email field //////////////////////////
        email.setFont(new Font("Tahoma",3,22));
        emailField.setFont(new Font("Tahoma",2,22));

        /////////address label and address field //////////////////////////
        address.setFont(new Font("Tahoma",3,22));
        addressField.setFont(new Font("Tahoma",2,22));

        /////////city label and city field //////////////////////////
        city.setFont(new Font("Tahoma",3,22));
        cityField.setFont(new Font("Tahoma",2,22));

        /////////contactNo label and contactNo field //////////////////////////
        contactNo.setFont(new Font("Tahoma",3,22));
        contactField.setFont(new Font("Tahoma",2,22));

        /////////add librarian  and back button //////////////////////////
        addLibrarian.setFont(new Font("Tahoma",3,22));
        beck.setFont(new Font("Tahoma",3,22));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        //layout.setAutoCreateContainerGaps(true);
        //layout.setAutoCreateGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup().addContainerGap(150,Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(name).addComponent(passWord)
                        .addComponent(email)
                        .addComponent(address)
                        .addComponent(city)
                        .addComponent(contactNo).addGap(155))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(addLibrarianLabel)
                        .addComponent(nameField).addComponent(passwordField)
                        .addComponent(emailField).addComponent(addressField)
                        .addComponent(cityField).addComponent(contactField)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(addLibrarian)
                                .addGap(100)
                                .addComponent(beck)))
                .addContainerGap(150,Short.MAX_VALUE)
        );

        layout.linkSize(SwingConstants.HORIZONTAL,addLibrarian,beck);

        layout.setVerticalGroup(layout.createSequentialGroup().addGap(40).addComponent(addLibrarianLabel
                ,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE,Short.MAX_VALUE).addGroup(
                layout.createSequentialGroup().addContainerGap(150,Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(name).addComponent(nameField).addGap(50)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(passWord)
                                .addComponent(passwordField,GroupLayout.DEFAULT_SIZE
                                        ,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE).addGap(50))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(email).addComponent(emailField,GroupLayout.PREFERRED_SIZE
                                        ,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE).addGap(50))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(address).addComponent(addressField,GroupLayout.PREFERRED_SIZE
                                        ,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE).addGap(50))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(city).addComponent(cityField,GroupLayout.PREFERRED_SIZE
                                        ,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE).addGap(50))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(contactNo).addComponent(contactField,GroupLayout.PREFERRED_SIZE
                                        ,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE).addGap(50))
        /*.addComponent(addLibrarian).addComponent(beck)*/
                        .addGroup(layout.createParallelGroup()
                                .addComponent(addLibrarian,GroupLayout.PREFERRED_SIZE,45,GroupLayout.PREFERRED_SIZE)
                                .addComponent(beck,GroupLayout.PREFERRED_SIZE,45,GroupLayout.PREFERRED_SIZE)
                                .addGap(50))
                        .addContainerGap(300,Short.MAX_VALUE)
        );

        setSize(1150,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddLibrarian_1().setVisible(true);
            }
        });
    }
}

