
package br.edu.ifpb.monteiro.ads.bibliosoft.service;

import br.edu.ifpb.monteiro.ads.bibliosoft.dao.UserBibliosoftDAO;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.UserBibliosoft;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jefferson
 */
@Stateless
@LocalBean
public class UserBiblioSoftService implements InterfaceCrudService<UserBibliosoft> {
    
    @EJB
    private UserBibliosoftDAO userbibliosoftDAO;
    
    @Override
    public List<UserBibliosoft> getAll () {
        return userbibliosoftDAO.findAll();
    }

    @Override
    public void save(UserBibliosoft userbibliosoft) {
        userbibliosoftDAO.create(userbibliosoft);
    }
    
    
    @Override
    public void remove(UserBibliosoft userbibliosoft) {
        userbibliosoftDAO.remove(userbibliosoft);
    }

    public void update(UserBibliosoft userbibliosoft) {
        userbibliosoftDAO.edit(userbibliosoft);
    }


}
