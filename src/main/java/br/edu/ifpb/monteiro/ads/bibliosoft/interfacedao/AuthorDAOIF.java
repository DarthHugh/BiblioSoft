/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Author;
import java.util.List;

/**
 *
 * @author jefferson
 */
public interface AuthorDAOIF {

    public void create(Author author);

    public void edit(Author author);

    public void remove(Author author);

    public Author find(Object id);

    public List<Author> findAll();

    public List<Author> findRange(int[] range);

    public int count();
}
