/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;
import br.edu.ifpb.monteiro.ads.bibliosoft.util.implemetes.JsfUtil;
import java.util.ResourceBundle;

/**
 *
 * @author Ricardo
 */
public abstract class AbstractBean {
    
    public abstract InterfaceCrudService getService();
    public abstract IdentifiableBiblio getIdentifiableBiblio();
    
    public void save(){
        try{
            getService().save(getIdentifiableBiblio());
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("SaveSuccesfull"));
        }catch(Exception e){
            JsfUtil.addErrorMessage(e,ResourceBundle.getBundle("/Bundle").getString("SaveError"));

        }
    }
    
    public void remove(){
        getService().remove(getIdentifiableBiblio());
    }
    
}
