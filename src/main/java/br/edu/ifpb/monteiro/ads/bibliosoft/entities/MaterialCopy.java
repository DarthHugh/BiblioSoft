
package br.edu.ifpb.monteiro.ads.bibliosoft.entities;

import java.io.Serializable;
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
public class MaterialCopy implements IdentifiableBiblio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @OneToMany(mappedBy="idMaterialCopy") // I think it's missing something, like Borrowing.class. you know?
    private List<Borrowing> listBorrowing;
    
    @ManyToOne @JoinColumn(name="id_material")
    private Material idMaterial;
    
    @ManyToOne @JoinColumn(name="id_bookcase")
    private BookCase idBookcase;
    
    @Column(name="shelf", nullable=false)
    private int shelf;
    
    @Column(name="borrowing", nullable=false)
    private boolean borrowing;

    public MaterialCopy() {
    }

    public MaterialCopy(Long id) {
        this.id = id;
    }

    public MaterialCopy(Long id, boolean borrowing, int shelf) {
        this.id = id;
        this.borrowing = borrowing;
        this.shelf = shelf;
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

    public int getShelf() {
        return shelf;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
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

    public BookCase getIdBookcase() {
        return idBookcase;
    }

    public void setIdBookcase(BookCase idBookcase) {
        this.idBookcase = idBookcase;
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
