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
@Table(name = "receipt_of_goods")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReceiptOfGoods.findAll", query = "SELECT r FROM ReceiptOfGoods r")
    , @NamedQuery(name = "ReceiptOfGoods.findById", query = "SELECT r FROM ReceiptOfGoods r WHERE r.id = :id")
    , @NamedQuery(name = "ReceiptOfGoods.findByProductName", query = "SELECT r FROM ReceiptOfGoods r WHERE r.productName = :productName")
    , @NamedQuery(name = "ReceiptOfGoods.findByTypeOfTool", query = "SELECT r FROM ReceiptOfGoods r WHERE r.typeOfTool = :typeOfTool")
    , @NamedQuery(name = "ReceiptOfGoods.findByDateOfReceipt", query = "SELECT r FROM ReceiptOfGoods r WHERE r.dateOfReceipt = :dateOfReceipt")
    , @NamedQuery(name = "ReceiptOfGoods.findByDocumentNumber", query = "SELECT r FROM ReceiptOfGoods r WHERE r.documentNumber = :documentNumber")
    , @NamedQuery(name = "ReceiptOfGoods.findByProvider", query = "SELECT r FROM ReceiptOfGoods r WHERE r.provider = :provider")
    , @NamedQuery(name = "ReceiptOfGoods.findByQuantity", query = "SELECT r FROM ReceiptOfGoods r WHERE r.quantity = :quantity")
    , @NamedQuery(name = "ReceiptOfGoods.findByTheAmount", query = "SELECT r FROM ReceiptOfGoods r WHERE r.theAmount = :theAmount")})
public class ReceiptOfGoods implements Serializable {

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
    @Column(name = "type_of_tool")
    private int typeOfTool;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_of_receipt")
    @Temporal(TemporalType.DATE)
    private Date dateOfReceipt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "document_number")
    private int documentNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "provider")
    private int provider;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "the_amount")
    private int theAmount;

    public ReceiptOfGoods() {
    }

    public ReceiptOfGoods(Integer id) {
        this.id = id;
    }

    public ReceiptOfGoods(Integer id, String productName, int typeOfTool, Date dateOfReceipt, int documentNumber, int provider, int quantity, int theAmount) {
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

    public int getTypeOfTool() {
        return typeOfTool;
    }

    public void setTypeOfTool(int typeOfTool) {
        this.typeOfTool = typeOfTool;
    }

    public Date getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(Date dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public int getProvider() {
        return provider;
    }

    public void setProvider(int provider) {
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
        if (!(object instanceof ReceiptOfGoods)) {
            return false;
        }
        ReceiptOfGoods other = (ReceiptOfGoods) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ReceiptOfGoods[ id=" + id + " ]";
    }
    
}
