
package br.edu.ifpb.monteiro.ads.bibliosoft.service;

import br.edu.ifpb.monteiro.ads.bibliosoft.dao.AuthorDAO;
import br.edu.ifpb.monteiro.ads.bibliosoft.entities.Author;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.InterfaceCrudService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author jefferson
 */
@Stateless
@LocalBean
public class AuthorService implements InterfaceCrudService<Author>{
    
    @EJB
    private AuthorDAO authorDAO;

    @Override
    public void save(Author author) {
        authorDAO.create(author);
    }

    @Override
    public void remove(Author author) {
        authorDAO.remove(author);
    }

    @Override
    public List getAll() {
        return authorDAO.findAll();
    }

    @Override
    public void update(Author author) {
        authorDAO.edit(author);
    }

   
    
    
}
