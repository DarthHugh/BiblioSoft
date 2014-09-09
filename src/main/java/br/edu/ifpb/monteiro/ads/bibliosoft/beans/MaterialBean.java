
package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Material;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.AbstractService;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.MaterialServiceIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.util.implemetes.JsfUtil;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.jsp.JspFactory;

/**
 *
 * @author jefferson
 */
@Named(value = "materialBean")
@SessionScoped
public class MaterialBean implements Serializable {
   
    @Inject
    private MaterialServiceIF materialService;

   
    private List<Material> materials;

    private Material material = new Material();

    public MaterialBean() {
    }

    public List<Material> getMaterials() {
        materials = (List) materialService.findAll();
        return materials;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String saveMaterial() {
        System.out.println("DATABASE ----- BEAN MATERIAL");
        materialService.save(material);
        return "Materials";
    }
    public MaterialServiceIF getService(){
        return materialService;
    }
    
    public SelectItem[] getAllMaterials(){
        System.out.println("Carregando lista");
        for(IdentifiableBiblio ob : getService().findAll()){
            System.out.println(ob.getId());
        }
        return JsfUtil.getSelectItems(getService().findAll(), true);
    }
    
}
