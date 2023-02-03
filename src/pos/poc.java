
package pos;
import java.sql.Connection;
import java.sql.DriverManager;

public class poc {
    
    static Connection c;

    public static Connection NRC() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/javasales","root","");
        }
        return c;

    }
    
    
    
    
}
