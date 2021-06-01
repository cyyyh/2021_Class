package cc.car;

import javax.swing.*;

public class CarDemo {
    private JPanel mainPanel;
    private JTextField textField1;
    private JPanel northPanel;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().mainPanel);
        frame.setSize(500, 450);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
