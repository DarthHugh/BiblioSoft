/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.bibliosoft.entities;

import java.io.Serializable;

/**
 *
 * @author matheusoliveira
 */
public interface IdentifiableBiblio extends Serializable{
    
    public Long getId();
    public void setId(Long id);
}