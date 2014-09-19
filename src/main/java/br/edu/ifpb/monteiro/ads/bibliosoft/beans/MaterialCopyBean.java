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
    
    public IdentifiableBiblio getMaterial() {
        return materialCopy;
    }

    public void setMaterial(MaterialCopy materialCopy) {
        this.materialCopy = materialCopy;
    }

    public void update() {
        materialCopyService.update(materialCopy);
    }

    @Override
    public InterfaceCrudService getService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IdentifiableBiblio getIdentifiableBiblio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limparForm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
