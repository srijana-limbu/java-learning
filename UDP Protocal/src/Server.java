import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;


public class Server {
    public static void main(String[] args)throws IOException
    {
        DatagramSocket socket = new DatagramSocket();

        //create msg
        String message = "Hello world";
        InetAddress address = InetAddress.getByName("localhost");

        //for packet
        DatagramPacket packet = new DatagramPacket(message.getBytes(),message.length(),address,12345);
        // message.getBytes = convert string to bytes

        // sending packing via socket
        System.out.println("Sending message...");
        socket.send(packet);


    }
}