/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author zemor
 */
@Named(value = "templateController")
@Dependent
public class templateController {

    public templateController() {
    }
    
    public String City(){
        return "City.xhtml?faces-redirect=true";
    }
    public String Appraiser(){
        return "Appraiser.xhtml?faces-redirect=true";
    }
    public String Sale(){
        return "Sale.xhtml?faces-redirect=true";
    }
    
    public String Buyers(){
        return "Buyers.xhtml?faces-redirect=true";
    }
    
    public String Client(){
        return "Client.xhtml?faces-redirect=true";
    }
    
    public String Receipt(){
        return "Receipt.xhtml?faces-redirect=true";
    }
    
    public String Registration(){
        return "Registration.xhtml?faces-redirect=true";
    }
    
    public String Index(){
        return "index.xhtml?faces-redirect=true";
    }
    
}
