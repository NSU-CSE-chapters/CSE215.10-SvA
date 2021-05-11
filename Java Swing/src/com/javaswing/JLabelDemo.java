package com.javaswing;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo extends JFrame {
    private  ImageIcon icon;
    private Container container;
    private Label label;

    public JLabelDemo() {
        initComponents();

    }

    private void initComponents() {
        setBounds(500,300, 400,300);
        setTitle("Label Demo");

        container = new Container();
        container= this.getContentPane();
        container.setBackground(Color.gray);
        container.setLayout(null);
        label = new Label();
        label.setText("Enter your name: ");
        label.setBounds(50,15,200,30);
        container.add(label);
    }

    public static void main(String[] args) {

        JLabelDemo labelDemo = new JLabelDemo();

        labelDemo.setVisible(true);
        labelDemo.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
