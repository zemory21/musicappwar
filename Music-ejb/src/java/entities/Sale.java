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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zemor
 */
@Entity
@Table(name = "sale")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sale.findAll", query = "SELECT s FROM Sale s")
    , @NamedQuery(name = "Sale.findById", query = "SELECT s FROM Sale s WHERE s.id = :id")
    , @NamedQuery(name = "Sale.findByName", query = "SELECT s FROM Sale s WHERE s.name = :name")
    , @NamedQuery(name = "Sale.findByQuantity", query = "SELECT s FROM Sale s WHERE s.quantity = :quantity")
    , @NamedQuery(name = "Sale.findByTheAmount", query = "SELECT s FROM Sale s WHERE s.theAmount = :theAmount")
    , @NamedQuery(name = "Sale.findByTypeOfService", query = "SELECT s FROM Sale s WHERE s.typeOfService = :typeOfService")
    , @NamedQuery(name = "Sale.findByAppraiser", query = "SELECT s FROM Sale s WHERE s.appraiser = :appraiser")
    , @NamedQuery(name = "Sale.findByEstimation", query = "SELECT s FROM Sale s WHERE s.estimation = :estimation")
    , @NamedQuery(name = "Sale.findByClient", query = "SELECT s FROM Sale s WHERE s.client = :client")})
public class Sale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "the_amount")
    private int theAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type_of_service")
    private String typeOfService;
    @Basic(optional = false)
    @NotNull
    @Column(name = "appraiser")
    private String appraiser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estimation")
    private String estimation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "client")
    private String client;

    public Sale() {
    }

    public Sale(Integer id) {
        this.id = id;
    }

    public Sale(Integer id, String name, int quantity, int theAmount, String typeOfService, String appraiser, String estimation, String client) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.theAmount = theAmount;
        this.typeOfService = typeOfService;
        this.appraiser = appraiser;
        this.estimation = estimation;
        this.client = client;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTheAmount() {
        return theAmount;
    }

    public void setTheAmount(int theAmount) {
        this.theAmount = theAmount;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public String getAppraiser() {
        return appraiser;
    }

    public void setAppraiser(String appraiser) {
        this.appraiser = appraiser;
    }

    public String getEstimation() {
        return estimation;
    }

    public void setEstimation(String estimation) {
        this.estimation = estimation;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
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
        if (!(object instanceof Sale)) {
            return false;
        }
        Sale other = (Sale) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sale[ id=" + id + " ]";
    }
    
}
