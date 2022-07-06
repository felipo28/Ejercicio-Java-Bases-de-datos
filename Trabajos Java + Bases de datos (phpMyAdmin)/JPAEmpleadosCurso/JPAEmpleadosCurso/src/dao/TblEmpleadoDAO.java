
package dao;

import control.TblpersonaJpaController;
import entidad.TblEmpleado;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TblEmpleadoDAO {
    TblpersonaJpaController tpc = new TblpersonaJpaController();
    TblEmpleado persona = new TblEmpleado();
    String mensaje = null;
    
    public  String insertar (String nombre, String apellidos, int edad, String telefono){
        try {
            persona.setId(Integer.SIZE);
            persona.setNombres(nombre);
            persona.setApellidos(apellidos);
            persona.setEdad(edad);
            persona.setTelefono(telefono);
            tpc.create(persona);
            mensaje = "Datos correctamente insertados.";
            
        } catch (Exception e) {
            mensaje = "Los datos NO fuero correctamente insertados. "+ e.getMessage();
        }
        return mensaje;
    }
    
    public  String editar (int id, String nombre, String apellidos, int edad, String telefono){
        try {
            persona.setId(id);
            persona.setNombres(nombre);
            persona.setApellidos(apellidos);
            persona.setEdad(edad);
            persona.setTelefono(telefono);
            tpc.edit(persona);
            mensaje = "Datos correctamente editado.";
            
        } catch (Exception e) {
            mensaje = "Los datos no se pueden editar. "+ e.getMessage();
        }
        return mensaje;
    }
    
    public  String eliminar (int id){
        try {
            tpc.destroy(id);
            mensaje = "Datos correctamente eliminados.";
        } catch (Exception e) {
            mensaje = "Los datos NO fuero correctamente eliminados. "+ e.getMessage();
        }
        return mensaje;
    }
    
    public void listarPersona(JTable tabla, String nombre){
        DefaultTableModel modelo;
        String [] titulos = {"ID", "NOMBRES", "APELLIDOS", "EDAD", "TELEFONO"};
        modelo = new DefaultTableModel(null, titulos);
        
        List <TblEmpleado> datos = buscarPersona(nombre);
        
        String [] datosPersona = new String[5];
        for (TblEmpleado tblp : datos) {
            datosPersona[0] = tblp.getId() + "";
            datosPersona[1] = tblp.getNombres();
            datosPersona[2] = tblp.getApellidos()+ "";
            datosPersona[3] = tblp.getEdad()+ "";
            datosPersona[4] = tblp.getTelefono();
            modelo.addRow(datosPersona);
        }
        tabla.setModel(modelo);
    }
    
    private List <TblEmpleado> buscarPersona(String nombres){
        TblEmpleado tblp;
        EntityManager em = tpc.getEntityManager();
        Query consulta = em.createQuery("SELECT p FROM TblEmpleado p WHERE p.nombres LIKE :nombres");
        
        consulta.setParameter("nombres", "%" + nombres + "%");
        List <TblEmpleado> lista = consulta.getResultList();
        return lista;
    }
    
    public void getPersonaCmb(JComboBox <TblEmpleado> cmbPersona){
        EntityManager em = tpc.getEntityManager();
        Iterator it = em.createQuery("SELECT p FROM TblEmpleado p").getResultList().iterator();
        TblEmpleado tp;
        try {
            while (it.hasNext()) {                
                tp = (TblEmpleado) it.next();
                cmbPersona.addItem(tp);
            }
        } catch (Exception e) {
            System.out.println("Error no pudo listar el cobo persona");
        }
    }
}
