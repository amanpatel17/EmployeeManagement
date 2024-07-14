
package employee.management;

/**
 *
 * @author amanp
 */
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employemanage", "root", "113114");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}