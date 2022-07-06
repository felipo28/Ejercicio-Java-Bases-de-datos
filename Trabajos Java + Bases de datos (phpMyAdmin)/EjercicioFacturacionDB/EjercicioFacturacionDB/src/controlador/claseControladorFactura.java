package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.claseConexion;
import modelo.claseFactura;

public class claseControladorFactura {
    private claseConexion conexionBD = new claseConexion();
    
    public List listAll(){
        PreparedStatement consulta;
        ResultSet datos;
        
        List <claseFactura> listaFactura = new ArrayList<>();
        
        try {
            Connection miConexion = conexionBD.getConnection();
            String sql = "SELECT numero, fecha, idCliente, fechaHoraCreacion, fechaHoraModificacion FROM tblfactura";
            consulta = miConexion.prepareStatement(sql);
            datos = consulta.executeQuery();
            
            while (datos.next()) {
                claseFactura factura = new claseFactura();
                factura.setNumero(datos.getInt("numero"));
                factura.setFecha(datos.getString("fecha"));
                factura.setIdCliente(datos.getInt("idCliente"));
                factura.setFechaHoraCreacion(datos.getString("fechaHoraCreacion"));
                factura.setFechaHoraModificacion(datos.getString("fechaHoraModificacion"));
                listaFactura.add(factura);
            }
            return listaFactura;
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer la consulta. " + er.getMessage());
            return listaFactura;
        }finally{
            conexionBD.setDesconectar();
        }
        
    }
    //INSERT INTO tblfactura(numero, fecha, idCliente, fechaHoraCreacion, fechaHoraModificacion) VALUES (?,?,?,?,?)
    public String insert(claseFactura fac){
        String mensaje = null;
        try {
            Connection miConexion = conexionBD.getConnection();
       
            String sql = "INSERT INTO tblfactura(numero, fecha, idCliente, fechaHoraCreacion, fechaHoraModificacion) VALUES (?,?,?,?,?)";
            PreparedStatement insertar = miConexion.prepareStatement(sql);
            
            insertar.setInt(1, fac.getNumero());
            insertar.setString(2, fac.getFecha());
            insertar.setInt(3, fac.getNumero());
            insertar.setString(4, fac.getFechaHoraCreacion());
            insertar.setString(5, fac.getFechaHoraModificacion());
            insertar.execute();
            mensaje = "Registro guardada exitosamente. ";
            
        } catch (SQLException er) {
            mensaje = "No se pudo conectar o hacer insercion. " + er.getMessage();
        } finally{
            conexionBD.setDesconectar();
        }
        return mensaje;
    }
    
    public void edit(claseFactura fac){
        
    }
    
    public void destroy(int numFactura){
        
    }
    
    public List source(claseFactura fac){
        return null;
    }
}
