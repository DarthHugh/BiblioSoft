/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.bibliosoft.service;

import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierBookingDAO;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.AbstractDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.BookingDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.BookingServiceIF;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author matheusoliveira
 */
@RequestScoped
public class BookingService extends AbstractService implements BookingServiceIF{

    @Inject 
    @QualifierBookingDAO
    private BookingDAOIF bookingDAO;
            
    @Override
    protected AbstractDAOIF getDao() {
        return this.bookingDAO;
    }
    
}