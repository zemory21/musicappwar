/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.TypeOfTool;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author zemor
 */
@Local
public interface TypeOfToolFacadeLocal {

    void create(TypeOfTool typeOfTool);

    void edit(TypeOfTool typeOfTool);

    void remove(TypeOfTool typeOfTool);

    TypeOfTool find(Object id);

    List<TypeOfTool> findAll();

    List<TypeOfTool> findRange(int[] range);

    int count();
    
}
