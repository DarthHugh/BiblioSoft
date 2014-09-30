
package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.UserBibliosoft;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.UserBibliosoftDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierUserBibliosofDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jefferson
 */
@QualifierUserBibliosofDAO
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
