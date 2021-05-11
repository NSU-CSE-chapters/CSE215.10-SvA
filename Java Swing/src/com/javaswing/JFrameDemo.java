package com.javaswing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JFrameDemo extends JFrame {
    private  ImageIcon icon;
    private Container container;

    public JFrameDemo() {
        initComponents();



    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 400, 400, 300);
        setTitle("Software");
        icon = new ImageIcon(getClass().getResource("download.png"));
        setIconImage(icon.getImage());
        container = this.getContentPane();
        container.setBackground(Color.gray);
    }

    public static void main(String[] args) {

        JFrameDemo jFrame = new JFrameDemo();


        jFrame.setVisible(true);
//        jFrame.setSize(400,200);
//        jFrame.setLocation(100,200);
//        jFrame.setLocationRelativeTo(null);


    }
}
