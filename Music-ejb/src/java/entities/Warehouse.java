/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zemor
 */
@Entity
@Table(name = "warehouse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Warehouse.findAll", query = "SELECT w FROM Warehouse w")
    , @NamedQuery(name = "Warehouse.findById", query = "SELECT w FROM Warehouse w WHERE w.id = :id")
    , @NamedQuery(name = "Warehouse.findByNameProduct", query = "SELECT w FROM Warehouse w WHERE w.nameProduct = :nameProduct")
    , @NamedQuery(name = "Warehouse.findByManufacturers", query = "SELECT w FROM Warehouse w WHERE w.manufacturers = :manufacturers")
    , @NamedQuery(name = "Warehouse.findByDateOfReceipt", query = "SELECT w FROM Warehouse w WHERE w.dateOfReceipt = :dateOfReceipt")})
public class Warehouse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "name_product")
    private int nameProduct;
    @Basic(optional = false)
    @NotNull
    @Column(name = "manufacturers")
    private int manufacturers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_of_receipt")
    @Temporal(TemporalType.DATE)
    private Date dateOfReceipt;

    public Warehouse() {
    }

    public Warehouse(Integer id) {
        this.id = id;
    }

    public Warehouse(Integer id, int nameProduct, int manufacturers, Date dateOfReceipt) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.manufacturers = manufacturers;
        this.dateOfReceipt = dateOfReceipt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(int nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(int manufacturers) {
        this.manufacturers = manufacturers;
    }

    public Date getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(Date dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
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
        if (!(object instanceof Warehouse)) {
            return false;
        }
        Warehouse other = (Warehouse) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Warehouse[ id=" + id + " ]";
    }
    
}
