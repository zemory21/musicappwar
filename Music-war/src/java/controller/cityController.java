/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Cities;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import sessionbean.CitiesFacadeLocal;

/**
 *
 * @author zemor
 */
@Named(value = "cityController")
@SessionScoped
public class cityController implements Serializable{

    @EJB
    private CitiesFacadeLocal citiesFacade;
    
    private Cities selectedCity;
    
    private Cities city = new Cities();
    private String nameCity;
    
    public cityController() {
    }

    public Cities getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(Cities selectedCity) {
        this.selectedCity = selectedCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }
    
    public List<Cities> getAllCity(){
        return this.citiesFacade.findAll();
    }
    
    public void emptyVariables(){
        this.nameCity = "";
    }
  
    public String createCity(){
        this.city.setCity(this.nameCity);
        this.citiesFacade.create(city);
        emptyVariables();
        return "City.xhtml?faces-redirect=true";
    }
    
    public String updateCity(Cities city){
        this.citiesFacade.edit(city);
        return "City.xhtml?faces-redirect=true";
    }
    
    public String deleteCity(Cities city){
        this.citiesFacade.remove(city);
        return "City.xhtml?faces-redirect=true";
    }
}
