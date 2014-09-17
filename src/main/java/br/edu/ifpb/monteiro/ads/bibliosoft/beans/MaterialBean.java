package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Material;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierMaterial;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.MaterialServiceIF;
import java.io.Serializable;
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
public class MaterialBean implements Serializable {

    @Inject
    private MaterialServiceIF materialService;

    private List<Material> materials;

    @Inject
    @QualifierMaterial
    private Material material;

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
        materialService.save(material);
        return "Materials";
    }

    public void remove() {
        materialService.remove(material);
    }

    public void update() {
        materialService.update(material);
    }
}
