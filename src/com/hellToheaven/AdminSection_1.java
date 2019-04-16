package com.hellToheaven;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.acl.Group;

public class AdminSection_1 extends JFrame {
    public AdminSection_1(){
        setTitle("Admin Section");

        JLabel adminSection = new JLabel("Admin Section");
        JButton addLibrarian = new JButton("Add Librarian");
        addLibrarian.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                AddLibrarian_1.main(new String[]{});
            }
        });
        JButton deleteLibrarian = new JButton("Delete Librarian");
        deleteLibrarian.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               DeleteLibrarian_1.main(new String[]{});
            }
        });
        JButton viewLibrarian = new JButton("View Librarian");
        viewLibrarian.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                ViewLibrarian_1.main(new String[]{});
            }
        });
        JButton logoutBtn = new JButton("Logout");
        logoutBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                LibraryManagementAshish_1.main(new String[]{});
            }
        });

        ///////////////// admin Section ////////////////////////////////
        adminSection.setFont(new Font("Tahoma",Font.PLAIN,25));

        ///////////////// addLibrarian ////////////////////////////////
        addLibrarian.setFont(new Font("Tahoma",Font.PLAIN,18));

        ///////////////// deleteLibrarian ////////////////////////////////
        deleteLibrarian.setFont(new Font("Tahoma",Font.PLAIN,18));

        ///////////////// viewLibrarian ////////////////////////////////
        viewLibrarian.setFont(new Font("Tahoma",Font.PLAIN,18));

        ///////////////// logoutBtn ////////////////////////////////
        logoutBtn.setFont(new Font("Tahoma",Font.PLAIN,18));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        // layout.setAutoCreateGaps(true);
        //layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup().addContainerGap(150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(adminSection,GroupLayout.PREFERRED_SIZE,190,GroupLayout.PREFERRED_SIZE)
                        .addComponent(addLibrarian,GroupLayout.PREFERRED_SIZE,170,GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteLibrarian,GroupLayout.PREFERRED_SIZE,170,GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewLibrarian,GroupLayout.PREFERRED_SIZE,170,GroupLayout.PREFERRED_SIZE)
                        .addComponent(logoutBtn,GroupLayout.PREFERRED_SIZE,170,GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200,Short.MAX_VALUE));

        layout.linkSize(SwingConstants.HORIZONTAL,addLibrarian,deleteLibrarian,viewLibrarian,logoutBtn);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addComponent(adminSection,GroupLayout.PREFERRED_SIZE,60,GroupLayout.PREFERRED_SIZE)
                .addGap(50)
                .addComponent(addLibrarian,GroupLayout.PREFERRED_SIZE,60,GroupLayout.PREFERRED_SIZE)
                .addGap(50)
                .addComponent(deleteLibrarian,GroupLayout.PREFERRED_SIZE,60,GroupLayout.PREFERRED_SIZE)
                .addGap(50)
                .addComponent(viewLibrarian,GroupLayout.PREFERRED_SIZE,60,GroupLayout.PREFERRED_SIZE)
                .addGap(50)
                .addComponent(logoutBtn,GroupLayout.PREFERRED_SIZE,60,GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30,Short.MAX_VALUE));

        setSize(1150,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminSection_1().setVisible(true);
            }
        });
    }
}
