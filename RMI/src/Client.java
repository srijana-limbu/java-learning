import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        HelloService object= (HelloService) Naming.lookup("rmi://localhost:5099/hello");
        object.printMessage();

        String sum = String.valueOf(object.printSum());


        System.out.println(object.printMessage());
        System.out.println("\n"+sum);

    }
}
