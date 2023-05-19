import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServent extends UnicastRemoteObject implements HelloService {

    protected HelloServent() throws RemoteException {
      super();
    }

    @Override
    public String printMessage() throws RemoteException {


        return "hey this is message";

    }

    public int printSum() throws RemoteException {
        int a=10;
        int b=20;
        return a+b;
    }
}
