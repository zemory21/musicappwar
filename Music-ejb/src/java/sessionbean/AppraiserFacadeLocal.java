/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Appraiser;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author zemor
 */
@Local
public interface AppraiserFacadeLocal {

    void create(Appraiser appraiser);

    void edit(Appraiser appraiser);

    void remove(Appraiser appraiser);

    Appraiser find(Object id);

    List<Appraiser> findAll();

    List<Appraiser> findRange(int[] range);

    int count();
    
}
