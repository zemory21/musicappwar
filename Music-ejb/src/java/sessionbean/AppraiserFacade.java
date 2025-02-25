/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Appraiser;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author zemor
 */
@Stateless
public class AppraiserFacade extends AbstractFacade<Appraiser> implements AppraiserFacadeLocal {

    @PersistenceContext(unitName = "Music-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AppraiserFacade() {
        super(Appraiser.class);
    }
    
}
