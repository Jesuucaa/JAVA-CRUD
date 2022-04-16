package conexion;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author jesuuca
 */
public class ConexionSQL {
    
    Connection conectar = null;
    //String driverName = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/db_programadeclientes"; // ruta de la base de datos
    String usuario = "root";
    String contraseña = "355479@Kijete";
    
    public Connection conexion() {
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection(url, usuario, contraseña);
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error de Conexión " + e.getMessage());
        }

        return conectar;
    
    }
    
}
