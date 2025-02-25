/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Warehouse;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author zemor
 */
@Stateless
public class WarehouseFacade extends AbstractFacade<Warehouse> implements WarehouseFacadeLocal {

    @PersistenceContext(unitName = "Music-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WarehouseFacade() {
        super(Warehouse.class);
    }
    
}
