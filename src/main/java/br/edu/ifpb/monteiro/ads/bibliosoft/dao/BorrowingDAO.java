package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Borrowing;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.BorrowingDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierBorrowingDAO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jefferson
 */
@QualifierBorrowingDAO
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
