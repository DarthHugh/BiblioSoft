
package br.edu.ifpb.monteiro.ads.bibliosoft.entities;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierAuthorMaterial;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jefferson
 */
@Entity
@Table(name = "author_material")
@QualifierAuthorMaterial
public class AuthorMaterial implements IdentifiableBiblio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne @JoinColumn(name="id_author")
    private Author idAuthor;
    
    @ManyToOne @JoinColumn(name="id_material") 
    private Material idMaterial;
    
    public AuthorMaterial() {
    }

    public AuthorMaterial(Long id) {
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

    public Author getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Author idAuthor) {
        this.idAuthor = idAuthor;
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
        if (!(object instanceof AuthorMaterial)) {
            return false;
        }
        AuthorMaterial other = (AuthorMaterial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifpb.monteiro.ads.bibliosoft.entities.AuthorMaterial[ id=" + id + " ]";
    }
    
}
