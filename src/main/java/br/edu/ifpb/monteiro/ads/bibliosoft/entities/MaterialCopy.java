
package br.edu.ifpb.monteiro.ads.bibliosoft.entities;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierMaterialCopy;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jefferson
 */
@Entity
@Table(name = "materialcopy")
@QualifierMaterialCopy
public class MaterialCopy implements IdentifiableBiblio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @OneToMany(mappedBy="idMaterialCopy") // I think it's missing something, like Borrowing.class. you know?
    private List<Borrowing> listBorrowing;
    
    @ManyToOne @JoinColumn(name="id_material")
    private Material idMaterial;
    
    @Column(name="bookcase", nullable=false, length = 7)
    private String bookcase;
    
    @Column(name="borrowing", nullable=false)
    private boolean borrowing;

    public MaterialCopy() {
    }

    public MaterialCopy(Long id) {
        this.id = id;
    }

    public MaterialCopy(Long id, boolean borrowing, String bookcase) {
        this.id = id;
        this.borrowing = borrowing;
        this.bookcase = bookcase;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public boolean getBorrowing() {
        return borrowing;
    }

    public void setBorrowing(boolean borrowing) {
        this.borrowing = borrowing;
    }

    public String getBookcase() {
        return this.bookcase;
    }

    public void setBookcase(String bookcase) {
        this.bookcase = bookcase;
    }

    public List<Borrowing> getListBorrowing() {
        return listBorrowing;
    }

    public void setListBorrowing(List<Borrowing> listBorrowing) {
        this.listBorrowing = listBorrowing;
    }

    public Material getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Material idMaterial) {
        this.idMaterial = idMaterial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialCopy)) {
            return false;
        }
        MaterialCopy other = (MaterialCopy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifpb.monteiro.ads.bibliosoft.entities.Materialcopy[ id=" + id + " ]";
    }
    
}
