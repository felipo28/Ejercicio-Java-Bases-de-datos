package dao;

import controlador.claseControladorDetalle;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.claseDetalle;

public class claseDetalleDAO {
    claseControladorDetalle controlDetalle = new claseControladorDetalle();
    
    public void  listarFactura (JTable tabla){
        DefaultTableModel modelo;
        String [] titulo = {"Consecutivo", "N°Factura", "Cod.Producto", "Cantidad", "Vlr.Unitario", "SubTotal"};
        modelo = new DefaultTableModel(null, titulo);
        
        List <claseDetalle> datos = controlDetalle.listAll();
        
        String [] datosDetalles = new String [5];
        for (claseDetalle tbd : datos) {
            datosDetalles[0] = tbd.getConsecutivo() + "";
            datosDetalles[1] = tbd.getNumFactura() + "";
            datosDetalles[2] = tbd.getCodProducto()+ "";
            datosDetalles[3] = tbd.getCantidad()+ "";
            datosDetalles[4] = tbd.getVlrUnitario()+ "";
            Double subtotal  = tbd.getCantidad() * tbd.getVlrUnitario();
            datosDetalles[5] = tbd.getVlrUnitario() + "";
            modelo.addRow(datosDetalles);
        }
        tabla.setModel(modelo);
    }
    
    
    
    public void  listarFacturaPorNFactura (JTable tabla, int nfac){
        DefaultTableModel modelo;
        String [] titulo = {"Consecutivo", "N°Factura", "Cod.Producto", "Cantidad", "Vlr.Unitario", "SubTotal"};
        modelo = new DefaultTableModel(null, titulo);
        
        List <claseDetalle> datos = controlDetalle.listNfactura(nfac);
        
        String [] datosDetalles = new String [6];
        for (claseDetalle tbd : datos) {
            datosDetalles[0] = tbd.getConsecutivo() + "";
            datosDetalles[1] = tbd.getNumFactura() + "";
            datosDetalles[2] = tbd.getCodProducto()+ "";
            datosDetalles[3] = tbd.getCantidad()+ "";
            datosDetalles[4] = tbd.getVlrUnitario()+ "";
            Double subtotal  = tbd.getCantidad() * tbd.getVlrUnitario();
            datosDetalles[5] = subtotal + "";
            modelo.addRow(datosDetalles);
        }
        tabla.setModel(modelo);
    }
    
    
    
    
    public String agregar(int numFactura, int codProducto, int cantidad, Double vlrUnitario){
        String mensaje = null;
        claseDetalle det = new claseDetalle();
        det.setNumFactura(numFactura);
        det.setCodProducto(codProducto);
        det.setCantidad(cantidad);
        det.setVlrUnitario(vlrUnitario);
        
        mensaje = controlDetalle.insert(det);
        return mensaje;
    }
}
