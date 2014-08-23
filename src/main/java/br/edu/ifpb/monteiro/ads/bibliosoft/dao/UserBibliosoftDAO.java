
package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.UserBibliosoft;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.UserBibliosoftDAOIF;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jefferson
 */
@Stateless
public class UserBibliosoftDAO extends AbstractDAO<UserBibliosoft> 
                                                implements UserBibliosoftDAOIF {
    
    @PersistenceContext(unitName = "BIBLIOSOFT-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserBibliosoftDAO() {
        super(UserBibliosoft.class);
    }
    
}
