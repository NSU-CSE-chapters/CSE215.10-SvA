package com.javaswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private Container container;
    private JLabel label1, label2;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton button1, button2;
    private Font font;


    public LoginFrame() throws HeadlessException {
        initComponents();
    }

    private void initComponents() {
        container = new Container();
        container = this.getContentPane();
        container.setLayout(null);

        font = new Font("Arial", Font.BOLD, 14);

        this.setSize(600, 400);
        this.setLocationRelativeTo(null);


        label1 = new JLabel("Username: ");
        label1.setBounds(20, 30, 100, 30);
        label1.setFont(font);
        container.add(label1);


        textField = new JTextField();
        textField.setBounds(130, 30, 150, 30);
        container.add(textField);

        label2 = new JLabel("Password: ");
        label2.setBounds(20, 70, 100, 30);
        label2.setFont(font);

        container.add(label2);

        passwordField = new JPasswordField();
        passwordField.setBounds(130, 70, 150, 30);
        passwordField.setEchoChar('*');
        container.add(passwordField);


        button1 = new JButton("Login");
        button1.setBounds(30, 120, 80, 30);
        button1.setFont(font);
        container.add(button1);


        button2 = new JButton("Clear");
        button2.setBounds(140, 120, 80, 30);
        button2.setFont(font);
        container.add(button2);


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText("");
                passwordField.setText("");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (((textField.getText()).equals("admin")) && (passwordField.getText().equals("admin"))) {
                    JOptionPane.showMessageDialog(null, "Login succesfully");
//                    dispose();
                    NewFrame frame = new NewFrame();
                    frame.setVisible(true);
                } else JOptionPane.showMessageDialog(null, "Your enterd wrong pass or user");
            }
        });


    }

    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
