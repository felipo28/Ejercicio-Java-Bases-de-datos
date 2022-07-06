package modelo;

public class claseOrdenReparacion {
    int concecutivo;
    String fechaIngreso;
    String fechaSalida;
    String horaIngreso;
    String horaSalida;
    String placa;
    int cod_mecanico;

    public claseOrdenReparacion() {
    }

    public claseOrdenReparacion(int concecutivo, String fechaIngreso, String fechaSalida, String horaIngreso, String horaSalida, String placa, int cod_mecanico) {
        this.concecutivo = concecutivo;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.placa = placa;
        this.cod_mecanico = cod_mecanico;
    }

    public int getConcecutivo() {
        return concecutivo;
    }

    public void setConcecutivo(int concecutivo) {
        this.concecutivo = concecutivo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCod_mecanico() {
        return cod_mecanico;
    }

    public void setCod_mecanico(int cod_mecanico) {
        this.cod_mecanico = cod_mecanico;
    }
    
}
