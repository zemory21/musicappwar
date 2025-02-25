/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Cities;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author zemor
 */
@Local
public interface CitiesFacadeLocal {

    void create(Cities cities);

    void edit(Cities cities);

    void remove(Cities cities);

    Cities find(Object id);

    List<Cities> findAll();

    List<Cities> findRange(int[] range);

    int count();
    
}
