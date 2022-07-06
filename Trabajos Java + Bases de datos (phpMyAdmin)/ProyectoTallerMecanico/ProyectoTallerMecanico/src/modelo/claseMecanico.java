package modelo;

public class claseMecanico {
    String apellidos;
    int cod_especialidad;
    int identificacion;
    String nombre;

    public claseMecanico() {
    }

    public claseMecanico(String apellidos, int cod_especialidad, int identificacion, String nombre) {
        this.apellidos = apellidos;
        this.cod_especialidad = cod_especialidad;
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCod_especialidad() {
        return cod_especialidad;
    }

    public void setCod_especialidad(int cod_especialidad) {
        this.cod_especialidad = cod_especialidad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
