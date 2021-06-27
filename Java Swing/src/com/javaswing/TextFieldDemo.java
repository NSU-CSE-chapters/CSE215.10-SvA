package com.javaswing;

import javax.swing.*;
import java.awt.*;

public class TextFieldDemo extends JFrame {
    private Container container;
    private TextField textField1, textField2;

    public TextFieldDemo() throws HeadlessException {
        initComponents();
    }

    private void initComponents() {

        setBounds(500, 300, 500, 300);
        setTitle("Text Field Demo");
        container = new Container();
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.DARK_GRAY);

        textField1 = new TextField();
        textField1.setBounds(50, 50, 200, 30);
//        textField1.setBackground(Color.black);
//        textField1.setForeground(Color.white);
        container.add(textField1);

        textField2 = new TextField();
        textField2.setBounds(50, 90, 200, 30);
        container.add(textField2);
    }

    public static void main(String[] args) {
        TextFieldDemo textFieldDemo = new TextFieldDemo();
        textFieldDemo.setVisible(true);
        textFieldDemo.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
