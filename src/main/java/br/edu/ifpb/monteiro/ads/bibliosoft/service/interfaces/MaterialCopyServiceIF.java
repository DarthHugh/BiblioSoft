/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.MaterialCopy;
import java.util.List;

/**
 *
 * @author matheusoliveira
 */
public interface MaterialCopyServiceIF extends InterfaceCrudService{
    
    public List<MaterialCopy> findAllNotBorrowing();
}
