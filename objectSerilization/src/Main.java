import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("lo.txt");
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);

        Person person = new Person();
        objectOutputStream.writeObject(person);

        FileInputStream fileInputStream = new FileInputStream("lo.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 =(Person) objectInputStream.readObject();
//        person1.getName();
        System.out.println(person1.getName());


    }
}