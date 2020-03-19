/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.newpackagePROFESORES;

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
 * @author cricr
 */
@Entity
@Table(name = "notase", catalog = "atbr_proyecto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Notase.findAll", query = "SELECT n FROM Notase n")
    , @NamedQuery(name = "Notase.findByIdEstudiante", query = "SELECT n FROM Notase n WHERE n.idEstudiante = :idEstudiante")
    , @NamedQuery(name = "Notase.findByNota1", query = "SELECT n FROM Notase n WHERE n.nota1 = :nota1")
    , @NamedQuery(name = "Notase.findByNota2", query = "SELECT n FROM Notase n WHERE n.nota2 = :nota2")
    , @NamedQuery(name = "Notase.findByNota3", query = "SELECT n FROM Notase n WHERE n.nota3 = :nota3")})
public class Notase implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idEstudiante")
    private Integer idEstudiante;
    @Basic(optional = false)
    @Column(name = "nota1")
    private float nota1;
    @Basic(optional = false)
    @Column(name = "nota2")
    private float nota2;
    @Basic(optional = false)
    @Column(name = "nota3")
    private float nota3;

    public Notase() {
    }

    public Notase(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Notase(Integer idEstudiante, float nota1, float nota2, float nota3) {
        this.idEstudiante = idEstudiante;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        Integer oldIdEstudiante = this.idEstudiante;
        this.idEstudiante = idEstudiante;
        changeSupport.firePropertyChange("idEstudiante", oldIdEstudiante, idEstudiante);
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        float oldNota1 = this.nota1;
        this.nota1 = nota1;
        changeSupport.firePropertyChange("nota1", oldNota1, nota1);
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        float oldNota2 = this.nota2;
        this.nota2 = nota2;
        changeSupport.firePropertyChange("nota2", oldNota2, nota2);
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        float oldNota3 = this.nota3;
        this.nota3 = nota3;
        changeSupport.firePropertyChange("nota3", oldNota3, nota3);
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
        if (!(object instanceof Notase)) {
            return false;
        }
        Notase other = (Notase) object;
        if ((this.idEstudiante == null && other.idEstudiante != null) || (this.idEstudiante != null && !this.idEstudiante.equals(other.idEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ventanas.newpackagePROFESORES.Notase[ idEstudiante=" + idEstudiante + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
