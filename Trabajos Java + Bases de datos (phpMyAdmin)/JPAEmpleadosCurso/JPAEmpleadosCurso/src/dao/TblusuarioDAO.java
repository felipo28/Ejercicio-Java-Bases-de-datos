package dao;

import control.TblUsuarioJpaController;
import entidad.TblUsuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class TblusuarioDAO {
    TblUsuarioJpaController tuc = new TblUsuarioJpaController();
    TblUsuario persona = new TblUsuario();
    String mensaje = null;
    
    public boolean login(String nombre, String contraseña){
        EntityManager em = tuc.getEntityManager();
        boolean res = false;
        try {
            Query consulta = em.createQuery("SELECT u.nombre, u.contrasenia FROM TblUsuario u WHERE u.nombre = :nombre AND u.contrasenia = :contraseña");
            consulta.setParameter("nombre", nombre);
            consulta.setParameter("contraseña", contraseña);
            List resultado = consulta.getResultList();
            if (!resultado.isEmpty()) {
                res = true;
            } else {
                res = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de acceso. " + e.getMessage());
            res = false;
        }
        return res;
    }
}
