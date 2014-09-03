package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.BookCase;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.BookCaseDAOIF;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jefferson
 */
@RequestScoped
public class BookCaseDAO extends AbstractDAO<BookCase> implements BookCaseDAOIF {

    @PersistenceContext(unitName = "BIBLIOSOFT-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookCaseDAO() {
        super(BookCase.class);
    }

}
