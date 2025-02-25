/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.TypeOfService;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author zemor
 */
@Stateless
public class TypeOfServiceFacade extends AbstractFacade<TypeOfService> implements TypeOfServiceFacadeLocal {

    @PersistenceContext(unitName = "Music-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TypeOfServiceFacade() {
        super(TypeOfService.class);
    }
    
}
