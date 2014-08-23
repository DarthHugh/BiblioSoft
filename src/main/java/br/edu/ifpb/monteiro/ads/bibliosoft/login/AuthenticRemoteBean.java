package br.edu.ifpb.monteiro.ads.bibliosoft.login;

import br.edu.ifpb.monteiro.ads.bibliosoft.entities.UserBibliosoft;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vanderlan
 */
@Stateless
public class AuthenticRemoteBean implements AuthenticRemote {

    @PersistenceContext(unitName = "BIBLIOSOFT-PU")
    private EntityManager entityManager;

    @Override
    public boolean authentic(String login, String password) {

//        UserBibliosoft user = new UserBibliosoft();
//        user.setPassword(password);
//        user.setRegistration(login);
//
//        UserBibliosoft find = entityManager.find(UserBibliosoft.class, user);
//
//        if (find.getId() != null) {
//            return true;
//        } else {
//            return "admin".equals(login) && "admin".equals(password);
//
//        }
//
//    }
        return "admin".equals(login) && "admin".equals(password);

    }
}
