package com.javaswing;

import javax.swing.*;
import java.awt.*;


public class PasswordFieldDemo extends JFrame {
    private Container container;
    private JPasswordField passwordField;
    private Font font;

    public PasswordFieldDemo() throws HeadlessException {
        initComponents();
    }

    private void initComponents() {
        setBounds(500, 300, 500, 300);
        setTitle("Action Listener Demo");
        setTitle("Password Field");
        container = new Container();
        container  = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.gray);

        font = new Font("Arial",1,22);

        passwordField = new JPasswordField();
        passwordField.setBounds(50,50,200,40);
        passwordField.setBackground(Color.white);
        passwordField.setFont(font);
        passwordField.setForeground(Color.cyan);
//        passwordField.setEchoChar('.');
        container.add(passwordField);
    }

    public static void main(String[] args) {
        PasswordFieldDemo passwordFieldDemo =new PasswordFieldDemo();
        passwordFieldDemo.setVisible(true);
        passwordFieldDemo.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
