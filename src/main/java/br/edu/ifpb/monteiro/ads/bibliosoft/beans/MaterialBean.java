package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Material;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.MaterialCopy;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierMaterial;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierMaterialCopy;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.MaterialCopyServiceIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.MaterialServiceIF;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jefferson
 */
@Named(value = "materialBean")
@RequestScoped
public class MaterialBean extends AbstractBean{

    @Inject
    private MaterialServiceIF materialService;
    
    @Inject
    private MaterialCopyServiceIF materialCopyService;
    
    private List<Material> materials;
    
    @Inject
    @QualifierMaterial
    private Material material;
    
    @Inject
    @QualifierMaterialCopy
    private MaterialCopy materialCopy;
    
    public MaterialBean() {
    }
    
    public List<Material> getMaterials() {
        materials = (List) materialService.findAll();
        return materials;
    }

    public IdentifiableBiblio getMaterial() {
        return material;
    }
    
    public IdentifiableBiblio getMaterialCopy(){
        return this.materialCopy;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    
    public void setMaterialCopy(MaterialCopy materialCopy){
        this.materialCopy = materialCopy;
    }

    public void update() {
        materialService.update(material);
    }

    @Override
    public InterfaceCrudService getService() {
        return this.materialService;
    }

    @Override
    public IdentifiableBiblio getIdentifiableBiblio() {
        return this.material;
    }
    @Override
    public void limparForm() {
        setMaterial(null);
        setMaterialCopy(null);
    }
    public void saveMaterials(){
        getService().save(material);
        materialCopy.setIdMaterial(material);
        materialCopy.setBorrowing(false);
        for(int i = 0; i < material.getCopiesNumber(); i++){
             materialCopyService.save(materialCopy);
             materialCopy.setId(null);
        }
        limparForm();
    }
}
