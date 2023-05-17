import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1000);
            Socket socket = ss.accept();

            System.out.println("connection done");

            OutputStream outputStream = socket.getOutputStream();//to send data
            PrintWriter pw = new PrintWriter(outputStream,true);
           // pw.println("hello world");
            while (true){
                Scanner input = new Scanner(System.in);
                String userInput = input.nextLine();
                pw.println(userInput);
            }




        } catch (IOException e) {
            System.out.println("can not  connect to client");

            throw new RuntimeException(e);

        }


    }
}