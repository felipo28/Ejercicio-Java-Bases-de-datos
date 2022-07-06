package dao;

import control.TblproductoJpaController;
import entidad.Tblproducto;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class tblproductoDAO {
    TblproductoJpaController tpc = new TblproductoJpaController();
    Tblproducto producto = new Tblproducto();
    String mensaje = null;
    
    public String insertar(String produc, int piezasCajas, int precioPublico, int precioMayor){
        try {
            producto.setId(Integer.SIZE);
            producto.setProducto(produc);
            producto.setPiezasCaja(piezasCajas);
            producto.setPrecioPublico(precioPublico);
            producto.setPreciomayoreo(precioMayor);
            
            tpc.create(producto);
            mensaje = "Datos correctamente insertados.";
        } catch (Exception e) {
            mensaje = "Los datos no se pueden insertar. " + e.getMessage();
        }
        return mensaje;
    }
    
    public String editar(int id, String produc, int piezasCajas, int precioPublico, int precioMayor){
        try {
            producto.setId(id);
            producto.setProducto(produc);
            producto.setPiezasCaja(piezasCajas);
            producto.setPrecioPublico(precioPublico);
            producto.setPreciomayoreo(precioMayor);
            
            tpc.edit(producto);
            mensaje = "Datos correctamente editados.";
        } catch (Exception e) {
            mensaje = "Los datos no se pueden editados. " + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminar(int id){
        try {
            tpc.destroy(id);
            mensaje =  "Datos correctamente eliminados.";
        } catch (Exception e) {
            mensaje = "Los datos no se pueden eliminar. " + e.getMessage();
        }
        return mensaje;
    }
    
    public void listar(JTable tabla, String nombre){
        DefaultTableModel modelo;
        String [] titulos = {"ID", "PRODUCTO", "PIEZAS_CAJA", "PRECIO_PUBLICO", "PRECIO_MAYOREO"};
        modelo = new DefaultTableModel(null, titulos);
        
        List<Tblproducto> datos = buscarProducto(nombre);
        
        String [] datosProducto = new String [5];
        for (Tblproducto tblp : datos) {
            datosProducto[0] = tblp.getId() + "";
            datosProducto[1] = tblp.getProducto()+ "";
            datosProducto[2] = tblp.getPiezasCaja()+ "";
            datosProducto[3] = tblp.getPrecioPublico()+ "";
            datosProducto[4] = tblp.getPreciomayoreo()+ "";
            modelo.addRow(datosProducto);
        }
        tabla.setModel(modelo);
    }
    
    private List<Tblproducto> buscarProducto (String producto){
        Tblproducto tblp;
        EntityManager em = tpc.getEntityManager();
        Query consulta = em.createQuery("SELECT p FROM Tblproducto p WHERE p.producto LIKE :producto");
        consulta.setParameter("producto", "%" + producto + "%");
        List<Tblproducto> lista = consulta.getResultList();
        return lista;        
    }
    
    public void getPersonaCmb(JComboBox <Tblproducto> cmbPersona){
        EntityManager em = tpc.getEntityManager();
        Iterator it = em.createQuery("SELECT p FROM Tblproducto p").getResultList().iterator();
        Tblproducto tp;
        try {
            while (it.hasNext()) {                
                tp = (Tblproducto) it.next();
                cmbPersona.addItem(tp);
            }
        } catch (Exception e) {
            System.out.println("Error no se pudo listar el combo persona");
        }
    }
}
