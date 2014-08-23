package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Author;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.AuthorDAOIF;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vanderlan
 */
@Stateless
public class AuthorDAO extends AbstractDAO<Author>  {

    
    @PersistenceContext(unitName = "BIBLIOSOFT-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuthorDAO() {
        super(Author.class);
    }

}
