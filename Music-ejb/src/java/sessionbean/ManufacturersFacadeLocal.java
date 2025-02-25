/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Manufacturers;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author zemor
 */
@Local
public interface ManufacturersFacadeLocal {

    void create(Manufacturers manufacturers);

    void edit(Manufacturers manufacturers);

    void remove(Manufacturers manufacturers);

    Manufacturers find(Object id);

    List<Manufacturers> findAll();

    List<Manufacturers> findRange(int[] range);

    int count();
    
}
