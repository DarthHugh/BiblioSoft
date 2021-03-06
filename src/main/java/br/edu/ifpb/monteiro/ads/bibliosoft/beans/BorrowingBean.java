/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Borrowing;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.MaterialCopy;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierBorrowing;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.BorrowingServiceIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.MaterialCopyServiceIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.util.implemetes.JsfUtil;
import java.util.List;
import java.util.ResourceBundle;
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
    private Borrowing borrowing;
    
    private Borrowing selected;
    
    private List<Borrowing> borrowings;
    
    @Inject
    private MaterialCopyServiceIF materialCopyService;
    
    
    public IdentifiableBiblio getBorrowing(){
        return this.borrowing;
    }
    
    public List<Borrowing> findAllBorrowing(){
        return  borrowingService.findAllBorrowing();
    }
    
    public void setBorrowing(Borrowing borrowing){
        this.borrowing=borrowing;
    }
    
    public List<Borrowing> findBorrowingNotReturn(){
        List<Borrowing> findBorrowingNotReturn = borrowingService.findBorrowingNotReturn();
        System.out.println(findBorrowingNotReturn.size());
        return findBorrowingNotReturn;
        
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
        setBorrowing(null);
    }
    
    @Override
    public void save(){
        try{
            MaterialCopy materialCopy = this.borrowing.getIdMaterialCopy();
            materialCopy.setBorrowing(true);
            getService().save(getIdentifiableBiblio());
            this.materialCopyService.update(materialCopy);
            limparForm();
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("SaveSuccesfull"));
        }catch(Exception e){
            JsfUtil.addErrorMessage(e,ResourceBundle.getBundle("/Bundle").getString("SaveError"));

        }
    }

    public Borrowing getSelected() {
        return selected;
    }

    

    public void setSelected(Borrowing selected) {
        this.selected = selected;
    }
    
    
    public void returnMaterial(){
        try {
            selected.getIdMaterialCopy().setBorrowing(false);
            this.materialCopyService.update(selected.getIdMaterialCopy());
            
        } catch (Exception e) {
        }
    }
}
