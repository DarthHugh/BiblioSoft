/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.UserBibliosoft;
import java.util.List;

/**
 *
 * @author jefferson
 */
public interface InterfaceCrudService<T> {
    
    public void save(T entity);
    public void remove(T entity);
    public List getAll();
    public void update(T entity);
}
