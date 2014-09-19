/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Borrowing;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierBorrowing;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.BorrowingServiceIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author matheusoliveira
 */
@Named("borrowingBean")
@RequestScoped
public class BorrowingBean extends AbstractBean{
    
    @Inject
    private BorrowingServiceIF borrowingService;
    
    @Inject
    @QualifierBorrowing
    private IdentifiableBiblio borrowing;
    
    private List<Borrowing> borrowings;
    
    public IdentifiableBiblio getBorrowing(){
        return this.borrowing;
    }
    public void setBorrowing(IdentifiableBiblio borrowing){
        this.borrowing=borrowing;
    }
    
     public List<Borrowing> getBorrowings() {
        borrowings = (List) borrowingService.findAll();
        return borrowings;
    }

    @Override
    public InterfaceCrudService getService() {
        return this.borrowingService;
    }

    @Override
    public IdentifiableBiblio getIdentifiableBiblio() {
        return this.borrowing;
    }
    @Override
    public void limparForm() {
        setBorrowing(new Borrowing());
    }
}