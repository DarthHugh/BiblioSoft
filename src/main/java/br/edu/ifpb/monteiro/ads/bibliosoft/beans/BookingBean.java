/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.bibliosoft.beans;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Booking;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.IdentifiableBiblio;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.qualifiers.QualifierBooking;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.BookingServiceIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
/**
 *
 * @author matheusoliveira
 */
@Named("bookingBean")
@RequestScoped
public class BookingBean extends AbstractBean{
    
    @Inject
    private BookingServiceIF bookingService;
    
   @Inject
   @QualifierBooking
   private IdentifiableBiblio booking;
    
    public BookingBean(){
    }
    
    public IdentifiableBiblio getBooking(){
        return booking;
    }
    
    public void setBooking(Booking booking){
        this.booking = booking;
    }
    
    @Override
    public InterfaceCrudService getService() {
        return this.bookingService;
    }

    @Override
    public IdentifiableBiblio getIdentifiableBiblio() {
        return this.booking;
    }
    
    @Override
    public void limparForm(){
        setBooking(new Booking());
    }

}
