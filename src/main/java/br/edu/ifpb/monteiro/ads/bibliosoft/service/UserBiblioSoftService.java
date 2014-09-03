package br.edu.ifpb.monteiro.ads.bibliosoft.service;

import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.AbstractDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.UserBibliosoftDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.UserBiblioSoftServiceIF;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author jefferson
 */
@RequestScoped
public class UserBiblioSoftService extends AbstractService implements UserBiblioSoftServiceIF{
    
    @Inject
    private UserBibliosoftDAOIF userbibliosoftDAO;

    @Override
    protected AbstractDAOIF getDao() {
        return userbibliosoftDAO;
    }

}
