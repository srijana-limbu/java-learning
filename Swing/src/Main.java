import javax.swing.*;
import java.awt.*;
//.* =all

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("title");
        JTextField textField = new JTextField();
        JTextField textField1 = new JTextField(" enter name");
        textField.setBounds(50, 50, 50, 30) ;
        frame.add(textField);


        JButton button = new JButton("click me");
        button.setBounds(100, 100, 100,50);
        frame.add(button);
        button.setBackground(Color.YELLOW);
        frame.getContentPane().setBackground(Color.PINK);// change color of frame

        frame.setSize( 400,  500);
        frame.setLayout(null);
        frame.setVisible (true);
    }
}