/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Buyers;
import entities.Client;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.ClientFacadeLocal;

/**
 *
 * @author zemor
 */
@Named(value = "clientController")
@SessionScoped
public class clientController implements Serializable {

    @EJB
    private ClientFacadeLocal clientFacade;
    
    private Client selectedClient;
    
    private Client client = new Client();
    private String lastName;
    private String firstName;
    private String surName;
    private String phoneNumber;
    
    public clientController() {
    }

    public Client getSelectedClient() {
        return selectedClient;
    }

    public void setSelectedClient(Client selectedClient) {
        this.selectedClient = selectedClient;
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
    
    public List<Client> getAllClient() {
        return this.clientFacade.findAll();
    }

    public void emptyVariables() {
        this.lastName = "";
        this.firstName = "";
        this.surName = "";
        this.phoneNumber = "";
    }
    public String createClient() {
        this.client.setLastName(this.lastName);
        this.client.setFirstName(this.firstName);
        this.client.setSurName(this.surName);
        this.client.setPhoneNumber(this.phoneNumber);
        this.clientFacade.create(this.client);
        emptyVariables();
        return "Client.xhtml?faces-redirect=true";
    }
    
    public String updateClient(Client client) {
        this.clientFacade.edit(client);
        return "Client.xhtml?faces-redirect=true";
    }

    public String deleteClient(Client client) {
        this.clientFacade.remove(client);
        return "Client.xhtml?faces-redirect=true";
    }
    
}
