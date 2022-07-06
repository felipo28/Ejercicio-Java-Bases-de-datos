package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.claseMarca;
import modelo.claseConexion;

public class claseControladorMarca {
    
    private claseConexion conexionBD = new claseConexion();
    
    public List listar (){
        
        PreparedStatement consulta;
        ResultSet datos;
        List <claseMarca> listaMarca = new ArrayList<>();
        try {
            Connection miConexion = conexionBD.getConnection();
            String sql = "SELECT codigo, nombre FROM tbl_marca";
            consulta = miConexion.prepareStatement(sql);
            datos = consulta.executeQuery();
            
            while (datos.next()) {
                claseMarca marca = new claseMarca();
                marca.setCodigo(datos.getInt("codigo"));
                marca.setNombre(datos.getString("nombre"));
                listaMarca.add(marca);
            }
            return listaMarca;
        } catch (SQLException er) {
            System.err.println("No se pudo conectar o hacer la consulta. " + er.getMessage());
            return listaMarca;
        }finally{
            conexionBD.setDesconectar();
        }
    }
    
}
