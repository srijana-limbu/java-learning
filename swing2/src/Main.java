import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello");


        JTextField textField1 = new JTextField( "enter name");
        textField1.setBounds(100, 100, 150, 30) ;
        frame.add(textField1);

        JTextField password = new JTextField("enter password");
        password.setBounds(100, 150, 150, 30) ;
        frame.add(password);

        String[] fruits = {"apple", "grape", "orange"};
        JComboBox comboBox = new JComboBox(fruits);
        comboBox.setBounds(100, 350,150,30);
        frame.add(comboBox);

        JButton button = new JButton("Click me!");
        button.setBounds(150,250,100,50);
        frame.add(button);



        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}