/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Soldproduct;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author zemor
 */
@Local
public interface SoldproductFacadeLocal {

    void create(Soldproduct soldproduct);

    void edit(Soldproduct soldproduct);

    void remove(Soldproduct soldproduct);

    Soldproduct find(Object id);

    List<Soldproduct> findAll();

    List<Soldproduct> findRange(int[] range);

    int count();
    
}
