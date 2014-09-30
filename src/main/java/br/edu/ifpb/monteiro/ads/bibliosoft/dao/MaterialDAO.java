package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Material;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.MaterialDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierMaterialDAO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jefferson
 */
@QualifierMaterialDAO
public class MaterialDAO extends AbstractDAO<Material>
        implements MaterialDAOIF {

    @PersistenceContext(unitName = "BIBLIOSOFT-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MaterialDAO() {
        super(Material.class);
    }

}
