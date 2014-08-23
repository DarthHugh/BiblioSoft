
package br.edu.ifpb.monteiro.ads.bibliosoft.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jefferson
 */
@Entity
@Table(name = "booking")
@XmlRootElement

public class Booking implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
   @ManyToOne @JoinColumn(name="id_material")
    private Material idMaterial;
    
    @ManyToOne @JoinColumn(name="id_user")
    private UserBibliosoft idUser;
    
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateBooking;

    public Booking() {
    }

    public Booking(Long id) {
        this.id = id;
    }

    public Booking(Long id, Date datebooking) {
        this.id = id;
        this.dateBooking = datebooking;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(Date dateBooking) {
        this.dateBooking = dateBooking;
    }

    public UserBibliosoft getIdUser() {
        return idUser;
    }

    public void setIdUser(UserBibliosoft idUser) {
        this.idUser = idUser;
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
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifpb.monteiro.ads.bibliosoft.entities.Booking[ id=" + id + " ]";
    }
    
}
