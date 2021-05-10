package com.javaswing;

import javax.swing.*;
import java.net.URL;

public class MessageDialog {
    public static void main(String[] args) {
        URL url;
        ImageIcon icon = new ImageIcon("/media/f12r/Projects/CSE215.10-SvA/Java Swing/src/com/javaswing/picture.png");
//        JOptionPane.showMessageDialog(null,"Wrong ans","Warning",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"Wrong ans","Warning",JOptionPane.ERROR_MESSAGE, icon);

    }
}
