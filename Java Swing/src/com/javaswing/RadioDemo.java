package com.javaswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioDemo extends JFrame {
    private Container container;
    private JRadioButton male, female;
    private ButtonGroup group, group1;
    private JCheckBox checkBox1, checkBox2;
    private  JLabel label;
    public RadioDemo() throws HeadlessException {
        initComponents();
    }

    private void initComponents() {
        container = new Container();
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.pink);

        group = new ButtonGroup();

        male = new JRadioButton("Male");
        male.setBounds(20, 30, 100, 30);
        male.setBackground(Color.pink);
        container.add(male);

        female = new JRadioButton("Female");
        female.setBounds(130, 30, 100, 30);
        female.setBackground(Color.pink);
        female.setSelected(true);
        container.add(female);

        group.add(female);
        group.add(male);

        group1 = new ButtonGroup();


        checkBox1 = new JCheckBox("Male");
        checkBox1.setBounds(20, 80, 100, 30);
        checkBox1.setBackground(Color.pink);
        container.add(checkBox1);

        checkBox2 = new JCheckBox("Female");
        checkBox2.setBounds(130, 80, 100, 30);
        checkBox2.setSelected(true);
        checkBox2.setBackground(Color.pink);
        container.add(checkBox2);


        group1.add(checkBox1);
        group1.add(checkBox2);

        label = new JLabel("you haven't selected anything yet.");
        label.setBounds(30,140,300,30);
        container.add(label);






        male.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "male selected");
            }
        });

        female.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "female selected");
            }
        });


    }

    public static void main(String[] args) {


        RadioDemo radioDemo = new RadioDemo();
        radioDemo.setVisible(true);
        radioDemo.setDefaultCloseOperation(EXIT_ON_CLOSE);
        radioDemo.setSize(600, 400);
        radioDemo.setLocationRelativeTo(null);

    }
}




