package modelo;

public class claseVehiculo {
    String color;
    int idCliente;
    int codMarca;
    int modelo;
    String placa;
    String nombre_cliente;
    String nombre_marca;
    

    public claseVehiculo() {
    }

    public claseVehiculo(String color, int idCliente, int codMarca, int modelo, String placa, String nombre_cliente, String nombre_marca) {
        this.color = color;
        this.idCliente = idCliente;
        this.codMarca = codMarca;
        this.modelo = modelo;
        this.placa = placa;
        this.nombre_cliente = nombre_cliente;
        this.nombre_marca = nombre_marca;
    }


    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}
