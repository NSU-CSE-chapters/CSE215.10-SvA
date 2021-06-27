package com.javaswing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ReLearn extends JFrame {

    private ImageIcon icon;
    private Container container;

    public ReLearn() throws HeadlessException {
        initComponents();
    }

    private void initComponents() {
        container = this.getContentPane();
        container.setBackground(Color.BLUE);
        URL url;
        icon = new ImageIcon(getClass().getResource("download.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {

//        ImageIcon icon  = new ImageIcon();
//        JOptionPane.showMessageDialog(null,"wrong pass","error",JOptionPane.PLAIN_MESSAGE, icon);

//        String name = JOptionPane.showInputDialog("enter your name: ");
//        JOptionPane.showMessageDialog(null, name);
        ReLearn reLearn = new ReLearn();

        reLearn.setVisible(true);
        reLearn.setDefaultCloseOperation(EXIT_ON_CLOSE);

        reLearn.setSize(400, 300);
        reLearn.setLocationRelativeTo(null);


    }
}
