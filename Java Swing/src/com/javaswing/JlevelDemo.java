package com.javaswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class JlevelDemo extends JFrame {
    private Container container;
    private JLabel jLabel;
    private ImageIcon icon;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton jButton;
    private Cursor cursor;
    private JTextArea textArea;
    private JScrollPane scrollPane;


    public JlevelDemo() throws HeadlessException {


        initComponents();
    }

    private void initComponents() {
        container = new Container();
        container = this.getContentPane();
        container.setLayout(null);
//        container.setBackground(Color.BLUE);


        setSize(600, 400);
        setLocationRelativeTo(null);
        setTitle("level demo");

        jLabel = new JLabel("Enter your name: ");
        jLabel.setBounds(50, 20, 100, 30);
        jLabel.setForeground(Color.BLUE);
        jLabel.setBackground(Color.black);
        jLabel.setOpaque(true);
        container.add(jLabel);

        textField = new JTextField();
        textField.setBounds(50, 60, 80, 20);

        container.add(textField);


        passwordField = new JPasswordField();
        passwordField.setBounds(50, 90, 100, 20);
//        passwordField.setBackground(Color.black);
        passwordField.setEchoChar('*');
        container.add(passwordField);

        icon = new ImageIcon(getClass().getResource("picture.png"));
        cursor = new Cursor(Cursor.HAND_CURSOR);
        jButton = new JButton("Clear");
        jButton.setBounds(50, 120, 200, 30);
//        jButton.setText("Click here");
        jButton.setCursor(cursor);
//        jButton.setName("hello");

        container.add(jButton);


        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(50, 160, 100, 100);
        container.add(scrollPane);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText("");
                passwordField.setText("");
            }
        });


        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = textField.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "please enter some text");
                } else
                    JOptionPane.showMessageDialog(null, "text typed = " + s);

            }
        });

//        URL url;
//        icon  = new ImageIcon(getClass().getResource("picture.png"));
//        jLabel  = new JLabel(icon);
//
//        jLabel.setBounds(20,10,icon.getIconWidth(),icon.getIconHeight());
//        container.add(jLabel);


    }

    public static void main(String[] args) {
        JlevelDemo jlevelDemo = new JlevelDemo();
        jlevelDemo.setVisible(true);
        jlevelDemo.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
