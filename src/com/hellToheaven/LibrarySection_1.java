package com.hellToheaven;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibrarySection_1 extends JFrame {

    public LibrarySection_1(){
        setTitle("Library Section");

        JLabel librarySection = new JLabel("Library Section-Ashish");
        JButton add_Books = new JButton("Add Books");
        add_Books.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddBooks_1.main(new String[]{});
            }
        });
        JButton view_books = new JButton("View Books");
        JButton issue_Books= new JButton("Issue Books");
        JButton viewIssuedBooks = new JButton("View Issued Books");
        JButton return_books = new JButton("Return Books");
        JButton logout = new JButton("Logout");
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LibraryManagementAshish_1.main(new String[]{});
            }
        });

        return_books.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReturnBooks_1.main(new String[]{});
            }
        });

        viewIssuedBooks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewIssuedBooks_1.main(new String[]{});
            }
        });

        view_books.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ViewBooks_1.main(new String[]{});
            }
        });

        issue_Books.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IssueBook_1.main(new String[]{});
            }
        });

        ///////////////// library Section ////////////////////////////////
        librarySection.setFont(new Font("Tahoma",Font.PLAIN,25));

        ///////////////// add_Books ////////////////////////////////
        add_Books.setFont(new Font("Tahoma",Font.PLAIN,18));

        ///////////////// view Books ////////////////////////////////
        view_books.setFont(new Font("Tahoma",Font.PLAIN,18));

        ///////////////// issue Books ////////////////////////////////
        issue_Books.setFont(new Font("Tahoma",Font.PLAIN,18));

        ///////////////// viewIssuedBooks ////////////////////////////////
        viewIssuedBooks.setFont(new Font("Tahoma",Font.PLAIN,18));

        ///////////////// return Books ////////////////////////////////
        return_books.setFont(new Font("Tahoma",Font.PLAIN,18));

        ///////////////// logout ////////////////////////////////
        logout.setFont(new Font("Tahoma",Font.PLAIN,18));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        // layout.setAutoCreateGaps(true);
        //layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup().addContainerGap(150,Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup()
                        .addComponent(librarySection,GroupLayout.PREFERRED_SIZE,250,GroupLayout.PREFERRED_SIZE)
                        .addComponent(add_Books,GroupLayout.PREFERRED_SIZE,250,GroupLayout.PREFERRED_SIZE)
                        .addComponent(view_books,GroupLayout.PREFERRED_SIZE,250,GroupLayout.PREFERRED_SIZE)
                        .addComponent(issue_Books,GroupLayout.PREFERRED_SIZE,250,GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewIssuedBooks,GroupLayout.PREFERRED_SIZE,250,GroupLayout.PREFERRED_SIZE)
                        .addComponent(return_books,GroupLayout.PREFERRED_SIZE,250,GroupLayout.PREFERRED_SIZE)
                        .addComponent(logout)).addContainerGap(250,Short.MAX_VALUE));

        layout.linkSize(SwingConstants.HORIZONTAL,add_Books,view_books,issue_Books,viewIssuedBooks,return_books,logout);

        layout.setVerticalGroup(layout.createSequentialGroup().addContainerGap(100,Short.MAX_VALUE)
                .addComponent(librarySection,GroupLayout.PREFERRED_SIZE,50,GroupLayout.PREFERRED_SIZE)
                .addGap(50)
                .addComponent(add_Books,GroupLayout.PREFERRED_SIZE,50,GroupLayout.PREFERRED_SIZE)
                .addGap(40)
                .addComponent(view_books,GroupLayout.PREFERRED_SIZE,50,GroupLayout.PREFERRED_SIZE)
                .addGap(40)
                .addComponent(issue_Books,GroupLayout.PREFERRED_SIZE,50,GroupLayout.PREFERRED_SIZE)
                .addGap(40)
                .addComponent(viewIssuedBooks,GroupLayout.PREFERRED_SIZE,50,GroupLayout.PREFERRED_SIZE)
                .addGap(40)
                .addComponent(return_books,GroupLayout.PREFERRED_SIZE,50,GroupLayout.PREFERRED_SIZE)
                .addGap(40)
                .addComponent(logout,GroupLayout.PREFERRED_SIZE,50,GroupLayout.PREFERRED_SIZE)
                .addGap(40)
                .addContainerGap(200,Short.MAX_VALUE));

        setSize(1150,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LibrarySection_1().setVisible(true);
            }
        });
    }
}

