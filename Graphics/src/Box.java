import javax.swing.*;
import java.awt.*;
import java.awt.ActiveEvent;

public class Box extends JPanel {
    int boxX = 10;
    int boxY = 10;
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        //add rectangle
        g.setColor(Color.BLUE);
        g.fillRect(10, 10, 100, 100);

        g.setColor(Color.RED);
        g.fillRect(200, 10, 100, 100);

        g.setColor(Color.BLACK);
        g.fillRect(400, 10,150,150);

    }
    public void actionPerformed(ActiveEvent e){
        System.out.println("Click bhayo");
        boxX += 10;
       // repaint();
    }
    


}
