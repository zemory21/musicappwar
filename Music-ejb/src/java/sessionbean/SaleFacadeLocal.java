/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Sale;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author zemor
 */
@Local
public interface SaleFacadeLocal {

    void create(Sale sale);

    void edit(Sale sale);

    void remove(Sale sale);

    Sale find(Object id);

    List<Sale> findAll();

    List<Sale> findRange(int[] range);

    int count();
    
}
