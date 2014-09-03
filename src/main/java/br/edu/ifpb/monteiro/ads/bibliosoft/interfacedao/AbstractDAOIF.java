/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import java.util.List;

/**
 *
 * @author jefferson
 */
public interface AbstractDAOIF {

    public void create(IdentifiableBiblio entity);

    public void edit(IdentifiableBiblio entity);

    public void remove(IdentifiableBiblio entity);

    public IdentifiableBiblio find(Object id);

    public List<IdentifiableBiblio> findAll();

    public List<IdentifiableBiblio> findRange(int[] range);

    public int count();
}
