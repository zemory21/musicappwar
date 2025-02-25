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
@Table(name = "provider")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Provider.findAll", query = "SELECT p FROM Provider p")
    , @NamedQuery(name = "Provider.findById", query = "SELECT p FROM Provider p WHERE p.id = :id")
    , @NamedQuery(name = "Provider.findByName", query = "SELECT p FROM Provider p WHERE p.name = :name")
    , @NamedQuery(name = "Provider.findByCity", query = "SELECT p FROM Provider p WHERE p.city = :city")
    , @NamedQuery(name = "Provider.findByStreet", query = "SELECT p FROM Provider p WHERE p.street = :street")
    , @NamedQuery(name = "Provider.findByHome", query = "SELECT p FROM Provider p WHERE p.home = :home")
    , @NamedQuery(name = "Provider.findByLiter", query = "SELECT p FROM Provider p WHERE p.liter = :liter")
    , @NamedQuery(name = "Provider.findByInn", query = "SELECT p FROM Provider p WHERE p.inn = :inn")
    , @NamedQuery(name = "Provider.findByKpp", query = "SELECT p FROM Provider p WHERE p.kpp = :kpp")})
public class Provider implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 110)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 110)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 110)
    @Column(name = "Street")
    private String street;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Home")
    private int home;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "Liter")
    private String liter;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "Inn")
    private String inn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "KPP")
    private String kpp;

    public Provider() {
    }

    public Provider(Integer id) {
        this.id = id;
    }

    public Provider(Integer id, String name, String city, String street, int home, String liter, String inn, String kpp) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.street = street;
        this.home = home;
        this.liter = liter;
        this.inn = inn;
        this.kpp = kpp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
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
        if (!(object instanceof Provider)) {
            return false;
        }
        Provider other = (Provider) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Provider[ id=" + id + " ]";
    }
    
}
