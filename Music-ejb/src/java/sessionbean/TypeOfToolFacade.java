/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.TypeOfTool;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author zemor
 */
@Stateless
public class TypeOfToolFacade extends AbstractFacade<TypeOfTool> implements TypeOfToolFacadeLocal {

    @PersistenceContext(unitName = "Music-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TypeOfToolFacade() {
        super(TypeOfTool.class);
    }
    
}
