package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Author;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.AuthorDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierAuthorDAO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vanderlan
 */
@QualifierAuthorDAO
public class AuthorDAO extends AbstractDAO<Author> implements AuthorDAOIF{

    
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
