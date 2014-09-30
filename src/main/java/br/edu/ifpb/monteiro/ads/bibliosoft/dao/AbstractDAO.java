package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.AbstractDAOIF;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author jefferson
 * @param <T>
 */
@Dependent
public abstract class AbstractDAO< T extends IdentifiableBiblio> implements AbstractDAOIF {

    private Class<T> entityClass;

    public AbstractDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    @Override
    public void create(IdentifiableBiblio entity) {
        getEntityManager().persist(entity);
    }

    @Override
    public void edit(IdentifiableBiblio entity) {
        getEntityManager().merge(entity);
    }

    @Override
    public void remove(IdentifiableBiblio entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public IdentifiableBiblio find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    @Override
    public List<IdentifiableBiblio> findAll() {
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    /**
     *
     * @param range
     * @return
     */
    @Override
    public List<IdentifiableBiblio> findRange(int[] range) {
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    @Override
    public int count() {
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

}
