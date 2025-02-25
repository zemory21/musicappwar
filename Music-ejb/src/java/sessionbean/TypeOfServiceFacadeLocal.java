/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.TypeOfService;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author zemor
 */
@Local
public interface TypeOfServiceFacadeLocal {

    void create(TypeOfService typeOfService);

    void edit(TypeOfService typeOfService);

    void remove(TypeOfService typeOfService);

    TypeOfService find(Object id);

    List<TypeOfService> findAll();

    List<TypeOfService> findRange(int[] range);

    int count();
    
}
