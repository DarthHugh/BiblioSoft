package br.edu.ifpb.monteiro.ads.bibliosoft.dao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Booking;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.BookingDAOIF;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jefferson
 */
@Stateless
public class BookingDAO extends AbstractDAO<Booking> implements BookingDAOIF {

    @PersistenceContext(unitName = "BIBLIOSOFT-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookingDAO() {
        super(Booking.class);
    }

}
