/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.bibliosoft.util.implemetes;

import java.util.List;

/**
 *
 * @author jefferson
 */
public interface ServiceInterface<T> {
 
    public void add(T t);
    public List<T> getAll();
    
            
}
