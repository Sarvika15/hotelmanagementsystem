package hotel.management.system;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","sarvika1235");
            s =c.createStatement();

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
