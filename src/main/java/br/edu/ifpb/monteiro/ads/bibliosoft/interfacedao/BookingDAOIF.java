/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Booking;
import java.util.List;

/**
 *
 * @author jefferson
 */
public interface BookingDAOIF {

    public void create(Booking booking);

    public void edit(Booking booking);

    public void remove(Booking booking);

    public Booking find(Object id);

    public List<Booking> findAll();

    public List<Booking> findRange(int[] range);

    public int count();
}
