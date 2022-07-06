package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


public class claseControladorDatos {
    
    private claseConexion conexionBD = new claseConexion();
    
    public List listar(){
        PreparedStatement consulta;
        ResultSet datos;
        List <claseDatos> listaEmpleados = new ArrayList<>();
        
        try {
            Connection miConexion = conexionBD.getConnection();
            String sql = "SELECT id, cedula, nombre, apellidos, telefono FROM datos";
            consulta = miConexion.prepareStatement(sql);
            datos = consulta.executeQuery();
            
            while (datos.next()) {                
                claseDatos empleado = new claseDatos();
                empleado.setId(datos.getInt("id"));
                empleado.setCedula(datos.getInt("cedula"));
                empleado.setNombre(datos.getString("nombre"));
                empleado.setApellidos(datos.getString("apellidos"));
                empleado.setTelefono(datos.getString("telefono"));
                listaEmpleados.add(empleado);
            }
            return listaEmpleados;
        } catch (SQLException e) {
            System.out.println("No se pudo conectar o hacer consulta" + e.getMessage());
            return listaEmpleados;
        }finally{
            conexionBD.setDesconectar();
        }
    }
}
