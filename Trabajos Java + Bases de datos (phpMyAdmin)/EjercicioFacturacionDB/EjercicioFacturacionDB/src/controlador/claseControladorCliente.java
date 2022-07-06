package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.claseCliente;
import modelo.claseConexion;

public class claseControladorCliente {
    private claseConexion conexionBD = new claseConexion();
    
    public List listAll(){
        PreparedStatement consulta;
        ResultSet datos;
        List <claseCliente> listaCliente = new ArrayList<>();
        
        try {
            Connection miConexion = conexionBD.getConnection();
            String sql = "SELECT * FROM tblcliente";
            consulta = miConexion.prepareStatement(sql);
            datos = consulta.executeQuery();
            
            while (datos.next()) {
                claseCliente cliente = new claseCliente();
                cliente.setId(datos.getInt("id"));
                cliente.setNombre(datos.getString("nombre"));
                cliente.setDireccion(datos.getString("direccion"));
                cliente.setTelefono(datos.getString("telefono"));
                listaCliente.add(cliente);
            }
            return listaCliente;
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer la consulta. " + er.getMessage());
            return listaCliente;
        }finally{
            conexionBD.setDesconectar();
        }
    }

    public int buscarNombre(String nombre) {
        int id = 0;
        PreparedStatement consulta;
        ResultSet datos;
        Connection miConexion = conexionBD.getConnection();
        String sql = "SELECT id FROM tblcliente WHERE nombre = ?";
        try {
            consulta = miConexion.prepareStatement(sql);
            consulta.setString(1, nombre);
            datos = consulta.executeQuery();
            while (datos.next()) {                
                int dat;
                dat = datos.getInt("id");
                id = dat;
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo consultar o hacer consulta. " + ex.getMessage());
        }
        return id;
    }
}
