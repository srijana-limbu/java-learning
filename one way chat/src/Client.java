import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",1000);

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);//converter
          //  System.out.println((char) inputStreamReader.read());// to print asce value to character

           while (true){
               int c = inputStreamReader.read();
               while (c != -1){
                   System.out.println((char) c);
                   c = inputStreamReader.read();
               }
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
