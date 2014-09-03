/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.bibliosoft.service;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.AbstractDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;
import java.util.List;
import javax.transaction.Transactional;

/**
 *
 * @author matheusoliveira
 */
public abstract class AbstractService implements InterfaceCrudService{
    
    protected abstract AbstractDAOIF getDao();

    @Override
    @Transactional
    public void save(IdentifiableBiblio entity){
        getDao().create(entity);
        
    }
    @Override
    public void remove(IdentifiableBiblio entity){
        getDao().remove(entity);
        
    }
    @Override
    public List<IdentifiableBiblio> getAll(){
        return getDao().findAll();
    }
    @Override
    public void update(IdentifiableBiblio entity){
        getDao().edit(entity);
    }
}




