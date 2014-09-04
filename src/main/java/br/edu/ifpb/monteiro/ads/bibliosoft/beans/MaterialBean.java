
package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Material;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.MaterialServiceIF;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jefferson
 */
@Named(value = "materialBean")
@SessionScoped
public class MaterialBean implements Serializable {
   
    @Inject
    private MaterialServiceIF materialUtil;

   
    private List<Material> materials;

    private Material material = new Material();

    public MaterialBean() {
    }

    public List<Material> getMaterials() {
        materials = (List) materialUtil.findAll();
        return materials;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String saveMaterial() {
        materialUtil.save(material);
        return "Materials";
    }

}
