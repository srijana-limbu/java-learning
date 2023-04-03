import java.io.Serializable;

public class Person implements Serializable {
    int age = 25;
    String name = "Srijana Limbu";
    double height = 5.2;

    String getName()
    {
        return name;
    }
}
