/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import java.util.List;

/**
 *
 * @author jefferson
 */
public interface InterfaceCrudService {
    
    public void save(IdentifiableBiblio entity);
    public void remove(IdentifiableBiblio entity);
    public List<IdentifiableBiblio> getAll();
    public void update(IdentifiableBiblio entity);
}
