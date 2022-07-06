package dao;

import controlador.claseControladorCliente;
import java.util.List;
import javax.swing.JComboBox;
import modelo.claseCliente;

public class claseClienteDAO {
    claseControladorCliente cCliente = new claseControladorCliente();
    
    public void getClienteCmb (JComboBox cmbCliente){
        List <claseCliente> dato = cCliente.listAll();
        for (int i = 0; i < dato.size(); i++) {
            cmbCliente.addItem(dato.get(i).getNombre());
        }
    }
    public int getId(String n){
        return cCliente.buscarNombre(n);
    }
}
