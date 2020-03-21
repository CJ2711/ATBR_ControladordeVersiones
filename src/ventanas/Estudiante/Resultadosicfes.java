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
@Table(name = "resultadosicfes", catalog = "atbr_proyecto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Resultadosicfes.findAll", query = "SELECT r FROM Resultadosicfes r")
    , @NamedQuery(name = "Resultadosicfes.findByIdEstudiante", query = "SELECT r FROM Resultadosicfes r WHERE r.idEstudiante = :idEstudiante")
    , @NamedQuery(name = "Resultadosicfes.findByPtMT", query = "SELECT r FROM Resultadosicfes r WHERE r.ptMT = :ptMT")
    , @NamedQuery(name = "Resultadosicfes.findByPtLC", query = "SELECT r FROM Resultadosicfes r WHERE r.ptLC = :ptLC")
    , @NamedQuery(name = "Resultadosicfes.findByPtCN", query = "SELECT r FROM Resultadosicfes r WHERE r.ptCN = :ptCN")
    , @NamedQuery(name = "Resultadosicfes.findByPtCS", query = "SELECT r FROM Resultadosicfes r WHERE r.ptCS = :ptCS")
    , @NamedQuery(name = "Resultadosicfes.findByPtIN", query = "SELECT r FROM Resultadosicfes r WHERE r.ptIN = :ptIN")
    , @NamedQuery(name = "Resultadosicfes.findByPtTotal", query = "SELECT r FROM Resultadosicfes r WHERE r.ptTotal = :ptTotal")})
public class Resultadosicfes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idEstudiante")
    private Integer idEstudiante;
    @Basic(optional = false)
    @Column(name = "ptMT")
    private int ptMT;
    @Basic(optional = false)
    @Column(name = "ptLC")
    private int ptLC;
    @Basic(optional = false)
    @Column(name = "ptCN")
    private int ptCN;
    @Basic(optional = false)
    @Column(name = "ptCS")
    private int ptCS;
    @Basic(optional = false)
    @Column(name = "ptIN")
    private int ptIN;
    @Basic(optional = false)
    @Column(name = "ptTotal")
    private int ptTotal;

    public Resultadosicfes() {
    }

    public Resultadosicfes(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Resultadosicfes(Integer idEstudiante, int ptMT, int ptLC, int ptCN, int ptCS, int ptIN, int ptTotal) {
        this.idEstudiante = idEstudiante;
        this.ptMT = ptMT;
        this.ptLC = ptLC;
        this.ptCN = ptCN;
        this.ptCS = ptCS;
        this.ptIN = ptIN;
        this.ptTotal = ptTotal;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        Integer oldIdEstudiante = this.idEstudiante;
        this.idEstudiante = idEstudiante;
        changeSupport.firePropertyChange("idEstudiante", oldIdEstudiante, idEstudiante);
    }

    public int getPtMT() {
        return ptMT;
    }

    public void setPtMT(int ptMT) {
        int oldPtMT = this.ptMT;
        this.ptMT = ptMT;
        changeSupport.firePropertyChange("ptMT", oldPtMT, ptMT);
    }

    public int getPtLC() {
        return ptLC;
    }

    public void setPtLC(int ptLC) {
        int oldPtLC = this.ptLC;
        this.ptLC = ptLC;
        changeSupport.firePropertyChange("ptLC", oldPtLC, ptLC);
    }

    public int getPtCN() {
        return ptCN;
    }

    public void setPtCN(int ptCN) {
        int oldPtCN = this.ptCN;
        this.ptCN = ptCN;
        changeSupport.firePropertyChange("ptCN", oldPtCN, ptCN);
    }

    public int getPtCS() {
        return ptCS;
    }

    public void setPtCS(int ptCS) {
        int oldPtCS = this.ptCS;
        this.ptCS = ptCS;
        changeSupport.firePropertyChange("ptCS", oldPtCS, ptCS);
    }

    public int getPtIN() {
        return ptIN;
    }

    public void setPtIN(int ptIN) {
        int oldPtIN = this.ptIN;
        this.ptIN = ptIN;
        changeSupport.firePropertyChange("ptIN", oldPtIN, ptIN);
    }

    public int getPtTotal() {
        return ptTotal;
    }

    public void setPtTotal(int ptTotal) {
        int oldPtTotal = this.ptTotal;
        this.ptTotal = ptTotal;
        changeSupport.firePropertyChange("ptTotal", oldPtTotal, ptTotal);
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
        if (!(object instanceof Resultadosicfes)) {
            return false;
        }
        Resultadosicfes other = (Resultadosicfes) object;
        if ((this.idEstudiante == null && other.idEstudiante != null) || (this.idEstudiante != null && !this.idEstudiante.equals(other.idEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ventanas.Estudiante.Resultadosicfes[ idEstudiante=" + idEstudiante + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
