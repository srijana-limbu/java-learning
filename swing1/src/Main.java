import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Hello World");
        frame.setLayout(null);
        frame.setResizable(false);//disable resize
        frame.setSize(400,400);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);//toggle visibility

        JButton button = new JButton("Click");
        button.setBounds(150, 150, 100, 100);
        frame.add(button);
    }
}