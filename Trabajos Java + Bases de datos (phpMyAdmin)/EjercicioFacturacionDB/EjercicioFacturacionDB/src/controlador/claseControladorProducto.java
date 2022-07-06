package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.claseConexion;
import modelo.claseFactura;
import modelo.claseProducto;

public class claseControladorProducto {
    
    private claseConexion conexionBD = new claseConexion();
    
    public List listAll(){
        PreparedStatement consulta;
        ResultSet datos;
        
        List <claseProducto> listaProducto = new ArrayList<>();
        
        try {
            Connection miConexion = conexionBD.getConnection();
            String sql = "SELECT * FROM tblproducto";
            consulta = miConexion.prepareStatement(sql);
            datos = consulta.executeQuery();
            
            while (datos.next()) {
                claseProducto Producto = new claseProducto();
                Producto.setCodigo(datos.getInt("codigo"));
                Producto.setNombre(datos.getString("nombre"));
                Producto.setCodTipoProducto(datos.getInt("codTipoProducto"));
                Producto.setFechaHoraCreacion(datos.getString("fechaCreacion"));
                Producto.setFechaHoraModificacion(datos.getString("fechaModificacion"));
                listaProducto.add(Producto);
            }
            return listaProducto;
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer la consulta. " + er.getMessage());
            return listaProducto;
        }finally{
            conexionBD.setDesconectar();
        }
    }
    
    public int buscarNombre(String nombre) {
        int cod = 0;
        PreparedStatement consulta;
        ResultSet datos;
        Connection miConexion = conexionBD.getConnection();
        String sql = "SELECT codigo FROM tblproducto WHERE nombre = ?";
        try {
            consulta = miConexion.prepareStatement(sql);
            consulta.setString(1, nombre);
            datos = consulta.executeQuery();
            while (datos.next()) {                
                int dat;
                dat = datos.getInt("codigo");
                cod = dat;
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo consultar o hacer consulta. " + ex.getMessage());
        }
        return cod;
    }
    
    
}
