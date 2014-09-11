/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.bibliosoft.service;

import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.AbstractDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.MaterialDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierMaterialDAO;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.MaterialServiceIF;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author jefferson
 */
@RequestScoped
public class MaterialService extends AbstractService implements MaterialServiceIF{

    @Inject
    @QualifierMaterialDAO
    private MaterialDAOIF materialDAO;

    @Override
    protected AbstractDAOIF getDao() {
        return materialDAO;
    }


}
