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
@Table(name = "appraiser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appraiser.findAll", query = "SELECT a FROM Appraiser a")
    , @NamedQuery(name = "Appraiser.findById", query = "SELECT a FROM Appraiser a WHERE a.id = :id")
    , @NamedQuery(name = "Appraiser.findByLastName", query = "SELECT a FROM Appraiser a WHERE a.lastName = :lastName")
    , @NamedQuery(name = "Appraiser.findByFirstName", query = "SELECT a FROM Appraiser a WHERE a.firstName = :firstName")
    , @NamedQuery(name = "Appraiser.findBySurName", query = "SELECT a FROM Appraiser a WHERE a.surName = :surName")
    , @NamedQuery(name = "Appraiser.findByPassportData", query = "SELECT a FROM Appraiser a WHERE a.passportData = :passportData")})
public class Appraiser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "sur_name")
    private String surName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "passport_data")
    private int passportData;

    public Appraiser() {
    }

    public Appraiser(Integer id) {
        this.id = id;
    }

    public Appraiser(Integer id, String lastName, String firstName, String surName, int passportData) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.passportData = passportData;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPassportData() {
        return passportData;
    }

    public void setPassportData(int passportData) {
        this.passportData = passportData;
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
        if (!(object instanceof Appraiser)) {
            return false;
        }
        Appraiser other = (Appraiser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Appraiser[ id=" + id + " ]";
    }
    
}
