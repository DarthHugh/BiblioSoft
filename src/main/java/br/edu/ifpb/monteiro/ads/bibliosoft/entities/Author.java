package br.edu.ifpb.monteiro.ads.bibliosoft.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hugo Correia
 */
@Entity
@Table(name="author")
@XmlRootElement
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;
    
    @OneToMany(mappedBy="idAuthor") // I think it's missing something, like Author_Material.class. you know?
    private List<AuthorMaterial> listAuthorMaterial;
    
    @Column(name="name", length=50)
    @NotNull
    private String name;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
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
    public List<AuthorMaterial> getListAuthorMaterial() {
        return listAuthorMaterial;
    }

    /**
     * @param listAuthorMaterial the listAuthorMaterial to set
     */
    public void setListAuthorMaterial(List<AuthorMaterial> listAuthorMaterial) {
        this.listAuthorMaterial = listAuthorMaterial;
    }

    
}