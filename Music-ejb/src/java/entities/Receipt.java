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
@Table(name = "receipt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Receipt.findAll", query = "SELECT r FROM Receipt r")
    , @NamedQuery(name = "Receipt.findById", query = "SELECT r FROM Receipt r WHERE r.id = :id")
    , @NamedQuery(name = "Receipt.findByProductName", query = "SELECT r FROM Receipt r WHERE r.productName = :productName")
    , @NamedQuery(name = "Receipt.findByTypeOfTool", query = "SELECT r FROM Receipt r WHERE r.typeOfTool = :typeOfTool")
    , @NamedQuery(name = "Receipt.findByDateOfReceipt", query = "SELECT r FROM Receipt r WHERE r.dateOfReceipt = :dateOfReceipt")
    , @NamedQuery(name = "Receipt.findByDocumentNumber", query = "SELECT r FROM Receipt r WHERE r.documentNumber = :documentNumber")
    , @NamedQuery(name = "Receipt.findByProvider", query = "SELECT r FROM Receipt r WHERE r.provider = :provider")
    , @NamedQuery(name = "Receipt.findByQuantity", query = "SELECT r FROM Receipt r WHERE r.quantity = :quantity")
    , @NamedQuery(name = "Receipt.findByTheAmount", query = "SELECT r FROM Receipt r WHERE r.theAmount = :theAmount")})
public class Receipt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "product_name")
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "type_of_tool")
    private String typeOfTool;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "date_of_receipt")
    private String dateOfReceipt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "document_number")
    private int documentNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "provider")
    private String provider;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "the_amount")
    private int theAmount;

    public Receipt() {
    }

    public Receipt(Integer id) {
        this.id = id;
    }

    public Receipt(Integer id, String productName, String typeOfTool, String dateOfReceipt, int documentNumber, String provider, int quantity, int theAmount) {
        this.id = id;
        this.productName = productName;
        this.typeOfTool = typeOfTool;
        this.dateOfReceipt = dateOfReceipt;
        this.documentNumber = documentNumber;
        this.provider = provider;
        this.quantity = quantity;
        this.theAmount = theAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTypeOfTool() {
        return typeOfTool;
    }

    public void setTypeOfTool(String typeOfTool) {
        this.typeOfTool = typeOfTool;
    }

    public String getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(String dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receipt)) {
            return false;
        }
        Receipt other = (Receipt) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Receipt[ id=" + id + " ]";
    }
    
}
