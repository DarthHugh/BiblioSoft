
package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.UserBibliosoft;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.UserBibliosoftDAOIF;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jefferson
 */
@RequestScoped
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

    @Override
    public List<UserBibliosoft> getAll() {
       Query query = em.createQuery("from UserBibliosoft u");
       return query.getResultList();
    }
    
}
