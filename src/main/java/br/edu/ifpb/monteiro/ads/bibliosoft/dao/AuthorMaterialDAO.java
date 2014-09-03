package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.AuthorMaterial;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.AuthorMaterialDAOIF;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jefferson
 */
@RequestScoped
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
