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
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
/**
 *
 * @author matheusoliveira
 */
@Named("bookingBean")
@RequestScoped
public class BookingBean implements Serializable{
    
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
    
    public void save(){
        bookingService.save(booking);
    }
    
}
