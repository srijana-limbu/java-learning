import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        File file = new File("first file.txt1");

            file.createNewFile();
        fileWriter.close();

        //read
        FileWriter fileWriter = new FileWriter("second file.txt2");
        BufferedReader fileReader = new FileReader(file);
        String line = bufferReader .readLine();
        while (line ! = null){
            System.out.println(line);
            line = bufferReader.readline();
        }


        f

    }
}