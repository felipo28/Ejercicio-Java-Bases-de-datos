
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class claseConexion {
    Connection miconexion;
    PreparedStatement consulta;
    ResultSet datos;
    
    public Connection getConnection(){
        String bd = "tallermecanico";
        String usuario = "root";
        String clave = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String servidor  = "jdbc:mysql://localhost:3306/" + bd;
            miconexion = (Connection) DriverManager.getConnection(servidor, usuario, clave);
        } catch (ClassNotFoundException e) {
            System.err.println("No se encontro el driver de MySql");
            miconexion = null;
        } catch (SQLException ex){
            miconexion = null;
        }
        return miconexion;
    }
    
    public void setDesconectar(){
        try {
            miconexion.close();
            consulta.close();
            datos = null;
        } catch (Exception e) {
        
        }
    }
}
