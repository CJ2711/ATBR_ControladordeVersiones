/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import BD.Conexion;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.swing.JOptionPane;
import static ventanas.Inicio.password;
import static ventanas.Inicio.username;

/**
 *
 * @author cricr
 */
@Entity
@Table(name = "m_materia", catalog = "atbr_proyecto", schema = "")
@NamedQueries({
    @NamedQuery(name = "MMateria.findAll", query = "SELECT m FROM MMateria m")
    , @NamedQuery(name = "MMateria.findByNombre", query = "SELECT m FROM MMateria m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "MMateria.findByIdMateria", query = "SELECT m FROM MMateria m WHERE m.idMateria = :idMateria")
    , @NamedQuery(name = "MMateria.findByIdProfesor", query = "SELECT m FROM MMateria m WHERE m.idProfesor = :idProfesor")
    , @NamedQuery(name = "MMateria.findByPeso", query = "SELECT m FROM MMateria m WHERE m.peso = :peso")})
public class MMateria implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Id
    @Basic(optional = false)
    @Column(name = "idMateria")
    private Integer idMateria;
    @Basic(optional = false)
    @Column(name = "idProfesor")
    private int idProfesor;
    @Basic(optional = false)
    @Column(name = "peso")
    private int peso;

    public MMateria() {
    }

    public MMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public MMateria(Integer idMateria, String nombre, int idProfesor, int peso) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.idProfesor = idProfesor;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        Integer oldIdMateria = this.idMateria;
        this.idMateria = idMateria;
        changeSupport.firePropertyChange("idMateria", oldIdMateria, idMateria);
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        int oldIdProfesor = this.idProfesor;
        this.idProfesor = idProfesor;
        changeSupport.firePropertyChange("idProfesor", oldIdProfesor, idProfesor);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        int oldPeso = this.peso;
        this.peso = peso;
        changeSupport.firePropertyChange("peso", oldPeso, peso);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateria != null ? idMateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MMateria)) {
            return false;
        }
        MMateria other = (MMateria) object;
        if ((this.idMateria == null && other.idMateria != null) || (this.idMateria != null && !this.idMateria.equals(other.idMateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        // return "ventanas.MMateria[ idMateria=" + idMateria + " ]";
        try {
            //Conexion BD
            Connection cn = Conexion.conectar();
            /*sentencia SQL para buscar en la tabla 'Usuario' el 'rol' que 
                * tiene el usuario y su contraseña.
             */
            PreparedStatement pst = cn.prepareStatement(
                    "SELECT nombre FROM `m_materia` WHERE idMateria =" + idMateria);
            //Ejecutar la Sentencia SQL con el Objeto ResultSet:
            ResultSet rs = pst.executeQuery();
            //Datos validos:
            if (rs.next()) {
                String s = rs.getNString("nombre"); //Guarda resultado del nombre de la materia.
                String sal = "[ " + idMateria + " ] - " + s;
                return sal;
            }
        } catch (SQLException e) {
            System.err.println("Error en la BD");
        }
        
        return null;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
