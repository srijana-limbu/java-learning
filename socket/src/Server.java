import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        System.out.println("server");
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            serverSocket.accept();
            System.out.println("a new client has connected");

        } catch (IOException e) {
            System.out.println("client connect to client");
            throw new RuntimeException(e);
        }

    }
}