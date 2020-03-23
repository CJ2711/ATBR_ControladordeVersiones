/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.Estudiante;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Francisco
 */
@Entity
@Table(name = "tabladetalle", catalog = "atbr_proyecto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tabladetalle.findAll", query = "SELECT t FROM Tabladetalle t")
    , @NamedQuery(name = "Tabladetalle.findByIdEstudiante", query = "SELECT t FROM Tabladetalle t WHERE t.idEstudiante = :idEstudiante")
    , @NamedQuery(name = "Tabladetalle.findByDetalle1", query = "SELECT t FROM Tabladetalle t WHERE t.detalle1 = :detalle1")
    , @NamedQuery(name = "Tabladetalle.findByDetalle2", query = "SELECT t FROM Tabladetalle t WHERE t.detalle2 = :detalle2")
    , @NamedQuery(name = "Tabladetalle.findByDetalle3", query = "SELECT t FROM Tabladetalle t WHERE t.detalle3 = :detalle3")})
public class Tabladetalle implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idEstudiante")
    private Integer idEstudiante;
    @Basic(optional = false)
    @Column(name = "detalle1")
    private String detalle1;
    @Basic(optional = false)
    @Column(name = "detalle2")
    private String detalle2;
    @Basic(optional = false)
    @Column(name = "detalle3")
    private String detalle3;

    public Tabladetalle() {
    }

    public Tabladetalle(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Tabladetalle(Integer idEstudiante, String detalle1, String detalle2, String detalle3) {
        this.idEstudiante = idEstudiante;
        this.detalle1 = detalle1;
        this.detalle2 = detalle2;
        this.detalle3 = detalle3;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        Integer oldIdEstudiante = this.idEstudiante;
        this.idEstudiante = idEstudiante;
        changeSupport.firePropertyChange("idEstudiante", oldIdEstudiante, idEstudiante);
    }

    public String getDetalle1() {
        return detalle1;
    }

    public void setDetalle1(String detalle1) {
        String oldDetalle1 = this.detalle1;
        this.detalle1 = detalle1;
        changeSupport.firePropertyChange("detalle1", oldDetalle1, detalle1);
    }

    public String getDetalle2() {
        return detalle2;
    }

    public void setDetalle2(String detalle2) {
        String oldDetalle2 = this.detalle2;
        this.detalle2 = detalle2;
        changeSupport.firePropertyChange("detalle2", oldDetalle2, detalle2);
    }

    public String getDetalle3() {
        return detalle3;
    }

    public void setDetalle3(String detalle3) {
        String oldDetalle3 = this.detalle3;
        this.detalle3 = detalle3;
        changeSupport.firePropertyChange("detalle3", oldDetalle3, detalle3);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstudiante != null ? idEstudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabladetalle)) {
            return false;
        }
        Tabladetalle other = (Tabladetalle) object;
        if ((this.idEstudiante == null && other.idEstudiante != null) || (this.idEstudiante != null && !this.idEstudiante.equals(other.idEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ventanas.Estudiante.Tabladetalle[ idEstudiante=" + idEstudiante + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
