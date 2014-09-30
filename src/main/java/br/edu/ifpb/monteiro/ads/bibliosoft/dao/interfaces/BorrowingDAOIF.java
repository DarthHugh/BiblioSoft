/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Borrowing;
import java.util.List;

/**
 *
 * @author jefferson
 */
public interface BorrowingDAOIF extends AbstractDAOIF{
    
    public List<Borrowing> findBorrowingNotReturn();
}
