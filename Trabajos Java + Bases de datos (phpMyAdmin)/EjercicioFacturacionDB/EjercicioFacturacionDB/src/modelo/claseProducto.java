package modelo;

public class claseProducto {
    private int codigo;
    private String nombre;
    private int codTipoProducto;
    private String fechaHoraCreacion;
    private String fechaHoraModificacion;

    public claseProducto() {
    }

    public claseProducto(int codigo, String nombre, int codTipoProducto, String fechaHoraCreacion, String fechaHoraModificacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codTipoProducto = codTipoProducto;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraModificacion = fechaHoraModificacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodTipoProducto() {
        return codTipoProducto;
    }

    public void setCodTipoProducto(int codTipoProducto) {
        this.codTipoProducto = codTipoProducto;
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

    @Override
    public String toString() {
        return "claseProducto{" + "codigo=" + codigo + ", nombre=" + nombre + ", codTipoProducto=" + codTipoProducto + ", fechaHoraCreacion=" + fechaHoraCreacion + ", fechaHoraModificacion=" + fechaHoraModificacion + '}';
    }
    
    
}
