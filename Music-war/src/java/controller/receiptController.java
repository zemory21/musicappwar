/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Receipt;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.ReceiptFacadeLocal;

/**
 *
 * @author zemor
 */
@Named(value = "receiptController")
@SessionScoped
public class receiptController implements Serializable {

    @EJB
    private ReceiptFacadeLocal receiptFacade;

    private Receipt selectedReceipt;

    private Receipt receipt = new Receipt();
    private String nameProduct;
    private String typeOfTool;
    private String dateOfReceipt;
    private int documentNumber;
    private String provider;
    private int quantity;
    private int theAmount;

    public receiptController() {
    }

    public Receipt getSelectedReceipt() {
        return selectedReceipt;
    }

    public void setSelectedReceipt(Receipt selectedReceipt) {
        this.selectedReceipt = selectedReceipt;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
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

    public void emptyVariables() {
        this.nameProduct = "";
        this.typeOfTool = "";
        this.dateOfReceipt = "";
        this.documentNumber = 0;
        this.provider = "";
        this.quantity = 0;
        this.theAmount = 0;
    }

    public List<Receipt> getAllReceipt() {
        return this.receiptFacade.findAll();
    }

    public String createReceipt() {
        this.receipt.setProductName(this.nameProduct);
        this.receipt.setTypeOfTool(this.typeOfTool);
        this.receipt.setDateOfReceipt(this.dateOfReceipt);
        this.receipt.setDocumentNumber(this.documentNumber);
        this.receipt.setProvider(this.provider);
        this.receipt.setQuantity(this.quantity);
        this.receipt.setTheAmount(this.theAmount);
        this.receiptFacade.create(this.receipt);
        emptyVariables();
        return "Receipt.xhtml?faces-redirect=true";
    }

    public String updateReceipt(Receipt receipt) {
        this.receiptFacade.edit(receipt);
        return "Receipt.xhtml?faces-redirect=true";
    }

    public String deleteReceipt(Receipt receipt) {
        this.receiptFacade.remove(receipt);
        return "Receipt.xhtml?faces-redirect=true";
    }

}
