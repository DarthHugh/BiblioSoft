
package br.edu.ifpb.monteiro.ads.bibliosoft.service;

import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.AbstractDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.interfaces.AuthorDAOIF;
import br.edu.ifpb.monteiro.ads.bibliosoft.dao.qualifiers.QualifierAuthorDAO;
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
    @QualifierAuthorDAO
    private AuthorDAOIF authorDAO;
    
    @Override
    protected AbstractDAOIF getDao() {
        return authorDAO;
    }
}
