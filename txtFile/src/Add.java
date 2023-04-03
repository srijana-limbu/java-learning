import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Add implements ActionListener {

    public JFrame frame;
    public JTextArea textArea;

    public void Add () throws IOException{

        frame = new JFrame("Notepad");
        textArea = new JTextArea();
      //  JButton button = new JButton("save");

        frame.add(textArea, BorderLayout.CENTER);
       // frame.add(button, BorderLayout.SOUTH);
        textArea.setBackground(Color.LIGHT_GRAY);
        //button.setBackground(Color.GREEN);

       // button.addActionListener(this);

//
//        File file = new File("data.txt");
//        file.createNewFile();
//
//        //write
//
//        FileWriter filewriter = new FileWriter(file);
//
//        filewriter.close();


        //read
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        System.out.println(bufferedReader.readLine());

//
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line = bufferedReader.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = bufferedReader.readLine();
//        }

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
            writer.write(textArea.getText());
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}


