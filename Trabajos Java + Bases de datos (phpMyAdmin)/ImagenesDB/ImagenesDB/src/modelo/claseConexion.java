package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class claseConexion {
    Connection miConexion;
    
    public Connection getConnection(){
        String DB = "fotos";
        String usuario = "root";
        String contrasenia = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String servidor  = "jdbc:mysql://localhost:3306/" + DB;
            miConexion = DriverManager.getConnection(servidor, usuario, contrasenia);
        } catch (ClassNotFoundException e) {
            System.err.println("No se encontro el driver de MySql " + e.getMessage());
            miConexion = null;
        } catch (SQLException ex){
            System.out.println("No se pudo conectar la base de datos " + ex.getMessage());
            miConexion = null;
        }
        return miConexion;
    }
    
    public void setDesconectar(){
        try {
            miConexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo desconectar la base de datos");
        }
    }
}
