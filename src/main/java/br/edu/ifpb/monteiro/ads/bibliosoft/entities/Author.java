package br.edu.ifpb.monteiro.ads.bibliosoft.entities;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierAuthor;
import java.util.List;
import java.util.Objects;
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
    
    @ManyToMany(mappedBy="listFKAuthor")
    private List<Material> listFKMaterial;
    
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
    public List<Material> getListFKMaterial() {
        return listFKMaterial;
    }

    /**
     * @param listFKMaterial the listAuthorMaterial to set
     */
    public void setListFKMaterial(List<Material> listFKMaterial) {
        this.listFKMaterial = listFKMaterial;
    }

     @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Author other = (Author) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    
    


}