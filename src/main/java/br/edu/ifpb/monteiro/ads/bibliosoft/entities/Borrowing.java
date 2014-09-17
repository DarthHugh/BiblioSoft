
package br.edu.ifpb.monteiro.ads.bibliosoft.entities;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierBorrowing;
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

/**
 *
 * @author jefferson
 */
@Entity
@Table(name = "borrowing")
@QualifierBorrowing
public class Borrowing implements IdentifiableBiblio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne @JoinColumn(name="id_materialCopy")
    private MaterialCopy idMaterialCopy;
    
    @ManyToOne @JoinColumn(name="id_user")
    private UserBibliosoft idUser;
     
    @Column(name="receipt_date", nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date receiptDate;
    
    @Column(name="return_date", nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date returnDate;

    public Borrowing() {
    }

    public Borrowing(Long id) {
        this.id = id;
    }

    public Borrowing(Long id, Date receiptDate, Date returnDate) {
        this.id = id;
        this.receiptDate = receiptDate;
        this.returnDate = returnDate;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public UserBibliosoft getIdUser() {
        return idUser;
    }

    public void setIdUser(UserBibliosoft idUser) {
        this.idUser = idUser;
    }

    public MaterialCopy getIdMaterialCopy() {
        return idMaterialCopy;
    }

    public void setIdMaterialCopy(MaterialCopy idMaterialCopy) {
        this.idMaterialCopy = idMaterialCopy;
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
        if (!(object instanceof Borrowing)) {
            return false;
        }
        Borrowing other = (Borrowing) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifpb.monteiro.ads.bibliosoft.entities.Borrowing[ id=" + id + " ]";
    }
    
}
