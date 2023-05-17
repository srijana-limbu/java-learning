import javax.xml.transform.Result;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/test-bit";

        Connection conn = DriverManager.getConnection(url, "root", "mysql#bts#");
        System.out.println("connection success!");

//lets create query
       Statement stm = conn.createStatement();
       ResultSet rs = stm.executeQuery("SELECT * FROM `test-bit`.new_table");
       while (rs.next()){
           String name = rs.getString("name");
           System.out.println(name);

           // prepared statement!
           PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM `test-bit`.new_table WHERE id=? ANd ADDRESS=?");
           preparedStatement.setInt(1,10);
           ResultSet resultSet = preparedStatement.executeQuery();

           while (rs.next()){
               String name1 = rs.getString("name");
               System.out.println(name1);

           }




       }

    }
}