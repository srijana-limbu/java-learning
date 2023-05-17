import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) {
        System.out.println("Client");

        try {
            DatagramSocket socket = new DatagramSocket(12345);

            byte[] dataPacket = new byte[1024];

            DatagramPacket packet = new DatagramPacket(dataPacket,dataPacket.length);

            socket.receive(packet);
                                                   //read msg from length 0 to n-1
            String receiveMessage = new String(packet.getData(),0, packet.getLength());

            System.out.println(receiveMessage);

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
