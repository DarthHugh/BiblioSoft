package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.MaterialCopy;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.MaterialCopyDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierMaterialCopyDAO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

}
