package controlador;

import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.claseConexion;
import modelo.claseUsuario;


public class claseControladorUsuario {
    private claseUsuario usuario = new claseUsuario();
    private claseConexion conexionBD = new claseConexion();
    
    public claseUsuario validar (String usu, String clave){
        try {
            Connection miconexion = conexionBD.getConnection();
            if (usu.equals("") || clave.equals("")){
                JOptionPane.showMessageDialog(null, "El nombre de usuario y la contraseña deben ser digitados");
                return usuario;
            }else{
                String sql = " SELECT identificacion, nombre, nombreUsuario, contrasenia, correo, telefono FROM  tbl_usuario "
                        + "WHERE nombreUsuario = '" + usu + "' and contrasenia = '" + clave + "'";
                
                PreparedStatement consulta = miconexion.prepareStatement(sql);
                ResultSet datos = consulta.executeQuery();
                if (datos.next()) {
                    usuario.setIdentificacion(datos.getInt(1));
                    usuario.setNombre(datos.getString(2));
                    usuario.setNombreUsuario(datos.getString(3));
                    usuario.setContrasenia(datos.getString(4));
                    usuario.setCorreo(datos.getString(5));
                    usuario.setTelefono(datos.getString(6));
                    return usuario;
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario y/o contraseña equivocados", "Error de acceso", HEIGHT);
                    return usuario;
                }
            }
        } catch (SQLException e) {
            System.err.println("No se pudo conectar o hacer la consulta");
            return usuario;
        }finally{
            conexionBD.setDesconectar();
        }
        
    }
}
