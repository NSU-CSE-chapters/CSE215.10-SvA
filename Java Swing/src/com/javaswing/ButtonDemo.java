package com.javaswing;

import javax.swing.*;
import java.awt.*;

public class ButtonDemo extends JFrame {
    private Container container;
    private JButton button1,button2;
    private Cursor cursor;

    public ButtonDemo() throws HeadlessException {
        initComponents();
    }

    private void initComponents() {
        container= new Container();
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.gray);

        cursor  = new Cursor(Cursor.HAND_CURSOR);

        button1  = new JButton("submit");
        button1.setBackground(Color.white);
        button1.setBounds(50,50,200,50);
        button1.setBackground(Color.pink);
        button1.setForeground(Color.cyan);

        container.add(button1);

        button2  = new JButton("clear");
        button2.setBackground(Color.white);
        button2.setBounds(260,50,200,50);
        button2.setCursor(cursor);

        container.add(button2);
    }

    public static void main(String[] args) {
        ButtonDemo buttonDemo = new ButtonDemo();
        buttonDemo.setVisible(true);
        buttonDemo.setDefaultCloseOperation(EXIT_ON_CLOSE);
        buttonDemo.setBounds(500,300,500,400);
        buttonDemo.setTitle("Button Field");
    }
}
