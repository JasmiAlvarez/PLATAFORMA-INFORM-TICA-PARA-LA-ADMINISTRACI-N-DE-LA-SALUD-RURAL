
package BDCONEXION;


import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class Conexion {
    
    
    public String db = "citas_medicas";
    public String user = "sa";       
    public String pass = "123";  
    public String url = "jdbc:sqlserver://localhost:1433;databaseName=" + db + ";encrypt=true;trustServerCertificate=true";

    public Connection Conectar() {
        Connection link = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            link = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return link;
    }
}
