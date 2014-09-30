package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.MaterialCopy;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.MaterialCopyDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierMaterialCopyDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jefferson
 */
@QualifierMaterialCopyDAO
public class MaterialcopyDAO extends AbstractDAO<MaterialCopy>
        implements MaterialCopyDAOIF {

    @PersistenceContext(unitName = "BIBLIOSOFT-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MaterialcopyDAO() {
        super(MaterialCopy.class);
    }

    @Override
    public List<MaterialCopy> findAllNotBorrowing() {
        Query query;
        query = getEntityManager().createQuery("FROM MaterialCopy mc WHERE mc.borrowing=FALSE");
        return query.getResultList();
    }

}
