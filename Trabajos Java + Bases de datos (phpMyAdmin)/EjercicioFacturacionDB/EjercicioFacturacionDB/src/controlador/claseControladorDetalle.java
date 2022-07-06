package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.claseConexion;
import modelo.claseDetalle;
import modelo.claseProducto;

public class claseControladorDetalle {
    private claseConexion conexionBD = new claseConexion();
    
    public List listAll(){
        
        PreparedStatement consulta;
        ResultSet datos;
        
        List <claseDetalle> listaDetalle = new ArrayList<>();
        
        try {
            Connection miConexion = conexionBD.getConnection();
            String sql = "SELECT consecutivo, numFactura, codProducto, cantidad, vlrUnitario FROM tbldetallefactura";
            consulta = miConexion.prepareStatement(sql);
            datos = consulta.executeQuery();
            
            while (datos.next()) {
                claseDetalle detalle = new claseDetalle();
                detalle.setConsecutivo(datos.getInt("consecutivo"));
                detalle.setNumFactura(datos.getInt("numFactura"));
                detalle.setCodProducto(datos.getInt("codProducto"));
                detalle.setCantidad(datos.getInt("cantidad"));
                detalle.setVlrUnitario(datos.getInt("vlrUnitario"));
                listaDetalle.add(detalle);
            }
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer la consulta. " + er.getMessage());
        }finally{
            conexionBD.setDesconectar();
        }
        return listaDetalle;
    }
    
    
    public List listNfactura(int nFac){
        
        PreparedStatement consulta;
        ResultSet datos;
        
        List <claseDetalle> listaDetalle = new ArrayList<>();
        
        try {
            Connection miConexion = conexionBD.getConnection();
            String sql = "SELECT consecutivo, numFactura, codProducto, cantidad, vlrUnitario FROM tbldetallefactura WHERE numFactura = ?";
            consulta = miConexion.prepareStatement(sql);
            consulta.setInt(1, nFac);
            datos = consulta.executeQuery();
            
            while (datos.next()) {
                claseDetalle detalle = new claseDetalle();
                detalle.setConsecutivo(datos.getInt("consecutivo"));
                detalle.setNumFactura(datos.getInt("numFactura"));
                detalle.setCodProducto(datos.getInt("codProducto"));
                detalle.setCantidad(datos.getInt("cantidad"));
                detalle.setVlrUnitario(datos.getInt("vlrUnitario"));
                listaDetalle.add(detalle);
            }
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer la consulta. " + er.getMessage());
        }finally{
            conexionBD.setDesconectar();
        }
        return listaDetalle;
    }
    
    
    
    public String insert(claseDetalle det) {
        String mensaje = null;
        try {
            Connection miConexion = conexionBD.getConnection();

            String sql = "INSERT INTO tbldetallefactura(numFactura, codProducto, cantidad, vlrUnitario) VALUES (?,?,?,?)";
            PreparedStatement insertar = miConexion.prepareStatement(sql);

            insertar.setInt(1, det.getNumFactura());
            insertar.setInt(2, det.getCodProducto());
            insertar.setInt(3, det.getCantidad());
            insertar.setDouble(4, det.getVlrUnitario());

            insertar.execute();
            mensaje = "Registro Guardado Exitosamente";

        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer insercion. " + er.getMessage());
            mensaje = "No se pudo conectar o hacer insercion. " + er.getMessage();
        } finally {
            conexionBD.setDesconectar();
        }
        return mensaje;
    }
}
