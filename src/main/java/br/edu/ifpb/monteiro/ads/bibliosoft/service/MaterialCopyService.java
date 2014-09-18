/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.service;

import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierMaterialCopyDAO;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.AbstractDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.MaterialCopyDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.MaterialCopyServiceIF;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author matheusoliveira
 */
@RequestScoped
public class MaterialCopyService extends AbstractService implements MaterialCopyServiceIF{

    @Inject
    @QualifierMaterialCopyDAO
    private MaterialCopyDAOIF materialCopyDao;
    @Override
    protected AbstractDAOIF getDao() {
        return this.materialCopyDao;
    }
    
}
