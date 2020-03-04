/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

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
@Table(name = "m_estudiante", catalog = "atbr_proyecto", schema = "")
@NamedQueries({
    @NamedQuery(name = "MEstudiante.findAll", query = "SELECT m FROM MEstudiante m")
    , @NamedQuery(name = "MEstudiante.findByIdEstudiante", query = "SELECT m FROM MEstudiante m WHERE m.idEstudiante = :idEstudiante")
    , @NamedQuery(name = "MEstudiante.findByCodigoPrograma", query = "SELECT m FROM MEstudiante m WHERE m.codigoPrograma = :codigoPrograma")
    , @NamedQuery(name = "MEstudiante.findByNombre", query = "SELECT m FROM MEstudiante m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "MEstudiante.findByApellido", query = "SELECT m FROM MEstudiante m WHERE m.apellido = :apellido")
    , @NamedQuery(name = "MEstudiante.findByPassword", query = "SELECT m FROM MEstudiante m WHERE m.password = :password")})
public class MEstudiante implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idEstudiante")
    private Integer idEstudiante;
    @Basic(optional = false)
    @Column(name = "codigoPrograma")
    private int codigoPrograma;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public MEstudiante() {
    }

    public MEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public MEstudiante(Integer idEstudiante, int codigoPrograma, String nombre, String apellido, String password) {
        this.idEstudiante = idEstudiante;
        this.codigoPrograma = codigoPrograma;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        Integer oldIdEstudiante = this.idEstudiante;
        this.idEstudiante = idEstudiante;
        changeSupport.firePropertyChange("idEstudiante", oldIdEstudiante, idEstudiante);
    }

    public int getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(int codigoPrograma) {
        int oldCodigoPrograma = this.codigoPrograma;
        this.codigoPrograma = codigoPrograma;
        changeSupport.firePropertyChange("codigoPrograma", oldCodigoPrograma, codigoPrograma);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        String oldApellido = this.apellido;
        this.apellido = apellido;
        changeSupport.firePropertyChange("apellido", oldApellido, apellido);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
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
        if (!(object instanceof MEstudiante)) {
            return false;
        }
        MEstudiante other = (MEstudiante) object;
        if ((this.idEstudiante == null && other.idEstudiante != null) || (this.idEstudiante != null && !this.idEstudiante.equals(other.idEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ventanas.newpackagePROFESORES.MEstudiante[ idEstudiante=" + idEstudiante + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
