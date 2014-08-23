/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.BookCase;
import java.util.List;

/**
 *
 * @author jefferson
 */
public interface BookCaseDAOIF {

    public void create(BookCase bookCase);

    public void edit(BookCase bookCase);

    public void remove(BookCase bookCase);

    public BookCase find(Object id);

    public List<BookCase> findAll();

    public List<BookCase> findRange(int[] range);

    public int count();
}
