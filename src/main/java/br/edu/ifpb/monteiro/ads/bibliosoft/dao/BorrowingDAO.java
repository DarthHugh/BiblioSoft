package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Borrowing;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.BorrowingDAOIF;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jefferson
 */
@Stateless
public class BorrowingDAO extends AbstractDAO<Borrowing>
        implements BorrowingDAOIF {

    @PersistenceContext(unitName = "BIBLIOSOFT-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BorrowingDAO() {
        super(Borrowing.class);
    }

}
