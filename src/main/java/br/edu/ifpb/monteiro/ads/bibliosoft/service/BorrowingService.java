/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.service;

import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.AbstractDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.BorrowingDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierBorrowingDAO;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Borrowing;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.BorrowingServiceIF;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author matheusoliveira
 */
@RequestScoped
public class BorrowingService extends AbstractService implements BorrowingServiceIF{

    @Inject
    @QualifierBorrowingDAO
    private BorrowingDAOIF borrowingDao;
    private List<Borrowing> listBorrowing;
    
    @Override
    protected AbstractDAOIF getDao() {
        return this.borrowingDao;
    }

    @Override
    public List<Borrowing> findBorrowingNotReturn() {
        return borrowingDao.findBorrowingNotReturn();
    }
    
    @Override
    public List<Borrowing> findAllBorrowing() {
        listBorrowing = this.borrowingDao.findAllBorrowing();
        
        return listBorrowing;
    }
    
    
}
