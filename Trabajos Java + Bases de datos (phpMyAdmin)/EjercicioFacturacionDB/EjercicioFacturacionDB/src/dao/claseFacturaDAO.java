package dao;

import controlador.claseControladorFactura;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.claseFactura;

public class claseFacturaDAO {
    claseControladorFactura controlFactura = new claseControladorFactura();
    
    public void listarFactura(JTable tabla){
        DefaultTableModel modelo;
        String [] titulos = {"Numero", "Fecha", "IdCliente", "FHCreacion", "FHModi"};
        modelo = new DefaultTableModel(null,titulos);
        
        List <claseFactura> datos =  controlFactura.listAll();
        
        String [] datosFactura = new String[5];
        for (claseFactura tbf : datos) {
            datosFactura[0] = tbf.getNumero() + "";
            datosFactura[1] = tbf.getFecha() + "";
            datosFactura[2] = tbf.getIdCliente() + "";
            datosFactura[3] = tbf.getFechaHoraCreacion() + "";
            datosFactura[4] = tbf.getFechaHoraModificacion() + "";
            modelo.addRow(datosFactura);
        }
        tabla.setModel(modelo);
    }
    
    public String agregar (int numero, int idCliente, String fecha, String fechaCreacion, String fechaModificacion){
        String mensaje = null;
        claseFactura fac = new claseFactura();
        fac.setNumero(numero);
        fac.setFecha(fecha);
        fac.setIdCliente(idCliente);
        fac.setFechaHoraCreacion(fechaCreacion);
        fac.setFechaHoraModificacion(fechaModificacion);
        mensaje = controlFactura.insert(fac);
        return mensaje;
    }
}
