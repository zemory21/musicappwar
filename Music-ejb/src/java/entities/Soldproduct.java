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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zemor
 */
@Entity
@Table(name = "soldproduct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Soldproduct.findAll", query = "SELECT s FROM Soldproduct s")
    , @NamedQuery(name = "Soldproduct.findById", query = "SELECT s FROM Soldproduct s WHERE s.id = :id")
    , @NamedQuery(name = "Soldproduct.findByName", query = "SELECT s FROM Soldproduct s WHERE s.name = :name")
    , @NamedQuery(name = "Soldproduct.findByDateSale", query = "SELECT s FROM Soldproduct s WHERE s.dateSale = :dateSale")
    , @NamedQuery(name = "Soldproduct.findByCount", query = "SELECT s FROM Soldproduct s WHERE s.count = :count")
    , @NamedQuery(name = "Soldproduct.findBySum", query = "SELECT s FROM Soldproduct s WHERE s.sum = :sum")
    , @NamedQuery(name = "Soldproduct.findByTypeOfService", query = "SELECT s FROM Soldproduct s WHERE s.typeOfService = :typeOfService")
    , @NamedQuery(name = "Soldproduct.findByAppraiser", query = "SELECT s FROM Soldproduct s WHERE s.appraiser = :appraiser")
    , @NamedQuery(name = "Soldproduct.findByEvaluations", query = "SELECT s FROM Soldproduct s WHERE s.evaluations = :evaluations")
    , @NamedQuery(name = "Soldproduct.findByClient", query = "SELECT s FROM Soldproduct s WHERE s.client = :client")})
public class Soldproduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date_Sale")
    @Temporal(TemporalType.DATE)
    private Date dateSale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Count")
    private int count;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Sum")
    private int sum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "TypeOfService")
    private String typeOfService;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Appraiser")
    private int appraiser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "evaluations")
    private String evaluations;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Client")
    private String client;

    public Soldproduct() {
    }

    public Soldproduct(Integer id) {
        this.id = id;
    }

    public Soldproduct(Integer id, String name, Date dateSale, int count, int sum, String typeOfService, int appraiser, String evaluations, String client) {
        this.id = id;
        this.name = name;
        this.dateSale = dateSale;
        this.count = count;
        this.sum = sum;
        this.typeOfService = typeOfService;
        this.appraiser = appraiser;
        this.evaluations = evaluations;
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

    public Date getDateSale() {
        return dateSale;
    }

    public void setDateSale(Date dateSale) {
        this.dateSale = dateSale;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public int getAppraiser() {
        return appraiser;
    }

    public void setAppraiser(int appraiser) {
        this.appraiser = appraiser;
    }

    public String getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(String evaluations) {
        this.evaluations = evaluations;
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
        if (!(object instanceof Soldproduct)) {
            return false;
        }
        Soldproduct other = (Soldproduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Soldproduct[ id=" + id + " ]";
    }
    
}
