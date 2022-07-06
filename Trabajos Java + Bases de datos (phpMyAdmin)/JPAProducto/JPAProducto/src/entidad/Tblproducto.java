package entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tblproducto")
@NamedQueries({
    @NamedQuery(name = "Tblproducto.findAll", query = "SELECT t FROM Tblproducto t"),
    @NamedQuery(name = "Tblproducto.findByProducto", query = "SELECT t FROM Tblproducto t WHERE t.producto = :producto"),
    @NamedQuery(name = "Tblproducto.findByPiezasCaja", query = "SELECT t FROM Tblproducto t WHERE t.piezasCaja = :piezasCaja"),
    @NamedQuery(name = "Tblproducto.findByPrecioPublico", query = "SELECT t FROM Tblproducto t WHERE t.precioPublico = :precioPublico"),
    @NamedQuery(name = "Tblproducto.findByPreciomayoreo", query = "SELECT t FROM Tblproducto t WHERE t.preciomayoreo = :preciomayoreo"),
    @NamedQuery(name = "Tblproducto.findById", query = "SELECT t FROM Tblproducto t WHERE t.id = :id")})
public class Tblproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "producto")
    private String producto;
    @Basic(optional = false)
    @Column(name = "piezas_caja")
    private int piezasCaja;
    @Basic(optional = false)
    @Column(name = "precio_publico")
    private int precioPublico;
    @Basic(optional = false)
    @Column(name = "Precio_mayoreo")
    private int preciomayoreo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Tblproducto() {
    }

    public Tblproducto(Integer id) {
        this.id = id;
    }

    public Tblproducto(Integer id, String producto, int piezasCaja, int precioPublico, int preciomayoreo) {
        this.id = id;
        this.producto = producto;
        this.piezasCaja = piezasCaja;
        this.precioPublico = precioPublico;
        this.preciomayoreo = preciomayoreo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPiezasCaja() {
        return piezasCaja;
    }

    public void setPiezasCaja(int piezasCaja) {
        this.piezasCaja = piezasCaja;
    }

    public int getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(int precioPublico) {
        this.precioPublico = precioPublico;
    }

    public int getPreciomayoreo() {
        return preciomayoreo;
    }

    public void setPreciomayoreo(int preciomayoreo) {
        this.preciomayoreo = preciomayoreo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblproducto)) {
            return false;
        }
        Tblproducto other = (Tblproducto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto: "+ producto + ", Piezas x Caja:" + piezasCaja;
    }
    
}
