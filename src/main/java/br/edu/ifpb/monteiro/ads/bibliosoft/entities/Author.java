package br.edu.ifpb.monteiro.ads.bibliosoft.entities;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierAuthor;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Hugo Correia
 */
@Entity
@Table(name="author")
@QualifierAuthor
public class Author implements IdentifiableBiblio {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;
    
    @ManyToMany(mappedBy="fkAuthor")
    private List<Material> fkMaterial;
    
    @Column(name="name", length=50)
    @NotNull
    private String name;

    /**
     * @return the id
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the listAuthorMaterial
     */
    public List<Material> getFkMaterial() {
        return fkMaterial;
    }

    /**
     * @param fkMaterial the listAuthorMaterial to set
     */
    public void setListMaterial(List<Material> fkMaterial) {
        this.fkMaterial = fkMaterial;
    }

    
}