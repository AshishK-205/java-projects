package com.hellToheaven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBooks_1 extends JFrame{
    public AddBooks_1(){
        setTitle("Add Books");

        JLabel addBooksLabel = new JLabel("Add Books");
        JButton addBooksBtn  = new JButton("Add Book");
        JButton backBtn = new JButton("Back");
        JLabel callNo = new JLabel("CallNo:");
        JLabel name = new JLabel("Name:");
        JLabel author = new JLabel("Author:");
        JLabel publisher = new JLabel("Publisher:");
        JLabel quantity = new JLabel("Quantity:");
        JLabel issuedLabel = new JLabel("Issued:");
        JTextField callNoField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField publisherField = new JTextField();
        JTextField quantityField = new JTextField();
        JTextField issuedFiled = new JTextField();
        addBooksBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String callno = callNoField.getText();
                String name = nameField.getText();
                String author = authorField.getText();
                String publisher = publisherField.getText();
                int quantity = Integer.parseInt(quantityField.getText());
                int issued = Integer.parseInt(issuedFiled.getText());

                int result = AddBooksDao_1.save(callno,name,author,publisher,quantity,issued);

                if(result>0){
                    JOptionPane.showMessageDialog(AddBooks_1.this,
                            "book added successfully","Add Book",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(AddBooks_1.this,
                            "unable to add","Information",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        backBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                LibrarySection_1.main(new String[]{});
            }
        });

        ////////////////////// addBooks///////////////////////////////////
        addBooksLabel.setFont(new Font("Tahoma", Font.PLAIN,28));

        ////////////////////// callNoLabel ////////////////////////
        callNo.setFont(new Font("Tahoma",Font.PLAIN,22));
        callNoField.setFont(new Font("Tahoma",2,22));

        ////////////////////// name ///////////////////////////////////
        name.setFont(new Font("Tahoma",Font.PLAIN,22));
        nameField.setFont(new Font("Tahoma",2,22));

        ////////////////////// author ///////////////////////////////////
        author.setFont(new Font("Tahoma",Font.PLAIN,22));
        authorField.setFont(new Font("Tahoma",2,22));

        ////////////////////// publisher ///////////////////////////////////
        publisher.setFont(new Font("Tahoma",Font.PLAIN,22));
        publisherField.setFont(new Font("Tahoma",2,22));

        //////////////////////  quantity ///////////////////////////////////
        quantity.setFont(new Font("Tahoma",Font.PLAIN,22));
        quantityField.setFont(new Font("Tahoma",2,22));

        //////////////////////  issued ///////////////////////////////////
        issuedLabel.setFont(new Font("Tahoma",Font.PLAIN,22));
        issuedFiled.setFont(new Font("Tahoma",2,22));

        //////////////////////  addBookBtn ///////////////////////////////////
        addBooksBtn.setFont(new Font("Tahoma",Font.PLAIN,22));

        //////////////////////  backBtn ///////////////////////////////////
        backBtn.setFont(new Font("Tahoma",Font.PLAIN,22));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createSequentialGroup().addContainerGap(150,Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup()
                        .addComponent(callNo,GroupLayout.PREFERRED_SIZE,70,GroupLayout.PREFERRED_SIZE)
                        .addComponent(name,GroupLayout.PREFERRED_SIZE,70,GroupLayout.PREFERRED_SIZE)
                        .addComponent(author,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
                        .addComponent(publisher,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantity)
                        .addComponent(issuedLabel).addGap(150)
                ).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(addBooksLabel)
                        .addComponent(callNoField,GroupLayout.PREFERRED_SIZE,450,GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameField,GroupLayout.PREFERRED_SIZE,450,GroupLayout.PREFERRED_SIZE)
                        .addComponent(authorField,GroupLayout.PREFERRED_SIZE,450,GroupLayout.PREFERRED_SIZE)
                        .addComponent(publisherField,GroupLayout.PREFERRED_SIZE,450,GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantityField,GroupLayout.PREFERRED_SIZE,450,GroupLayout.PREFERRED_SIZE)
                        .addComponent(issuedFiled,GroupLayout.PREFERRED_SIZE,450,GroupLayout.PREFERRED_SIZE)
                        .addComponent(addBooksBtn,GroupLayout.PREFERRED_SIZE,150,GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtn,GroupLayout.PREFERRED_SIZE,150,GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250,Short.MAX_VALUE));

        layout.setVerticalGroup(layout.createSequentialGroup().addContainerGap(150,Short.MAX_VALUE)
                .addComponent(addBooksLabel).addGap(40)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(callNo,GroupLayout.PREFERRED_SIZE,20,GroupLayout.PREFERRED_SIZE)
                        .addComponent(callNoField,GroupLayout.PREFERRED_SIZE,26,GroupLayout.PREFERRED_SIZE))
                .addGap(40)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(name,GroupLayout.PREFERRED_SIZE,20,GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameField,GroupLayout.PREFERRED_SIZE,26,GroupLayout.PREFERRED_SIZE)).addGap(40)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(author,GroupLayout.PREFERRED_SIZE,20,GroupLayout.PREFERRED_SIZE)
                        .addComponent(authorField,GroupLayout.PREFERRED_SIZE,26,GroupLayout.PREFERRED_SIZE)).addGap(40)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(publisher,GroupLayout.PREFERRED_SIZE,20,GroupLayout.PREFERRED_SIZE)
                        .addComponent(publisherField,GroupLayout.PREFERRED_SIZE,26,GroupLayout.PREFERRED_SIZE)).addGap(40)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(quantity,GroupLayout.PREFERRED_SIZE,25,GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantityField,GroupLayout.PREFERRED_SIZE,26,GroupLayout.PREFERRED_SIZE)).addGap(40)
                .addGroup(layout.createParallelGroup()
                .addComponent(issuedLabel,GroupLayout.PREFERRED_SIZE,25,GroupLayout.PREFERRED_SIZE)
                .addComponent(issuedFiled,GroupLayout.PREFERRED_SIZE,26,GroupLayout.PREFERRED_SIZE)).addGap(40)
                .addComponent(addBooksBtn,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
                .addGap(40)
                .addComponent(backBtn,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300,Short.MAX_VALUE));

        setSize(1150,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddBooks_1().setVisible(true);
            }
        });
    }
}