/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Borrowing;
import java.util.List;

/**
 *
 * @author jefferson
 */
public interface BorrowingDAOIF {

    public void create(Borrowing borrowing);

    public void edit(Borrowing borrowing);

    public void remove(Borrowing borrowing);

    public Borrowing find(Object id);

    public List<Borrowing> findAll();

    public List<Borrowing> findRange(int[] range);

    public int count();
}
