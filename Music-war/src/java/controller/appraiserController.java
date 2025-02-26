/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Appraiser;
import entities.Sale;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.AppraiserFacadeLocal;

/**
 *
 * @author zemor
 */
@Named(value = "appraiserController")
@SessionScoped
public class appraiserController implements Serializable {

    @EJB
    private AppraiserFacadeLocal appraiserFacade;

    private Appraiser selectedAppraiser;

    private Appraiser appraiser = new Appraiser();
    private String lastName;
    private String firstName;
    private String surName;
    private int passportData;

    public appraiserController() {
    }

    public Appraiser getSelectedAppraiser() {
        return selectedAppraiser;
    }

    public void setSelectedAppraiser(Appraiser selectedAppraiser) {
        this.selectedAppraiser = selectedAppraiser;
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

    public List<Appraiser> getAllAppraiser() {
        return this.appraiserFacade.findAll();
    }

    public void emptyVariables() {
        this.lastName = "";
        this.firstName = "";
        this.surName = "";
        this.passportData = 0;
    }

    public String createAppraiser() {
        this.appraiser.setLastName(this.lastName);
        this.appraiser.setFirstName(this.firstName);
        this.appraiser.setSurName(this.surName);
        this.appraiser.setPassportData(this.passportData);
        this.appraiserFacade.create(this.appraiser);
        emptyVariables();
        return "Appraiser.xhtml?faces-redirect=true";
    }

    public String updateAppraiser(Appraiser appraiser) {
        this.appraiserFacade.edit(appraiser);
        return "Appraiser.xhtml?faces-redirect=true";
    }

    public String deleteAppraiser(Appraiser appraiser) {
        this.appraiserFacade.remove(appraiser);
        return "Appraiser.xhtml?faces-redirect=true";
    }

}
