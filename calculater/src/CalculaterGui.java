import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculaterGui implements ActionListener {
    JFrame frame = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();

    JTextField t3 = new JTextField();

    JButton num1 = new JButton();
   // JButton num2 = new JButton();

    void render()

    {
        t1.setBounds(10, 10 , 150 , 50);
        frame.add(t1);
        //t1.setText("srijana");
        System.out.println(t1.getText());

        t2.setBounds(10, 60, 100, 50);
        frame.add(t2);
        System.out.println(t2.getText());

        t3.setBounds(10, 150, 100, 50);
        frame.add(t2);
        System.out.println(t2.getText());


        num1.setBounds(10, 100 , 100 ,50 );
        num1.setText("add ");
        num1.addActionListener(this);
        frame.add(num1);

//        num2.setBounds(10, 180, 100,50);
//        num2.addActionListener(this);
//        frame.add(num2);



        frame.setSize(400, 400);
        frame.setTitle("render");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);// windows draws to center
        frame.setLayout(null);
        frame.setVisible(true);


        System.out.println("Frame render work");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int sum = num1+num2;
        System.out.println("sum is" +sum);
    }
}
