/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Users;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.UsersFacadeLocal;

/**
 *
 * @author zemor
 */
@Named(value = "regController")
@SessionScoped
public class regController implements Serializable {

    @EJB
    private UsersFacadeLocal usersFacade;
    
    private Users selectedUsers;
    
    private Users user = new Users();
    private String lastName;
    private String firstName;
    private String surName;
    private String adress;
    private String password;
    private String email;
    
    public regController() {
    }

    public Users getSelectedUsers() {
        return selectedUsers;
    }

    public void setSelectedUsers(Users selectedUsers) {
        this.selectedUsers = selectedUsers;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void emptyVariables(){
        this.lastName = "";
        this.firstName = "";
        this.surName = "";
        this.adress = "";
        this.password = "";
        this.email = "";
    }
    
    public List<Users> getAllUsers(){
        return this.usersFacade.findAll();
    }
    
    public String createUsers(){
        this.user.setLastName(this.lastName);
        this.user.setFirstName(this.firstName);
        this.user.setSurName(this.surName);
        this.user.setAdress(this.adress);
        this.user.setPassword(this.password);
        this.user.setEmail(this.email);
        this.usersFacade.create(user);
        emptyVariables();
        return "Registration.xhtml?faces-redirect=true";
    }
    
    public String updateUser(Users users){
        this.usersFacade.edit(users);
        return "Registration.xhtml?faces-redirect=true";
    }
    
    public String deleteUser(Users user){
        this.usersFacade.remove(user);
        return "Registration.xhtml?faces-redirect=true";
    }
    
    
}
