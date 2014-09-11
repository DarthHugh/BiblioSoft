package br.edu.ifpb.monteiro.ads.bibliosoft.entities;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierBookCase;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jefferson
 */
@Entity
@Table(name = "bookcase")
@QualifierBookCase
public class BookCase implements IdentifiableBiblio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToMany(mappedBy="idBookcase", targetEntity = MaterialCopy.class) // I think it's missing something, like Author_Material.class. you know?
    private List<MaterialCopy> materialCopy;
    
    @Column(name="shelvesNumber", nullable=false)
    private int shelvesNumber;

    public BookCase() {
    }

    public BookCase(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public List<MaterialCopy> getMaterialCopy() {
        return materialCopy;
    }

    public void setMaterialCopy(List<MaterialCopy> materialCopy) {
        this.materialCopy = materialCopy;
    }

    public int getShelvesNumber() {
        return shelvesNumber;
    }

    public void setShelvesNumber(int shelvesNumber) {
        this.shelvesNumber = shelvesNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BookCase other = (BookCase) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
  
}
