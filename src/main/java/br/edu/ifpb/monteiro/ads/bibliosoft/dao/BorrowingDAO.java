package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Borrowing;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.BorrowingDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierBorrowingDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

    @Override
    public List<Borrowing> findBorrowingNotReturn() {
        Query query;
//        query = getEntityManager().createNativeQuery("SELECT b FROM Borrowing b, MaterialCopy mc"
//                + " WHERE mc.borrowing = TRUE AND mc = b.idMaterialCopy ");
//        
        query = getEntityManager().createQuery("FROM Borrowing b WHERE b.idMaterialCopy.borrowing = TRUE");
        
        return query.getResultList();
    }

}
