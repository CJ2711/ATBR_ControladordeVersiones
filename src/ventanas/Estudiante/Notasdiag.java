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
 * @author Alejandro
 */
@Entity
@Table(name = "notasdiag", catalog = "atbr_proyecto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Notasdiag.findAll", query = "SELECT n FROM Notasdiag n")
    , @NamedQuery(name = "Notasdiag.findByIdEstudiante", query = "SELECT n FROM Notasdiag n WHERE n.idEstudiante = :idEstudiante")
    , @NamedQuery(name = "Notasdiag.findByNotaD1", query = "SELECT n FROM Notasdiag n WHERE n.notaD1 = :notaD1")
    , @NamedQuery(name = "Notasdiag.findByNotaD2", query = "SELECT n FROM Notasdiag n WHERE n.notaD2 = :notaD2")
    , @NamedQuery(name = "Notasdiag.findByNotaD3", query = "SELECT n FROM Notasdiag n WHERE n.notaD3 = :notaD3")})
public class Notasdiag implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idEstudiante")
    private Integer idEstudiante;
    @Basic(optional = false)
    @Column(name = "notaD1")
    private float notaD1;
    @Basic(optional = false)
    @Column(name = "notaD2")
    private float notaD2;
    @Basic(optional = false)
    @Column(name = "notaD3")
    private float notaD3;

    public Notasdiag() {
    }

    public Notasdiag(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Notasdiag(Integer idEstudiante, float notaD1, float notaD2, float notaD3) {
        this.idEstudiante = idEstudiante;
        this.notaD1 = notaD1;
        this.notaD2 = notaD2;
        this.notaD3 = notaD3;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        Integer oldIdEstudiante = this.idEstudiante;
        this.idEstudiante = idEstudiante;
        changeSupport.firePropertyChange("idEstudiante", oldIdEstudiante, idEstudiante);
    }

    public float getNotaD1() {
        return notaD1;
    }

    public void setNotaD1(float notaD1) {
        float oldNotaD1 = this.notaD1;
        this.notaD1 = notaD1;
        changeSupport.firePropertyChange("notaD1", oldNotaD1, notaD1);
    }

    public float getNotaD2() {
        return notaD2;
    }

    public void setNotaD2(float notaD2) {
        float oldNotaD2 = this.notaD2;
        this.notaD2 = notaD2;
        changeSupport.firePropertyChange("notaD2", oldNotaD2, notaD2);
    }

    public float getNotaD3() {
        return notaD3;
    }

    public void setNotaD3(float notaD3) {
        float oldNotaD3 = this.notaD3;
        this.notaD3 = notaD3;
        changeSupport.firePropertyChange("notaD3", oldNotaD3, notaD3);
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
        if (!(object instanceof Notasdiag)) {
            return false;
        }
        Notasdiag other = (Notasdiag) object;
        if ((this.idEstudiante == null && other.idEstudiante != null) || (this.idEstudiante != null && !this.idEstudiante.equals(other.idEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ventanas.Estudiante.Notasdiag[ idEstudiante=" + idEstudiante + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
