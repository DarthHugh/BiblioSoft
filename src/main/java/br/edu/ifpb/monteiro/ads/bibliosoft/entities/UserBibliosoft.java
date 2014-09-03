
package br.edu.ifpb.monteiro.ads.bibliosoft.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

/**
 *
 * @author jefferson
 */
@Entity
@Table(name = "userbibliosoft")
public class UserBibliosoft implements IdentifiableBiblio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @OneToMany(mappedBy="idUser") // I think it's missing something, like Borrowing.class. you know?
    private List<Borrowing> listBorrowing;
    
    @OneToMany(mappedBy="idUser") // I think it's missing something, like Booking.class. you know?
    private List<Booking> listBooking; 
    
    @Column(nullable=false) 
    private String registration;
    
    @Column(nullable=false, name = "user_name")
    private String name;
    
    @Column(nullable=false, name = "user_password")
    private String password;
    
    @Column(nullable=false)
    private String cpf;
    
    @Column(nullable=false)
    @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
        +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
        +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
             message="{invalid.email}")
    private String email;

    public UserBibliosoft() {
    }

    public UserBibliosoft(Long id) {
        this.id = id;
    }

    public UserBibliosoft(Long id, String cpf, String email, String name, String password, String registration) {
        this.id = id;
        this.cpf = cpf;
        this.email = email;
        this.name = name;
        this.password = password;
        this.registration = registration;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public List<Borrowing> getListBorrowing() {
        return listBorrowing;
    }

    public void setListBorrowing(List<Borrowing> listBorrowing) {
        this.listBorrowing = listBorrowing;
    }

    public List<Booking> getListBooking() {
        return listBooking;
    }

    public void setListBooking(List<Booking> listBooking) {
        this.listBooking = listBooking;
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
        if (!(object instanceof UserBibliosoft)) {
            return false;
        }
        UserBibliosoft other = (UserBibliosoft) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifpb.monteiro.ads.bibliosoft.entities.Userbibliosoft[ id=" + id + " ]";
    }
    
}
