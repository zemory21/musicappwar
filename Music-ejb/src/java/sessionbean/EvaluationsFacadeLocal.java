/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Evaluations;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author zemor
 */
@Local
public interface EvaluationsFacadeLocal {

    void create(Evaluations evaluations);

    void edit(Evaluations evaluations);

    void remove(Evaluations evaluations);

    Evaluations find(Object id);

    List<Evaluations> findAll();

    List<Evaluations> findRange(int[] range);

    int count();
    
}
