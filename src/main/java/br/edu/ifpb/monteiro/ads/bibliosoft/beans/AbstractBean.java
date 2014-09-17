/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;

/**
 *
 * @author Ricardo
 */
public abstract class AbstractBean {
    
    public abstract InterfaceCrudService getService();
    public abstract IdentifiableBiblio getIdentifiableBiblio();
    
    public void save(){
        getService().save(getIdentifiableBiblio());
    }
    
    public void remove(){
        getService().remove(getIdentifiableBiblio());
    }
    
}
