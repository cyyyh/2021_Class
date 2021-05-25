package cc.snowing;

import javax.swing.*;
import java.awt.*;

public class MainWin {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setLocation(1000, 300);
        JButton button = new JButton("Hello");
        frame.add(button, BorderLayout.NORTH);
        frame.setVisible(true);

    }
}
