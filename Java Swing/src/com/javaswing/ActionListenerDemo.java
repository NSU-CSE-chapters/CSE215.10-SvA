package com.javaswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo extends JFrame {
    private Container container;
    private TextField textField;

    public ActionListenerDemo() throws HeadlessException {
        initComponents();

    }

    private void initComponents() {

        setBounds(500, 300, 500, 300);
        setTitle("Action Listener Demo");
        container = new Container();
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.DARK_GRAY);

        textField = new TextField();
        textField.setBounds(50, 50, 200, 20);
        container.add(textField);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = textField.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "no text typed");
                } else
                    JOptionPane.showMessageDialog(null, "Text = " + s, "typed", 1);
            }
        });

    }

    public static void main(String[] args) {
        ActionListenerDemo actionListenerDemo = new ActionListenerDemo();
        actionListenerDemo.setVisible(true);
        actionListenerDemo.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
