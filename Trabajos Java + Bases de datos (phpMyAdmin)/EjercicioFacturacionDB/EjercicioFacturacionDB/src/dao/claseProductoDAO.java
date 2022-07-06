package dao;

import controlador.claseControladorProducto;
import java.util.List;
import javax.swing.JComboBox;
import modelo.claseProducto;

public class claseProductoDAO {
    claseControladorProducto cProducto = new claseControladorProducto();
    
    public void getProductoCmb(JComboBox cmbProducto){
        List <claseProducto> dato =cProducto.listAll();
        for (int i = 0; i < dato.size(); i++) {
            cmbProducto.addItem(dato.get(i).getNombre());
        }
    }
    
    public int getCodigo(String n){
        return cProducto.buscarNombre(n);
    }
}
