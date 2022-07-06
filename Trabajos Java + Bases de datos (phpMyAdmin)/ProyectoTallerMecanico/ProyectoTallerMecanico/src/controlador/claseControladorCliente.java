package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.claseCliente;
import modelo.claseClienteVehiculo;
import modelo.claseConexion;

public class claseControladorCliente {
    
    private claseConexion conexionBD = new claseConexion();
    
    public void agregar (claseCliente cl){
        try {
            Connection miConexion = conexionBD.getConnection();
            
            String sql = "INSERT INTO tbl_cliente (identificacion, nombre, apellidos, correo, domicilio, telefono) VALUES (?,?,?,?,?,?)";
            PreparedStatement insertar = miConexion.prepareStatement(sql);
            insertar.setInt(1, cl.getIdentificacion());
            insertar.setString(2, cl.getNombre());
            insertar.setString(3, cl.getApellidos());
            insertar.setString(4, cl.getCorreo());
            insertar.setString(5, cl.getDomicilio());
            insertar.setString(6, cl.getTelefono());
            
            insertar.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Guardado Exitosamente.");
            
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer insercion. " + er.getMessage());
            
        }finally{
            conexionBD.setDesconectar();
        }
    }
    
    
    public void editar (claseCliente cl){
        try {
            Connection miConexion = conexionBD.getConnection();
            
            String sql = "UPDATE tbl_cliente  SET nombre = ?, apellidos = ?, correo = ?, domicilio = ?, telefono = ? WHERE identificacion = ?";
            PreparedStatement actualizar = miConexion.prepareStatement(sql);
            actualizar.setString(1, cl.getNombre());
            actualizar.setString(2, cl.getApellidos());
            actualizar.setString(3, cl.getCorreo());
            actualizar.setString(4, cl.getDomicilio());
            actualizar.setString(5, cl.getTelefono());
            actualizar.setInt(6, cl.getIdentificacion());
            
            actualizar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro Actualizado Exitosamente.");
            
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer Actualizado. " + er.getMessage());
            
        }finally{
            conexionBD.setDesconectar();
        }
    }
    
    
    public List listar (){
        
        PreparedStatement consulta;
        ResultSet datos;
        List <claseCliente> listaClientes = new ArrayList<>();
        try {
            Connection miConexion = conexionBD.getConnection();
            String sql = "SELECT identificacion, nombre, apellidos, correo, domicilio, telefono FROM tbl_cliente";
            consulta = miConexion.prepareStatement(sql);
            datos = consulta.executeQuery();
            
            while (datos.next()) {
                claseCliente cliente = new claseCliente();
                cliente.setIdentificacion(datos.getInt("identificacion"));
                cliente.setNombre(datos.getString("nombre"));
                cliente.setApellidos(datos.getString("apellidos"));
                cliente.setCorreo(datos.getString("correo"));
                cliente.setDomicilio(datos.getString("domicilio"));
                cliente.setTelefono(datos.getString("telefono"));
                listaClientes.add(cliente);
            }
            return listaClientes;
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer la consulta. " + er.getMessage());
            return listaClientes;
        }finally{
            conexionBD.setDesconectar();
        }
    }
    
    public void eliminar (int id){
        try {
            Connection miConexion = conexionBD.getConnection();
            
            String sql = "DELETE FROM tbl_cliente WHERE identificacion = '" + id + "'";
            PreparedStatement borrar = miConexion.prepareStatement(sql);
            borrar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado con Exito.");
            
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer Eliminacion. " + er.getMessage());
            
        }finally{
            conexionBD.setDesconectar();
        }
    }
    
    public List buscar (String nombre){
        PreparedStatement buscar;
        ResultSet datos;
        List <claseCliente> listaBusqueda = new ArrayList<>();
        try {
            Connection miConexion = conexionBD.getConnection();
            String sql = "SELECT identificacion, nombre, apellidos, correo, domicilio, telefono FROM tbl_cliente WHERE nombre like '%" + nombre + "%'";
            buscar = miConexion.prepareStatement(sql);
            
            datos = buscar.executeQuery();
            
            while (datos.next()) {
                claseCliente cliente = new claseCliente();
                cliente.setIdentificacion(datos.getInt("identificacion"));
                cliente.setNombre(datos.getString("nombre"));
                cliente.setApellidos(datos.getString("apellidos"));
                cliente.setCorreo(datos.getString("correo"));
                cliente.setDomicilio(datos.getString("domicilio"));
                cliente.setTelefono(datos.getString("telefono"));
                listaBusqueda.add(cliente);
            }
            
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer la busqueda. " + er.getMessage());
            
        }finally{
            conexionBD.setDesconectar();
        }
        return listaBusqueda;
    }
    
    
    
    
    
    
    
    
    
    
    public List listarClienteVehiculo (){
        
        PreparedStatement consulta;
        ResultSet datos;
        List <claseClienteVehiculo> listaClientes = new ArrayList<>();
        try {
            Connection miConexion = conexionBD.getConnection();
            String sql = "SELECT placa, identificacion, nombre, apellidos, modelo, color FROM clientevehiculo";
            consulta = miConexion.prepareStatement(sql);
            datos = consulta.executeQuery();
            
            while (datos.next()) {
                claseClienteVehiculo clienteVehiculo = new claseClienteVehiculo();
                clienteVehiculo.setPlaca(datos.getString("placa"));
                clienteVehiculo.setIdentificacion(datos.getInt("identificacion"));
                clienteVehiculo.setNombre(datos.getString("nombre"));
                clienteVehiculo.setApellidos(datos.getString("apellidos"));
                clienteVehiculo.setModelo(datos.getInt("modelo"));
                clienteVehiculo.setColor(datos.getString("color"));
                listaClientes.add(clienteVehiculo);
            }
            return listaClientes;
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer la consulta. " + er.getMessage());
            return listaClientes;
        }finally{
            conexionBD.setDesconectar();
        }
    }
    
    public List buscarClienteVehiculo (String nombre){
        PreparedStatement buscar;
        ResultSet datos;
        List <claseClienteVehiculo> listaBusquedaClV = new ArrayList<>();
        try {
            Connection miConexion = conexionBD.getConnection();
            String sql = "SELECT placa, identificacion, nombre, apellidos, modelo, color FROM clientevehiculo WHERE nombre like '%" + nombre + "%'";
            buscar = miConexion.prepareStatement(sql);
            
            datos = buscar.executeQuery();
            
            while (datos.next()) {
                claseClienteVehiculo clienteVehiculo = new claseClienteVehiculo();
                clienteVehiculo.setPlaca(datos.getString("placa"));
                clienteVehiculo.setIdentificacion(datos.getInt("identificacion"));
                clienteVehiculo.setNombre(datos.getString("nombre"));
                clienteVehiculo.setApellidos(datos.getString("apellidos"));
                clienteVehiculo.setModelo(datos.getInt("modelo"));
                clienteVehiculo.setColor(datos.getString("color"));
                listaBusquedaClV.add(clienteVehiculo);
            }
            
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer la busqueda. " + er.getMessage());
            
        }finally{
            conexionBD.setDesconectar();
        }
        return listaBusquedaClV;
    }
}
