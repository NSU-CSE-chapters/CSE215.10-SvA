package com.javaswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTable extends JFrame {

    private Container container;
    private JLabel label, textNumber;
    private ImageIcon imageIcon;
    private Font font;
    private JTextField textField;
    private JButton button;
    private JTextArea textArea;
    private Cursor cursor;

    public MultiplicationTable() throws HeadlessException {
        initComponents();
    }

    private void initComponents() {
//        container  = new Container();

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.pink);

        imageIcon = new ImageIcon(getClass().getResource("multiplication.png"));
        font = new Font("arial", Font.BOLD, 16);

        label = new JLabel(imageIcon);
        label.setBounds(150, 10, imageIcon.getIconWidth(), imageIcon.getIconHeight());
        container.add(label);


        textNumber = new JLabel("Enter any Number : ");
        textNumber.setBounds(30, 300, 200, 40);
        textNumber.setFont(font);
        container.add(textNumber);


        textField = new JTextField();
        textField.setBounds(250, 300, 100, 35);
        textField.setFont(font);
        textField.setHorizontalAlignment(JTextField.CENTER);
        container.add(textField);


        button = new JButton("Clear");
        button.setBounds(250, 345, 100, 35);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        button.setCursor(cursor);
        container.add(button);

        textArea = new JTextArea();
        textArea.setBounds(30, 420, 350, 400);
        textArea.setFont(font);
        container.add(textArea);

        System.out.println(imageIcon.getIconWidth());
        System.out.println(imageIcon.getIconHeight());


        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String check = textField.getText();

                if (check.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You didn't put any number");
                } else {
                    textArea.setText("");
                    int number = Integer.parseInt(textField.getText());

                    for (int i = 1; i <= 10; i++) {
                        textArea.append(number + " x " + i + " = " + (number * i) + "\n");
                    }
                }


            }
        });
 

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText("");
            }
        });


    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();

        multiplicationTable.setVisible(true);
        multiplicationTable.setDefaultCloseOperation(EXIT_ON_CLOSE);
        multiplicationTable.setSize(500, 900);
        multiplicationTable.setLocationRelativeTo(null);
        multiplicationTable.setTitle("Multiplication Table");
    }
}
