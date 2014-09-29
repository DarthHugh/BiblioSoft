/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.MaterialCopy;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierMaterialCopy;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.MaterialCopyServiceIF;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Ricardo
 */
@Named(value = "materialCopyBean")
@RequestScoped
public class MaterialCopyBean extends AbstractBean{
    
    @Inject
    private MaterialCopyServiceIF materialCopyService;
        
    @Inject
    @QualifierMaterialCopy
    private IdentifiableBiblio materialCopy;
    
    public MaterialCopyBean() {
    }
    
    public IdentifiableBiblio getMaterialCopy() {
        return materialCopy;
    }

    public void setMaterialCopy(MaterialCopy materialCopy) {
        this.materialCopy = materialCopy;
    }

    public void update() {
        materialCopyService.update(materialCopy);
    }

    @Override
    public InterfaceCrudService getService() {
        return this.materialCopyService;
    }

    @Override
    public IdentifiableBiblio getIdentifiableBiblio() {
        return this.materialCopy;
    }

    @Override
    public void limparForm() {
        this.setMaterialCopy(null);
    }
    
}
