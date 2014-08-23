
package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Material;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.MaterialService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author jefferson
 */
@Named(value = "materialBean")
@SessionScoped
public class MaterialBean implements Serializable {
   
    @EJB
    private MaterialService materialUtil;

   
    private List<Material> materials;

    private Material material = new Material();

    public MaterialBean() {
    }

    public List<Material> getMaterials() {
        materials = materialUtil.getAll();
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
