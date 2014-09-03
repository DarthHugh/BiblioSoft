
package br.edu.ifpb.monteiro.ads.bibliosoft.entities;

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
@Table(name = "material")
public class Material implements IdentifiableBiblio {
   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @OneToMany(mappedBy="idMaterial") // I think it's missing something, like Author_Material.class. you know?
    private List<AuthorMaterial> listAuthorMaterial;
    
    @OneToMany(mappedBy="idMaterial") // I think it's missing something, like MaterialCopy.class. you know?
    private List<MaterialCopy> listMaterialCopy;
    
    @OneToMany(mappedBy="idMaterial") // I think it's missing something, like Booking.class. you know?
    private List<Booking> listBookingCopy;
    
    @Column(name="material_type", length=11, nullable=false)
    private String type;
    
    @Column(name="material_name", length=50, nullable=false)
    private String name;
    
    @Column(name="publishingHouse", length=20, nullable=false)
    private String publishingHouse;
    
    @Column(name="edition")
    private int edition;
    
    @Column(name="material_year", nullable=false)
    private int year;
    
    @Column(name="category", length=20, nullable=false)
    private String category;
    
    @Column(name="copiesNumber", nullable=false)
    private int copiesNumber;

    public Material() {
    }

    public Material(Long id) {
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

    public List<AuthorMaterial> getListAuthorMaterial() {
        return listAuthorMaterial;
    }

    public void setListAuthorMaterial(List<AuthorMaterial> listAuthorMaterial) {
        this.listAuthorMaterial = listAuthorMaterial;
    }

    public List<MaterialCopy> getListMaterialCopy() {
        return listMaterialCopy;
    }

    public void setListMaterialCopy(List<MaterialCopy> listMaterialCopy) {
        this.listMaterialCopy = listMaterialCopy;
    }

    public List<Booking> getListBookingCopy() {
        return listBookingCopy;
    }

    public void setListBookingCopy(List<Booking> listBookingCopy) {
        this.listBookingCopy = listBookingCopy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCopiesNumber() {
        return copiesNumber;
    }

    public void setCopiesNumber(int copiesNumber) {
        this.copiesNumber = copiesNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Material other = (Material) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
     
}
