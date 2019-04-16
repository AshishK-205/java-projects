package com.hellToheaven;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryManagementAshish_1 extends JFrame {
    //static LibraryManagementAshish_1 frame;
    public LibraryManagementAshish_1(){
        setTitle("Library Management");
        JPanel panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(panel1);

        JButton adminButton = new JButton("Admin Login");
        adminButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                AdminLoginForm_1.main(new String[]{});
                //frame.dispose();
            }
        });
        JButton librarianButton = new JButton("Librarian Login");
        librarianButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                LibrarianLoginForm_1.main(new String[]{});
            }
        });


        //////////////////////// admin Button /////////////////////
        adminButton.setFont(new Font("Tahoma",3,25));

        //////////////////////// librarian Button /////////////////////
        librarianButton.setFont(new Font("Tahoma",3,25));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createSequentialGroup().addGap(450)
                .addGroup(layout.createParallelGroup()
                        .addComponent(adminButton,GroupLayout.PREFERRED_SIZE,112,GroupLayout.PREFERRED_SIZE)
                        .addGap(60)
                        .addComponent(librarianButton)).addContainerGap(350,Short.MAX_VALUE));

        layout.linkSize(SwingConstants.HORIZONTAL,adminButton,librarianButton);

        layout.setVerticalGroup(layout.createSequentialGroup().addGap(250)
                .addComponent(adminButton).addGap(40).addComponent(librarianButton).addContainerGap(150,Short.MAX_VALUE));

        setSize(1150,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LibraryManagementAshish_1().setVisible(true);
            }
        });
    }
}
