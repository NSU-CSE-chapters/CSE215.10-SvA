package com.javaswing;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo extends JFrame {
    private  ImageIcon icon;
    private Container container;
    private JLabel label, imgLabel;
    private Font font;

    public JLabelDemo() {
        initComponents();

    }

    private void initComponents() {
        setBounds(500,300, 400,300);
        setTitle("Label Demo");
        font = new Font("Arial",Font.ITALIC,14);

        container = new Container();
        container= this.getContentPane();
        container.setBackground(Color.gray);
        container.setLayout(null);
        label = new JLabel();
        label.setText("Enter your name: ");
        label.setFont(font);
        label.setForeground(Color.BLUE);
        label.setBounds(50,15,200,30);
        label.setBackground(Color.yellow);
        container.add(label);

        icon  = new ImageIcon(getClass().getResource("download.png"));
        label = new JLabel(icon);
        label.setBounds(100,50,80,80);
        container.add(label);



    }

    public static void main(String[] args) {

        JLabelDemo labelDemo = new JLabelDemo();

        labelDemo.setVisible(true);
        labelDemo.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
