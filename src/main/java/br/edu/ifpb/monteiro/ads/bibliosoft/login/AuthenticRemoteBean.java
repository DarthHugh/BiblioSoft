package br.edu.ifpb.monteiro.ads.bibliosoft.login;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.UserBibliosoft;
import br.edu.ifpb.monteiro.ads.bibliosoft.service.interfaces.UserBiblioSoftServiceIF;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
/**
 *
 * @author vanderlan
 */
@RequestScoped
public class AuthenticRemoteBean implements AuthenticRemote {

    @Inject
    private UserBiblioSoftServiceIF userServ;

    @Override
    public boolean authentic(String login, String password) {

        for (UserBibliosoft user : userServ.getAll()) {
            if (user.getRegistration().equals(login)
                    && user.getPassword().equals(password)) {
                return true;
            }
        }
        if( !(login.equals("admin")) ){
            return false;
        }
        return login.equals("admin") && password.equals("admin");
    }
}
