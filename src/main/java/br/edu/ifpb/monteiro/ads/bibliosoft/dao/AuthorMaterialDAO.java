package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.AuthorMaterial;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.AuthorMaterialDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierAuthorMaterialDAO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jefferson
 */
@QualifierAuthorMaterialDAO
public class AuthorMaterialDAO extends AbstractDAO<AuthorMaterial> implements AuthorMaterialDAOIF {

    @PersistenceContext(unitName = "BIBLIOSOFT-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuthorMaterialDAO() {
        super(AuthorMaterial.class);
    }

}
