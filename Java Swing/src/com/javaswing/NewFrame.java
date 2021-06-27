package com.javaswing;

import javax.swing.*;
import java.awt.*;

public class NewFrame  extends JFrame {
private Container container;
private JLabel label;
    public NewFrame() throws HeadlessException {
        this.setSize(600,400);
        initComponents();
    }

    private void initComponents() {
        container = new Container();
        container.setLayout(null);
        container = this.getContentPane();
        container.setBackground(Color.pink);

        label= new JLabel("Welcome to the new frame. ");
        label.setBounds(50,30,300,30);
        container.add(label);
    }

    public static void main(String[] args) {
        NewFrame frame = new NewFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }
}
