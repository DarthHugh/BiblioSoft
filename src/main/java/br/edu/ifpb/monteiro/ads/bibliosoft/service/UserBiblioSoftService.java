package br.edu.ifpb.monteiro.ads.bibliosoft.service;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.UserBibliosoft;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.AbstractDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.UserBibliosoftDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.UserBiblioSoftServiceIF;
import java.util.List;
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

    @Override
    public List<UserBibliosoft> getAll() {
        return this.userbibliosoftDAO.getAll();
    }

}
