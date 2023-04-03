import javax.swing.*;

public class Gui extends JPanel {
    JFrame frame = new JFrame();
    Box b = new Box();
    Box b1 = new Box();
    void Box(){
        JButton button = new JButton("button");
        button.setBounds(150,150,100,50);
        frame.add(button);

    }
    void render()
    {

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(b);
        frame.add(b1);


    }
}
