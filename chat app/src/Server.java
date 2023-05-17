import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();
            System.out.println("Connection Added");

            //InputStream inputStream = socket.getInputStream();//capture message
           // InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            //this is for getting socket value (message)
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //this is for user typed input
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            //i need a pen to write the message
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);


           // for user input
            String sendingMessage,receivingMessage;
            while (true){
                //sending  to client
                sendingMessage = userInputReader.readLine();//get input from user
                printWriter.println(sendingMessage);
                printWriter.flush();

                //receiving message from client

                receivingMessage = socketDataReader.readLine();
                System.out.println("client:"+receivingMessage);


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


       // System.out.println("Hello world!");
    }
}