package modelo;

public class claseDetalle {
    private int consecutivo;
    private int numFactura;
    private int codProducto;
    private int cantidad;
    private double vlrUnitario;

    public claseDetalle() {
    }

    public claseDetalle(int consecutivo, int numFactura, int codProducto, int cantidad, double vlrUnitario) {
        this.consecutivo = consecutivo;
        this.numFactura = numFactura;
        this.codProducto = codProducto;
        this.cantidad = cantidad;
        this.vlrUnitario = vlrUnitario;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getVlrUnitario() {
        return vlrUnitario;
    }

    public void setVlrUnitario(double vlrUnitario) {
        this.vlrUnitario = vlrUnitario;
    }
    
    
}
