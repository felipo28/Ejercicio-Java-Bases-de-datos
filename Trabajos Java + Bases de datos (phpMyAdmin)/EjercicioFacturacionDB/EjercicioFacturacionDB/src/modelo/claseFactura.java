package modelo;

public class claseFactura {
    private int numero;
    private String fecha;
    private int idCliente;
    private String fechaHoraCreacion;
    private String fechaHoraModificacion;

    public claseFactura() {
    }

    public claseFactura(int numero, String fecha, int idCliente, String fechaHoraCreacion, String fechaHoraModificacion) {
        this.numero = numero;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraModificacion = fechaHoraModificacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(String fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public String getFechaHoraModificacion() {
        return fechaHoraModificacion;
    }

    public void setFechaHoraModificacion(String fechaHoraModificacion) {
        this.fechaHoraModificacion = fechaHoraModificacion;
    }
    
    
}
