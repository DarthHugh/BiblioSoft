
package br.edu.ifpb.monteiro.ads.bibliosoft.login;

import javax.ejb.Remote;

/**
 *
 * @author vanderlan
 */
@Remote
public interface AuthenticRemote {
    
    public boolean authentic(String login, String password);
    
    
}
