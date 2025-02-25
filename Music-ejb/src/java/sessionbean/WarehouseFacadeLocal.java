/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Warehouse;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author zemor
 */
@Local
public interface WarehouseFacadeLocal {

    void create(Warehouse warehouse);

    void edit(Warehouse warehouse);

    void remove(Warehouse warehouse);

    Warehouse find(Object id);

    List<Warehouse> findAll();

    List<Warehouse> findRange(int[] range);

    int count();
    
}
