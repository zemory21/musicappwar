/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Buyers;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author zemor
 */
@Local
public interface BuyersFacadeLocal {

    void create(Buyers buyers);

    void edit(Buyers buyers);

    void remove(Buyers buyers);

    Buyers find(Object id);

    List<Buyers> findAll();

    List<Buyers> findRange(int[] range);

    int count();
    
}
