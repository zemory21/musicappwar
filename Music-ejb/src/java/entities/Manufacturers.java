/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zemor
 */
@Entity
@Table(name = "manufacturers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Manufacturers.findAll", query = "SELECT m FROM Manufacturers m")
    , @NamedQuery(name = "Manufacturers.findById", query = "SELECT m FROM Manufacturers m WHERE m.id = :id")
    , @NamedQuery(name = "Manufacturers.findByManufacturer", query = "SELECT m FROM Manufacturers m WHERE m.manufacturer = :manufacturer")
    , @NamedQuery(name = "Manufacturers.findByCity", query = "SELECT m FROM Manufacturers m WHERE m.city = :city")
    , @NamedQuery(name = "Manufacturers.findByStreet", query = "SELECT m FROM Manufacturers m WHERE m.street = :street")
    , @NamedQuery(name = "Manufacturers.findByHome", query = "SELECT m FROM Manufacturers m WHERE m.home = :home")
    , @NamedQuery(name = "Manufacturers.findByLiter", query = "SELECT m FROM Manufacturers m WHERE m.liter = :liter")
    , @NamedQuery(name = "Manufacturers.findByInn", query = "SELECT m FROM Manufacturers m WHERE m.inn = :inn")
    , @NamedQuery(name = "Manufacturers.findByCheckpoint", query = "SELECT m FROM Manufacturers m WHERE m.checkpoint = :checkpoint")})
public class Manufacturers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "manufacturer")
    private String manufacturer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 110)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 110)
    @Column(name = "street")
    private String street;
    @Basic(optional = false)
    @NotNull
    @Column(name = "home")
    private int home;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 110)
    @Column(name = "liter")
    private String liter;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "inn")
    private String inn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "checkpoint")
    private String checkpoint;

    public Manufacturers() {
    }

    public Manufacturers(Integer id) {
        this.id = id;
    }

    public Manufacturers(Integer id, String manufacturer, String city, String street, int home, String liter, String inn, String checkpoint) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.city = city;
        this.street = street;
        this.home = home;
        this.liter = liter;
        this.inn = inn;
        this.checkpoint = checkpoint;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public String getLiter() {
        return liter;
    }

    public void setLiter(String liter) {
        this.liter = liter;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
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
        if (!(object instanceof Manufacturers)) {
            return false;
        }
        Manufacturers other = (Manufacturers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Manufacturers[ id=" + id + " ]";
    }
    
}
