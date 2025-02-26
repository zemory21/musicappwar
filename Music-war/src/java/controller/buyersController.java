/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Appraiser;
import entities.Buyers;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.BuyersFacadeLocal;

/**
 *
 * @author zemor
 */
@Named(value = "buyersController")
@SessionScoped
public class buyersController implements Serializable {

    @EJB
    private BuyersFacadeLocal buyersFacade;
    
    private Buyers selectedBuyers;
    
    private Buyers buyers = new Buyers();
    private String lastName;
    private String firstName;
    private String surName;
    private String phoneNumber;
    
    public buyersController() {
        
    }

    public Buyers getSelectedBuyers() {
        return selectedBuyers;
    }

    public void setSelectedBuyers(Buyers selectedBuyers) {
        this.selectedBuyers = selectedBuyers;
    }

    public Buyers getBuyers() {
        return buyers;
    }

    public void setBuyers(Buyers buyers) {
        this.buyers = buyers;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public List<Buyers> getAllBuyers() {
        return this.buyersFacade.findAll();
    }

    public void emptyVariables() {
        this.lastName = "";
        this.firstName = "";
        this.surName = "";
        this.phoneNumber = "";
    }
    public String createBuyers() {
        this.buyers.setLastName(this.lastName);
        this.buyers.setFirstName(this.firstName);
        this.buyers.setSurName(this.surName);
        this.buyers.setPhoneNumber(this.phoneNumber);
        this.buyersFacade.create(this.buyers);
        emptyVariables();
        return "Buyers.xhtml?faces-redirect=true";
    }
    
    public String updateBuyers(Buyers buyers) {
        this.buyersFacade.edit(buyers);
        return "Buyers.xhtml?faces-redirect=true";
    }

    public String deleteBuyers(Buyers buyers) {
        this.buyersFacade.remove(buyers);
        return "Buyers.xhtml?faces-redirect=true";
    }
}
