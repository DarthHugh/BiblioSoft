
package br.edu.ifpb.monteiro.ads.bibliosoft.service;

import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.AbstractDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.interfacedao.AuthorDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.AuthorServiceIF;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author jefferson
 */
@RequestScoped
public class AuthorService extends AbstractService implements AuthorServiceIF{
    
    @Inject
    private AuthorDAOIF authorDAO;
    
      @Override
    protected AbstractDAOIF getDao() {
        return authorDAO;
    }
}
