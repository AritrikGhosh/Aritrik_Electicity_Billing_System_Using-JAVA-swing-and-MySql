
package electicity.billing.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "Ghoshakash@13");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}