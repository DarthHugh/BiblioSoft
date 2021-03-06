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
import java.util.List;
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
    
    private List<MaterialCopy> materialCopys;
        
    @Inject
    @QualifierMaterialCopy
    private IdentifiableBiblio materialCopy;
    
    public MaterialCopyBean() {
    }
    
    public List<MaterialCopy> getMaterialCopys(){
        return materialCopys = (List) getService().findAll();
    }
    
    public List<MaterialCopy> findAllNotBorrowing(){
        return  materialCopyService.findAllNotBorrowing();
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
