/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Sale;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.SaleFacadeLocal;

/**
 *
 * @author zemor
 */
@Named(value = "saleController")
@SessionScoped
public class saleController implements Serializable {

    @EJB
    private SaleFacadeLocal saleFacade;

    private Sale selectedSale;

    private Sale sale = new Sale();
    private String name;
    private int quantity;
    private int theAmount;
    private String appraiser;
    private String estimation;
    private String client;

    public saleController() {
    }

    public Sale getSelectedSale() {
        return selectedSale;
    }

    public void setSelectedSale(Sale selectedSale) {
        this.selectedSale = selectedSale;
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

    public List<Sale> getAllSale() {
        return this.saleFacade.findAll();
    }

    public void emptyVariables() {
        this.name = "";
        this.quantity = 0;
        this.theAmount = 0;
        this.appraiser = "";
        this.estimation = "";
        this.client = "";
    }

    public String createSale() {
        this.sale.setName(this.name);
        this.sale.setQuantity(this.quantity);
        this.sale.setTheAmount(this.theAmount);
        this.sale.setAppraiser(this.appraiser);
        this.sale.setEstimation(this.estimation);
        this.sale.setClient(this.client);
        this.saleFacade.create(sale);
        emptyVariables();
        return "Sale.xhtml?faces-redirect=true";
    }

    public String UpdateSale(Sale sale) {
        this.saleFacade.edit(sale);
        return "Sale.xhtml?faces-redirect=true";
    }

    public String deleteSale(Sale sale) {
        this.saleFacade.remove(sale);
        return "Sale.xhtml?faces-redirect=true";
    }

}
