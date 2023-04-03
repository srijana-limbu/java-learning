import javax.swing.*;
import java.awt.*;

public class GUI {
    JFrame frame = new JFrame();

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();


    void render()
    {
        //create layout
        frame.setLayout(new BorderLayout());

        p1.setBackground(Color.yellow);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.GRAY);
        p4.setBackground(Color.PINK);


        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);

        frame.add(p1, BorderLayout.SOUTH);
        frame.add(p2, BorderLayout.NORTH);
        frame.add(p3, BorderLayout.EAST);
        frame.add(p4, BorderLayout.WEST);

        // create layout at center
        p5.setBackground(Color.GREEN);

        frame.add(p5);
        frame.add(p5, BorderLayout.CENTER);



        frame.setSize(400, 400);
        frame.setTitle("");
       // frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

// create button on layout
        p2.add(new JButton("click"));
        p2.add(new JButton("click"));
        p2.add(new JButton("click"));

        p2.setLayout(new FlowLayout(FlowLayout.LEFT));

//add box layout
        p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
        p2.add(new JButton("click"));
        p2.add(new JButton("click"));
        p2.add(new JButton("click"));

        // add gridLayout
        p3.setLayout(new GridLayout(2, 2));
        p3.add(new JButton("click"));
        p3.add(new JButton("click"));
        p3.add(new JButton("click"));


        frame.setVisible(true);
    }
}
